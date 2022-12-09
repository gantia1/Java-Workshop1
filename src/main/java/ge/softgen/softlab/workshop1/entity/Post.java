package ge.softgen.softlab.workshop1.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDateTime;
public class Post {
    private Integer id;
    private String title;
    private String body;
    private Integer user_id;
    private LocalDateTime create_date;
}
