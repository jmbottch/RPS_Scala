package RockPaperScissors

import AI.{CounterAI, MirrorAI, RandomAI, RepeatSuccessAI, RockAI}
import RockPaperScissors.Move.Move

import scala.annotation.tailrec

object Run {

  def main(args: Array[String]): Unit = {

    def createStaticAi(move: Move) : List[TurnResult] => Move = {
      def getMove(history: List[TurnResult]) : Move = {
        move
      }
      getMove

    }

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

    val getMovePlayer1 = scriptedAI(movesList)
    val getMovePlayer2 = createStaticAi(Move.ROCK)
    val rules = Rules.defaultRules _
    val game = new Game(getMovePlayer1, getMovePlayer2, rules)

    println("Starting Rock Paper Scissors Game")
    gameLoop(game)


    @tailrec
    def gameLoop(game: Game): Unit = {
      val turnResult = game.playTurn()
      println("Player 1: " + turnResult.movePlayer1)
      println("Player 2: " + turnResult.movePlayer2)
      println("Result: " + turnResult.result)
      println("Score: " + game.getScorePlayer1() + "-" + game.getScorePlayer2())

      println("Keep playing? Y/N")
      scala.io.StdIn.readLine().toUpperCase() match {
        case input if input == "Y" => gameLoop(game)
        case _ => println("Sorry?")
      }
    }
  }
}
