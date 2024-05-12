package ma.mnpc.operations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Contestant extends Users {
    private String currentAcademicYearJustif;
    private LocalDate uploadDateOfJustif;
    @ManyToOne
    private Institution institution;
    private Long firstYearAtInstitution;
    private String currentStudiesProgram;
    private Long currentSemester;

}
