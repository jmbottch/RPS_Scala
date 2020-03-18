val amountOfDrinks = List(3, 2, 4) //2 cola, 2 L Beer, 4 Gin-Tonic
val pricePerDrink = List(2.25, 3.5, 9.75) //cola cost 2, L Beer costs 3, Gin-Tonic costs 9


def matchAmountToPrice(amounts: List[Int], prices: List[Int]): List[(Int, Int)] = {
  amounts.zip(prices)
}

def calculatePrice(amounts: List[Int], prices: List[Double], f: ((Int, Double)) => Double): Double = {
  var total = 0.0
  for (t <- amounts.zip(prices)) {
    total += f(t)
  }
  total
}

def fullPrice(t: (Int, Double)): Double = {
  val (amount, price) = t
  amount * price
}

def tenPercentDiscount(t: (Int, Double)) : Double = {
  val newPrice : Double = fullPrice(t) * 0.9
  newPrice
}

def secondFree(t: (Int, Double)) : Double = {
  val (amount, price) = t
  val newprice = Math.ceil(amount / 2.0) * price
  newprice

}

println("De volle mep: " + calculatePrice(amountOfDrinks, pricePerDrink, fullPrice))
println("Tien procent korting:" + calculatePrice(amountOfDrinks, pricePerDrink, tenPercentDiscount))
println("Tweede drankje gratis: " + calculatePrice(amountOfDrinks, pricePerDrink, secondFree))





