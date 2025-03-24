package net.ow.movie.tmdb.model.movie;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TMDBCredits {
    private Integer id;

    private List<TMDBCast> cast;

    private List<TMDBCrew> crew;
}
