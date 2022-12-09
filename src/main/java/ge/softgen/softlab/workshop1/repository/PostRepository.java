package ge.softgen.softlab.workshop1.repository;

import ge.softgen.softlab.workshop1.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
