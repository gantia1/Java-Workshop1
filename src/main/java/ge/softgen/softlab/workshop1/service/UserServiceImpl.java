package ge.softgen.softlab.workshop1.service;


import ge.softgen.softlab.workshop1.entity.User;
import ge.softgen.softlab.workshop1.entity.UserSearchParams;
import ge.softgen.softlab.workshop1.exception.NotFoundException;
import ge.softgen.softlab.workshop1.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll(UserSearchParams userSearchParams) {
        return userRepository.findAll();
    }

    public User add(User user) {
        user.setId(null);
        return userRepository.save(user);
    }

    public User getUser(int id) {
        if (id < 1) {
            throw new InvalidParameterException("Id must be positive integer");
        }
        return userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User not found"));
    }

    public User update(int id, User user) {
        var foundUser = getUser(id);
        foundUser.setUsername(user.getUsername());
        foundUser.setPassword(user.getPassword());
        foundUser.setEmail(user.getEmail());
        foundUser.setCreate_date(user.getCreate_date());
        return userRepository.save(foundUser);
    }
}
