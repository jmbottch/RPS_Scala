package RockPaperScissors

import RockPaperScissors.AI.{MirrorAI, RandomAI, RepeatSuccessAI}

import scala.annotation.tailrec

object Run {

  def main(args: Array[String]): Unit = {
    val getMovePlayer1 = ConsolePlayer.getMove _
    val getMovePlayer2 = RepeatSuccessAI.getMove _
    //val rules = Rules.defaultRules _
    val rules = Rules.defaultRules _
    val game = new Game(getMovePlayer1, getMovePlayer2, rules)

    println("Starting Rock Paper Scissors Game")
    gameLoop(game)
  }

  @tailrec
  def gameLoop(game: Game): Unit = {
          val turnResult = game.playTurn()
          println("Player 1: " + turnResult.movePlayer1)
          println("Player 2: " + turnResult.movePlayer2)
          println("Result: " + turnResult.result)
          println("Score: " + game.getScorePlayer1() + "-" + game.getScorePlayer2())

          println("Keep playing? Y/N")
          val response =  scala.io.StdIn.readLine()
          if(response == "Y")
            gameLoop(game)
  }
}
