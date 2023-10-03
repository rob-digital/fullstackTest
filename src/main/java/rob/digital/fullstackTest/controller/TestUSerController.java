package rob.digital.fullstackTest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rob.digital.fullstackTest.dto.IncomingUser;
import rob.digital.fullstackTest.model.TestUser;
import rob.digital.fullstackTest.service.TestUserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/testuser")
public class TestUSerController {

    private final TestUserService userService;

    @RequestMapping("/all")
    public List<TestUser> allUsers() {
        return userService.fetchAllUsers();
    }

    @RequestMapping("/{userId}")
    public Optional<TestUser> singleUser(@PathVariable("userId") Long userId) {
        return userService.singleUSer(userId);
    }

    @PostMapping("/insert/")
    public ResponseEntity<IncomingUser> addUser(@RequestBody IncomingUser user) {
        userService.insertUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
