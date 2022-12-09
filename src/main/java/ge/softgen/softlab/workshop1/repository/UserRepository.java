package ge.softgen.softlab.workshop1.repository;

import ge.softgen.softlab.workshop1.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
