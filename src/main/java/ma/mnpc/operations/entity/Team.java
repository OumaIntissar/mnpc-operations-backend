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
    private String participationStatus; //incompleted, disqualified; qualification round; official contest .. to think about the possible status
    private Long qualificationRoundRank;
    private Long officialContestRank;
}
