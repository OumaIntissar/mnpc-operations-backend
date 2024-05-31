package ma.mnpc.operations.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Team {
    @Id
    private Long id;
    @Column(length =100)
    private String teamName;
    @OneToOne
    private Contest contest;
    @OneToMany
    private List<Contestant> contestants;
    @OneToOne
    private Coach coach;
    @ManyToOne
    private Institution institution;
    @OneToOne
    private Contestant captain;
    private String paymentReceiptDoc;
    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private ParticipationStatus participationStatus;
    private Long qualificationRoundRank;
    private Long officialContestRank;
}
