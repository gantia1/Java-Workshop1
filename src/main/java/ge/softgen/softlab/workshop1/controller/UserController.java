package ge.softgen.softlab.workshop1.controller;

import ge.softgen.softlab.workshop1.entity.User;
import ge.softgen.softlab.workshop1.entity.UserSearchParams;
import ge.softgen.softlab.workshop1.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getAll(UserSearchParams searchParams) {
        return userService.getAll(searchParams);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable int id) {
        return userService.getUser(id);
    }

    @PostMapping()
    public ResponseEntity<User> add(@RequestBody User user) {
        userService.add(user);
        var location = UriComponentsBuilder.fromPath("/users/" + user.getId()).build().toUri();
        return ResponseEntity.created(location).body(user);
    }

    @PutMapping("/{id}")
    public User update(@RequestBody User user, @PathVariable int id) {
        return userService.update(id, user);
    }

}
