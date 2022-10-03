package serviceGame;

import modelGame.Game;

public interface GameService {
	
	Game createGame(Game game);
	
	Game findGame(Long id);
	
	Iterable<Game> listGames();
	
	Game endGame(Long id);
}
