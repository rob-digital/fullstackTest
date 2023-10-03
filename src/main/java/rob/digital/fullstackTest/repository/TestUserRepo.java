package rob.digital.fullstackTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rob.digital.fullstackTest.model.TestUser;

public interface TestUserRepo extends JpaRepository<TestUser, Long> {


}
