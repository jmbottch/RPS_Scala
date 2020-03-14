import Move.Move

class ConsolePlayer(name: String) extends Player {
    setName(name)
    def getMove(): Move = {
      Move.stringToEnum(scala.io.StdIn.readLine("\nPlease enter a move " + name + ":\nOptions: Rock, Paper, Scissors\nMove: "))
    };
}
