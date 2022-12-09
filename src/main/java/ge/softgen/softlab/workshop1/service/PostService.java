package ge.softgen.softlab.workshop1.service;

import ge.softgen.softlab.workshop1.entity.Post;
import ge.softgen.softlab.workshop1.entity.PostSearchParams;

import java.util.List;

public interface PostService {

    List<Post> getAll (PostSearchParams searchParams);
    Post add (Post post);
    Post getPost (int id);
    Post update (int id, Post post);
    void delete(int id);
}
