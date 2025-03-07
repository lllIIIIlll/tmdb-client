package net.ow.movie.tmdb.model.movie;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Cast {
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

    @JsonAlias("cast_id")
    private Integer castId;

    private String character;

    @JsonAlias("credit_id")
    private String creditId;

    private Integer order;
}
