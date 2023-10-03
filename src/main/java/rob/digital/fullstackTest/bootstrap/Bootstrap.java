package rob.digital.fullstackTest.bootstrap;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rob.digital.fullstackTest.model.TestUser;
import rob.digital.fullstackTest.repository.TestUserRepo;

@Component
@RequiredArgsConstructor
public class Bootstrap implements CommandLineRunner {
    private final TestUserRepo testUserRepo;

    @Override
    public void run(String... args) throws Exception {

        var user1 = TestUser.builder().name("Sponge Bob").build();
        var user2 = TestUser.builder().name("Mike Tyson").build();
        var user3 = TestUser.builder().name("Galileo").build();

        testUserRepo.save(user1);
        testUserRepo.save(user2);
        testUserRepo.save(user3);
    }
}
