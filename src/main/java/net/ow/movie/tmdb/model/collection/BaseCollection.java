package net.ow.movie.tmdb.model.collection;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class BaseCollection {
    private Integer id;

    private String name;

    @JsonAlias("poster_path")
    private String posterPath;

    @JsonAlias("backdrop_path")
    private String backdropPath;
}
