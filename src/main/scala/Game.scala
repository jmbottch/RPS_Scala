import Move.Move
import Result.Result

class Game(player1: (List[TurnResult]) => Move, player2 : (List[TurnResult]) => Move, rules : (Move, Move) => Result) {

  var scoreP1 : Int = 0;
  var scoreP2 : Int = 0;
  private var turnHistory : List[TurnResult] = List()
  private var player2History: List[TurnResult] = List()

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
    val turn = new TurnResult(player1(turnHistory), player2(player2History), rules)
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

    player2History = turn.invertResult()::player2History
    turnHistory = turn :: turnHistory
    turn
  }
  def printScores() = {
    println("\nTotal scores:\n\nPlayer 1: "+ scoreP1 + "\nPlayer 2: " + scoreP2)
    println("\n\nHistory:\n")
    var i : Int = 0
    var j : Int = 0
    println("results in p1 perspective, p1 is here p1")
    for(result <- turnHistory) {
      i += 1
      println("Result " + i + ": \nMove Player 1: " + result.getMovePlayer1() + "\nMove Player 2: " + result.getMovePlayer2() + "\n\n")
    }

    println("results in p2 perspective, p1 is here p2")
    for(result <- player2History) {
      j += 1
      println("Result " + i + ": \nMove Player 1: " + result.getMovePlayer1() + "\nMove Player 2: " + result.getMovePlayer2() + "\n\n")
    }
  }
}