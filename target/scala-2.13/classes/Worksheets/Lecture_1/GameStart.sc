var p1 = ConsolePlayer
var p2 = RockAI
var game1 = new Game(p1.getMove, p2.getMove, Rules.getDefaultRules())
//var game2 = new Game(p1.getMove, p2.getMove, Rules.getTieToWin())
game1.StartGameLoop()