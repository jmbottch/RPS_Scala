import Move.Move

class Game(player1: () => Move, player2 : () => Move) {

  var scoreP1 : Int = 0;
  var scoreP2 : Int = 0;

  def StartGameLoop() = {
    var playing: Boolean = true
    println("Avans Rock, Paper & Scissors:\n")
    while(playing) {
      scala.io.StdIn.readLine("\nEnter action (write help for options): \n").toLowerCase() match {
        case "new" => PlayTurn()
        case "exit" => playing = false
        case "scores" => printScores()
        case "help" => println("Possible actions: New, Score, Exit, Help")
        case error => println("Action not recognized")
      }
    }
  }

  def PlayTurn(): TurnResult = {
    val turn = new TurnResult(player1, player2)
    println("\nPlayer One chose \"" + turn.getMovePlayer1() + "\" and player Two chose \"" + turn.getMovePlayer2() + "\".")
    val result = turn.getResult()
    result match {
      case Result.PLAYER1_WON => {
        scoreP1 += 1
        println("Player 1 has won and was awarded a point.")
      }
      case Result.PLAYER2_WON => {
        scoreP2 += 1
        println("Player 2 has won and was awarded a point..")
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
    println("\nTotal scores:\n\nPlayer 1: "+ scoreP1 + "\nPlayer 2: " + scoreP2)
  }


  def consolePlayerMove() : Move = {
    Move.stringToEnum(scala.io.StdIn.readLine("\nPlease enter a move " + ":\nOptions: Rock, Paper, Scissors\nMove: "))
  }

  def RockAIMove() : Move = {
    Move.ROCK
  }

  def randomAIMove() : Move = {
    val opponent = scala.util.Random.nextInt(3); //0=rock, 1=paper, 2=scissors
    opponent match {
      case 0 => Move.ROCK
      case 1 => Move.PAPER
      case 2 => Move.SCISSORS
      case err => Move.UNKNOWN
    }
  }

}