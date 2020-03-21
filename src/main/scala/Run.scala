package RockPaperScissors

import RockPaperScissors.AI.{CounterAI, MirrorAI, RandomAI, RepeatSuccessAI}

import scala.annotation.tailrec

object Run {

  def main(args: Array[String]): Unit = {
    val getMovePlayer1 = ConsolePlayer.getMove _
    val getMovePlayer2 = CounterAI.getMove _
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
