package ma.mnpc.operations.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@MappedSuperclass
public class Users {
    @Id
    private String cinID;
    private String password;
    @Column(length = 50)
    private String firstName;
    @Column(length = 50)
    private String lastName;
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Gender gender;
    @Column(length = 50)
    private String emailAddress;
    @Column(length = 30)
    private String phoneNumber;
    private LocalDate dateOfBirth;
    @Enumerated(EnumType.STRING)
    @Column(length = 5)
    private TshirtSize tShirtSize;

    //Type to be checked later
    @Column(length = 20)
    private String cinDocument;
    private String linkedInUrl;

}
