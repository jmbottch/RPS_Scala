//import Move.Move
//
//  //this player can enter a move in the console
//  object ConsolePlayer {
//    def getMove(history : List[TurnResult]): Move = {
//      Move.stringToEnum(scala.io.StdIn.readLine("\nPlease enter a move:\nOptions: Rock, Paper, Scissors\nMove: "))
//    };
//  }
//
//  //Random AI, this player returns a random move
//  object RandomAI {
//    def getMove(history : List[TurnResult]): Move = {
//      if(history.isEmpty) {
//        Move.ROCK
//      } else if(history.head.getMovePlayer2() == Move.ROCK) {
//        Move.PAPER
//      } else if(history.head.getMovePlayer2() == Move.PAPER) {
//        Move.SCISSORS
//      } else if (history.head.getMovePlayer2() == Move.SCISSORS) {
//        Move.ROCK
//      } else {
//        history.head.getMovePlayer2()
//      }
//    }
//  }
//
//  //this player always plays rock..
//  object RockAI {
//    def getMove(history : List[TurnResult]): Move = {
//      if(history == List()) {
//        Move.ROCK
//      } else {
//        history.head.getMovePlayer2()
//      }
//    }
//  }
//
//
