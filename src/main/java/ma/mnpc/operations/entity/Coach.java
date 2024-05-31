package ma.mnpc.operations.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Fetch;


@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Coach extends Users {
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private CoachStatus status;
    @ManyToOne
    private Institution institution;

}
