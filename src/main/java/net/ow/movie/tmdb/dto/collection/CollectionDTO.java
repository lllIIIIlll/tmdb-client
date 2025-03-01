package net.ow.movie.tmdb.dto.collection;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class CollectionDTO {
    private Integer id;

    private String name;

    @JsonAlias("poster_path")
    private String posterPath;

    @JsonAlias("backdrop_path")
    private String backdropPath;
}
