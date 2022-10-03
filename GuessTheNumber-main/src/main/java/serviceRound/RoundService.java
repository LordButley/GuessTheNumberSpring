package serviceRound;

import java.util.Collection;

import modelRound.Round;

public interface RoundService {
	
	Round createRound(Round round);
	
	Collection<Round> listRounds(Long id);

}
