package serviceGame;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import modelGame.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {}
