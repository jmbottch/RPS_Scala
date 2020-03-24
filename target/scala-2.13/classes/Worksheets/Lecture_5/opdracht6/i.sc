
import RockPaperScissors.{Move, Rules}
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

    val getMovePlayer1 = createStaticAi(Move.PAPER)
    val getMovePlayer2 = createStaticAi(Move.ROCK)
    val rules = Rules.defaultRules _
//    val game = new Game(getMovePlayer1, getMovePlayer2, rules)

    println("Starting Rock Paper Scissors Game")
//    gameLoop(game)


//    @tailrec
//    def gameLoop(game: Game): Unit = {
//      val turnResult = game.playTurn()
//      println("Player 1: " + turnResult.movePlayer1)
//      println("Player 2: " + turnResult.movePlayer2)
//      println("Result: " + turnResult.result)
//      println("Score: " + game.getScorePlayer1() + "-" + game.getScorePlayer2())
//
//      println("Keep playing? Y/N")
//      scala.io.StdIn.readLine().toUpperCase() match {
//        case input if input == "Y" => gameLoop(game)
//        case _ => println("Sorry?")
//      }
//    }
  }
}