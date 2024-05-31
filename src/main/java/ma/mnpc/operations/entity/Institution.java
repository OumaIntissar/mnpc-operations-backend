package ma.mnpc.operations.entity;

import jakarta.persistence.*;
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
    @Column(length =20)
    private String shortName;
    @Column(length =100)
    private String name;
    @Column(length =30)
    private String city;
    @Enumerated(EnumType.STRING)
    @Column(length =30)
    private InstitutionType institutionType; //High school, etude before bac, Classe prepa, ecole superieure, université
    private String exactLocation; //Google Maps Link
    private Long possibleSpots;
}
