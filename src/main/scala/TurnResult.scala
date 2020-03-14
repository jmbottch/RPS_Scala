import Move.Move
import Result.Result

class TurnResult(movePlayer1: Move, movePlayer2: Move, rules: (Move, Move) => Result) {


  def getMovePlayer1(): Move = {
    movePlayer1
  }

  def getMovePlayer2(): Move = {
    movePlayer2
  }

  def getResult(): Result = {
    rules(movePlayer1, movePlayer2)
  }

  def invertResult(): TurnResult = {
    new TurnResult(movePlayer2, movePlayer1, rules)
  }

}
