package ma.mnpc.operations;

import ma.mnpc.operations.entity.*;
import ma.mnpc.operations.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private InstitutionRepository institutionRepository;
    @Autowired
    private ContestRepository contestRepository;
    @Autowired
    private ContestantRepository contestantRepository;
    @Autowired
    private CoachRepository coachRepository;
    @Autowired
    private TeamRepository teamRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {

        /*
        To create a team I need to create:
        - Institution
        - Contest
        - 3 contestants
        - Coach
        - Team
         */


        Institution institution = new Institution("ENSA-Casa", "ENSA", "Ecole nationale des arts et metiers", "CASABLANCA", InstitutionType.ECOLE_SUPERIEURE, "exactLocationURL", 87L);
        institutionRepository.save(institution);

        Contest contest = new Contest("MNPC23", "MNPC", "Moroccan National Programming Contest", "Moroccan programming contest about university students", LocalDate.now(), LocalDate.now(), institution, null, LocalDate.now(), LocalDate.now(), LocalDate.now(), 300L, ContestStatus.COMING_SOON, 98L, 2L);
        contestRepository.save(contest);

        Contestant contestant1 = Contestant.builder().cinID("BHA23").firstName("Yahya").lastName("Asmarani").currentSemester(2L).institution(institution).build();

        Contestant contestant2 = Contestant.builder().cinID("BHA223").firstName("Amal").lastName("Hamzaoui").currentSemester(2L).institution(institution).build();

        Contestant contestant3 = Contestant.builder().cinID("BHA123").firstName("Laila").lastName("Yahyaoui").currentSemester(2L).institution(institution).build();

        List<Contestant> contestants = new ArrayList<>();
        contestants.add(contestant1);
        contestants.add(contestant2);
        contestants.add(contestant3);

        contestantRepository.saveAll(contestants);

        Coach coach = Coach.builder().cinID("ABCDSG").firstName("Hamo").lastName("Rabi").status(CoachStatus.ALUMNI).build();
        coachRepository.save(coach);

        Team team = new Team(1L, "Team team", contest, contestants, coach, institution, contestant1, "Payment", null, null, null);

        teamRepository.save(team);


    }
}
