package ma.mnpc.operations.entity;

import jakarta.persistence.Column;
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
    @Column(length =100)
    private String name;
    @Column(length =100)
    private String officialWebSiteUrl;
    @Column(length =30)
    private String city;
    @OneToMany
    private List<Contest> contests;
}
