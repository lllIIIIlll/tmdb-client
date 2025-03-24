package net.ow.movie.tmdb.model.genre;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TMDBGenre {
    private Integer id;

    private String name;
}
