package ma.mnpc.operations.repository;

import ma.mnpc.operations.entity.Contestant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContestantRepository extends JpaRepository<Contestant, String> {
}
