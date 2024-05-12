package ma.mnpc.operations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Institution {
    @Id
    private String id;
    private String shortName;
    private String name;
    private String city;

    private InstitutionType institutionType; //High school, etude before bac, Classe prepa, ecole superieure, université
    private String exactLocation; //Google Maps Link
    private Long possibleSpots;
}
