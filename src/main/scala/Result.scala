object Result extends Enumeration {
  type Result = Value
  val PLAYER1_WON, PLAYER2_WON, TIE, UNKNOWN = Value

  def stringToEnum(name: String): Value =
    values.find(_.toString.toUpperCase() == name.toUpperCase()).getOrElse(UNKNOWN)
}
