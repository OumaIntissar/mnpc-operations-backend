package ma.mnpc.operations.repository;

import ma.mnpc.operations.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository <Team, Long> {
}
