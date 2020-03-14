class Game(player1: Player, player2: Player) {

  def StartGameLoop() = {
    var playing: Boolean = true
    println("Avans Rock, Paper & Scissors:\n")
    while(playing) {
      scala.io.StdIn.readLine("\nEnter action (write help for options): \n").toLowerCase() match {
        case "new" => PlayTurn()
        case "score" => printScores()
        case "exit" => playing = false
        case "help" => println("Possible actions: New, Score, Exit, Help")
        case error => println("Action not recognized")
      }
    }
  }

  def PlayTurn(): TurnResult = {
    val turn = new TurnResult(player1.getMove(), player2.getMove())
    println("\nPlayer One chose \"" + turn.getMovePlayer1() + "\" and player Two chose \"" + turn.getMovePlayer2() + "\".")
    val result = turn.getResult()
    result match {
      case Result.PLAYER1_WON => {
        player1.score += 1
        println(player1.name + " has won and was awarded with a point.")
      }
      case Result.PLAYER2_WON => {
        player2.score += 1
        println(player2.name + " has won and was awarded with a point.")
      }
      case Result.TIE => {
        println("It's a tie!")
      }
      case Result.UNKNOWN => {
        println("Unknown result, try again.")
      }
    }
    turn
  }

  def printScores() = {
    println("\nTotal scores:\n\n" + player1.name + ": " + player1.score + "\n" + player2.name + ": " + player2.score + "\n")
  }

}