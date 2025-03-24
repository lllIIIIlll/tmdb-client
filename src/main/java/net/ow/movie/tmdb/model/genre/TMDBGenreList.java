package net.ow.movie.tmdb.model.genre;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TMDBGenreList {
    private List<TMDBGenre> genres;
}
