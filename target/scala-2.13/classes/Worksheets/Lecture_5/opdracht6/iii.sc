import RockPaperScissors.Move.Move
import RockPaperScissors.{Move, TurnResult}

val movesList : List[Move] = List(Move.ROCK, Move.PAPER, Move.SCISSORS, Move.PAPER, Move.SCISSORS)
def scriptedAI(list : List[Move]) : List[TurnResult] => Move = {
  var internalList = list
  def getMove(moves : List[TurnResult]) : Move = {
    internalList match {
      case head::Nil => head
      case head::tail => {
        internalList = tail
        head
      }
    }
  }
  getMove
}