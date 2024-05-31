package ma.mnpc.operations.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Organiser extends Users {
    @ManyToOne
    private Organization organization; //At a first time MACS
    @Enumerated(EnumType.STRING)
    @Column(length =20)
    private OrganizerComittee committee;
    @Enumerated(EnumType.STRING)
    @Column(length =30)
    private PostAtOrganisation postAtOrganization; //Chef de comité ou membre de comité


}
