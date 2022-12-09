package ge.softgen.softlab.workshop1.service;

import ge.softgen.softlab.workshop1.entity.User;
import ge.softgen.softlab.workshop1.entity.UserSearchParams;

import java.util.List;
public interface UserService {
    List<User> getAll(UserSearchParams searchParams);
    User add(User user);
    User getUser(int id);
    User update(int id, User user);
}
