import Move.Move
import Result.Result

class TurnResult(movePlayer1: () => Move, movePlayer2: () => Move) {

  def getMovePlayer1(): () => Move = {
    movePlayer1
  }

  def getMovePlayer2(): () => Move = {
    movePlayer2
  }

  def getResult(): Result = {
    movePlayer1 match {
      case Move.ROCK => {
        if (movePlayer2 == Move.ROCK) Result.TIE
        else if (movePlayer2 == Move.PAPER) Result.PLAYER2_WON
        else if (movePlayer2 == Move.SCISSORS) Result.PLAYER1_WON
        else Result.UNKNOWN
      }
      case Move.PAPER => {
        if (movePlayer2 == Move.ROCK) Result.PLAYER1_WON
        else if (movePlayer2 == Move.PAPER) Result.TIE
        else if (movePlayer2 == Move.SCISSORS) Result.PLAYER2_WON
        else Result.UNKNOWN
      }
      case Move.SCISSORS => {
        if (movePlayer2 == Move.ROCK) Result.PLAYER2_WON
        else if (movePlayer2 == Move.PAPER) Result.PLAYER1_WON
        else if (movePlayer2 == Move.SCISSORS) Result.TIE
        else Result.UNKNOWN
      }
      case Move.UNKNOWN => Result.UNKNOWN
    }
  }

}

class Game(player1: () => Move, player2: () => Move) {

  def StartGameLoop() = {
    var playing: Boolean = true
    println("Avans Rock, Paper & Scissors:\n")
    while(playing) {
      scala.io.StdIn.readLine("\nEnter action (write help for options): \n").toLowerCase() match {
        case "new" => PlayTurn()
        case "exit" => playing = false
        case "help" => println("Possible actions: New, Score, Exit, Help")
        case error => println("Action not recognized")
      }
    }
  }

  def PlayTurn(): TurnResult = {
    val turn = new TurnResult(player1: () => Move, player2: () => Move)
    println("\nPlayer One chose \"" + turn.getMovePlayer1() + "\" and player Two chose \"" + turn.getMovePlayer2() + "\".")
    val result = turn.getResult()
    result match {
      case Result.PLAYER1_WON => {
        println("Player 1 has won and was awarded with a point.")
      }
      case Result.PLAYER2_WON => {
        println(" has won and was awarded with a point.")
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