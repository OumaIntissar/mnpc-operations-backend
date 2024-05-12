package ma.mnpc.operations.repository;

import ma.mnpc.operations.entity.Institution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionRepository extends JpaRepository <Institution, String> {
}
