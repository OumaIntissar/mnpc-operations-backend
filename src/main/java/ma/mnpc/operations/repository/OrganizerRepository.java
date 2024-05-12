package ma.mnpc.operations.repository;

import ma.mnpc.operations.entity.Organiser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizerRepository extends JpaRepository <Organiser, String> {
}
