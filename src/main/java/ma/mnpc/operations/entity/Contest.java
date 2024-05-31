package ma.mnpc.operations.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contest {
    @Id
    private String id; //shortName + Year
    @Column(length = 30)
    private String shortName;
    @Column(length =200)
    private String fullName;
    private String description;
    private LocalDate officialContestDateStart;
    private LocalDate officialContestDateEnd;
    @ManyToOne
    private Institution host_institution;
    @ManyToOne
    private Organization organization;
    private LocalDate preRegistrationDeadline;
    private LocalDate qualificationRoundDate;
    private LocalDate confirmationByPaymentDeadline;
    private Long registrationFees;
    @Enumerated(EnumType.STRING)
    @Column(length =20)
    private ContestStatus status;
    private Long officialTeamsSpots;
    private Long nonOfficialTeamsSpots;
}
