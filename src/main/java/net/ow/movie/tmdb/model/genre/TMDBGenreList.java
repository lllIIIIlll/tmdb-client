package net.ow.movie.tmdb.model.genre;

import java.util.List;
import lombok.Data;

@Data
public class TMDBGenreList {
    private List<TMDBGenre> genres;
}
