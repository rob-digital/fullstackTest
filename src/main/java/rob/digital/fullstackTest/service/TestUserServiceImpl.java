package rob.digital.fullstackTest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rob.digital.fullstackTest.dto.IncomingUser;
import rob.digital.fullstackTest.model.TestUser;
import rob.digital.fullstackTest.repository.TestUserRepo;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TestUserServiceImpl implements TestUserService {

    private final TestUserRepo testUserRepo;
    @Override
    public List<TestUser> fetchAllUsers() {
        return testUserRepo.findAll();
    }

    @Override
    public Optional<TestUser> singleUSer(Long id) {
        return testUserRepo.findById(id);
    }

    @Override
    public void insertUser(IncomingUser user) {

        var newUser = TestUser.builder().name(user.getName()).build();

        testUserRepo.save(newUser);
    }

//    @Override
//    public TestUser findUSerByID(Integer id) {
//        return testUserRepo.findOne(id);
//    }

}
