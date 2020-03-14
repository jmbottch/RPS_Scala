import Move.Move
import Result.Result

object Rules {

  def getDefaultRules() : (Move, Move) => Result = {
    defaultRules
  }

  def getTieToWin() : (Move, Move) => Result = {
    tieToWin
  }

  private def defaultRules(moveP1 : Move, moveP2 : Move) : Result = {
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

  private def tieToWin(moveP1 : Move, moveP2 : Move) : Result = {
    moveP1 match {
      case Move.ROCK => {
        if (moveP2 == Move.ROCK) Result.PLAYER1_WON
        else if (moveP2 == Move.PAPER) Result.PLAYER2_WON
        else if (moveP2 == Move.SCISSORS) Result.PLAYER2_WON
        else Result.UNKNOWN
      }
      case Move.PAPER => {
        if (moveP2 == Move.ROCK) Result.PLAYER2_WON
        else if (moveP2 == Move.PAPER) Result.PLAYER1_WON
        else if (moveP2 == Move.SCISSORS) Result.PLAYER2_WON
        else Result.UNKNOWN
      }
      case Move.SCISSORS => {
        if (moveP2 == Move.ROCK) Result.PLAYER2_WON
        else if (moveP2 == Move.PAPER) Result.PLAYER2_WON
        else if (moveP2 == Move.SCISSORS) Result.PLAYER1_WON
        else Result.UNKNOWN
      }
      case Move.UNKNOWN => Result.UNKNOWN
    }
  }
}
