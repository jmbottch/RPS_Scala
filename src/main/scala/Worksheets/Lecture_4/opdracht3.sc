//i square root of x (error when input is negative)
def sqrt(num: Either[Double, String]) : Either [Double, String] = {
  num match {
    case Left(value) if value < 0 => Right("Error, The input is negative")
    case Left(value) => Left(math.sqrt(value))
    case Right(err) => Right(err)
  }
}

//ii divide 10 by x
def divideNumByX(num: Either[Double, String], x : Double) : Either[Double, String] = {
  num match {
    case Left(value) if value == 0 => Right("Error, the input is zero")
    case Left(value) => Left( value / x)
    case Right(err) => Right(err)
  }
}

//ii divide 1 by x - 1
def divide1ByX(num: Either[Double, String]) : Either[Double, String] = {
  num match {
    case Left(value) if value == 1 => Right("Error, the input is zero")
    case Left(value) => Left(1/ (value-1)) //output -0.75
    //case Left(value) => Left(1/ value-1) //output 0.3333
    case Right(err) => Right(err)
  }
}

//result i
println("The SquareRoot of 4 = " + sqrt(Left(4)))
//result ii
println("10 / 4 = " + divideNumByX(Left(6), 4.0))
//result iii
println("1 / 4 = " + divide1ByX(Left(4)))