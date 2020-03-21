package RockPaperScissors

import RockPaperScissors.Move.Move
import RockPaperScissors.Result.Result

class Game(getMovePlayer1: (List[TurnResult]) => Move, getMovePlayer2: (List[TurnResult]) => Move, getResult: (Move, Move) => Result) {
  private var scorePlayer1, scorePlayer2 = 0
  private var turnHistory: List[TurnResult] = List[TurnResult]();

  def getScorePlayer1(): Int = scorePlayer1
  def getScorePlayer2(): Int = scorePlayer2

  def playTurn(): TurnResult = {
    val movePlayer1 = getMovePlayer1(turnHistory)
    val movePlayer2 = getMovePlayer2(turnHistory.map(_.invert))

    val result = getResult(movePlayer1, movePlayer2)

    result match {
      case Result.PLAYER1_WON => scorePlayer1 += 1
      case Result.PLAYER2_WON => scorePlayer2 += 1
      case Result.TIE => {}
    }

    val turnResult = new TurnResult(movePlayer1, movePlayer2, result)
    turnHistory = turnResult :: turnHistory
    turnResult
  }
}
