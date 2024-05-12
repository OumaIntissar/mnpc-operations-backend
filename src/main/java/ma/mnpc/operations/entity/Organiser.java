package ma.mnpc.operations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
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
    private OrganizerComittee committee;
    @Enumerated(EnumType.STRING)
    private PostAtOrganisation postAtOrganization; //Chef de comité ou membre de comité


}
