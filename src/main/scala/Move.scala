object Move extends Enumeration {
  type Move = Value
  val ROCK, PAPER, SCISSORS, UNKNOWN = Value

  def stringToEnum(name: String): Value =
    values.find(_.toString.toUpperCase() == name.toUpperCase()).getOrElse(UNKNOWN)
}
