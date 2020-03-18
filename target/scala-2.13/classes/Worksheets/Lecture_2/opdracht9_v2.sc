val fullPrice = (amount : Int, price : Double) => amount * price
val discount = (amount : Int, price: Double) => (amount * price) * 0.9
val happyHour = (amount : Int, price: Double) => math.ceil(amount / 2.0) * price

val amountOfDrinks = List(3, 2, 4) //2 cola, 2 L Beer, 4 Gin-Tonic
val pricePerDrink = List(2.25, 3.5, 9.75) //cola cost 2, L Beer costs 3, Gin-Tonic costs 9


def computePrice(amounts: List[Int], prices : List[Double], priceStrategy : (Int, Double) => Double) : Double = {
  if (amounts == Nil) {
    0
  } else {
    val amount :: amountTail = amounts
    val price :: priceTail = prices

    priceStrategy(amount, price) + computePrice(amountTail, priceTail, priceStrategy)
  }
}

computePrice(amountOfDrinks, pricePerDrink, happyHour)