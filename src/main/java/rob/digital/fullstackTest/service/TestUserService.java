package rob.digital.fullstackTest.service;

import rob.digital.fullstackTest.dto.IncomingUser;
import rob.digital.fullstackTest.model.TestUser;

import java.util.List;
import java.util.Optional;

public interface TestUserService {
    List<TestUser> fetchAllUsers();

    Optional<TestUser> singleUSer(Long id);

//    TestUser findUSerByID(Integer id);

    void insertUser(IncomingUser user);

}
