package serviceRound;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import modelRound.Round;

@Repository
public interface RoundRepository extends CrudRepository<Round, Long> {}
