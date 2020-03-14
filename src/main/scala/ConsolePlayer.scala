import Move.Move

case object ConsolePlayer {
    def getMove(): Move = {
      Move.stringToEnum(scala.io.StdIn.readLine("\nPlease enter a move:\nOptions: Rock, Paper, Scissors\nMove: "))
    };
}
