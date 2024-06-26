package ma.mnpc.operations.repository;

import ma.mnpc.operations.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository <Organization, Long> {
}
