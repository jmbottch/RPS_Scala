import Move.Move

case object RandomAI {
  def getMove(): Move = {
    val opponent = scala.util.Random.nextInt(3); //0=rock, 1=paper, 2=scissors
    opponent match {
      case 0 => Move.ROCK
      case 1 => Move.PAPER
      case 2 => Move.SCISSORS
      case err => Move.UNKNOWN
    }
  }
}
