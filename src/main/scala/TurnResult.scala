import Move.Move
import Result.Result

class TurnResult(movePlayer1: () => Move, movePlayer2: () => Move) {

  val moveP1 : Move = movePlayer1()
  val moveP2 : Move = movePlayer2()

  def getMovePlayer1(): Move = {
    moveP1
  }

  def getMovePlayer2(): Move = {
    moveP2
  }

  def getResult(): Result = {
    moveP1 match {
      case Move.ROCK => {
        if (moveP2 == Move.ROCK) Result.TIE
        else if (moveP2 == Move.PAPER) Result.PLAYER2_WON
        else if (moveP2 == Move.SCISSORS) Result.PLAYER1_WON
        else Result.UNKNOWN
      }
      case Move.PAPER => {
        if (moveP2 == Move.ROCK) Result.PLAYER1_WON
        else if (moveP2 == Move.PAPER) Result.TIE
        else if (moveP2 == Move.SCISSORS) Result.PLAYER2_WON
        else Result.UNKNOWN
      }
      case Move.SCISSORS => {
        if (moveP2 == Move.ROCK) Result.PLAYER2_WON
        else if (moveP2 == Move.PAPER) Result.PLAYER1_WON
        else if (moveP2 == Move.SCISSORS) Result.TIE
        else Result.UNKNOWN
      }
      case Move.UNKNOWN => Result.UNKNOWN
    }
  }

}
