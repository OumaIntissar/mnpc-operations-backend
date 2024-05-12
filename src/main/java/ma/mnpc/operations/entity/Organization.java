package ma.mnpc.operations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Organization {
    @Id
    private Long id;
    private String name;
    private String officialWebSiteUrl;
    private String city;
    @OneToMany
    private List<Contest> contests;
}
