package net.ow.movie.tmdb.model.movie;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Crew {
    private Boolean adult;

    private Integer gender;

    private Integer id;

    @JsonAlias("known_for_department")
    private String knownForDepartment;

    private String name;

    @JsonAlias("original_name")
    private String originalName;

    private Double popularity;

    @JsonAlias("profile_path")
    private String profilePath;

    @JsonAlias("credit_id")
    private String creditId;

    private String department;

    private String job;
}
