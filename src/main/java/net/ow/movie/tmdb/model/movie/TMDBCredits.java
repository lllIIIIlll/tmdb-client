package net.ow.movie.tmdb.model.movie;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.ow.movie.tmdb.model.person.TMDBCast;
import net.ow.movie.tmdb.model.person.TMDBCrew;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TMDBCredits {
    private Integer id;

    private List<TMDBCast> cast;

    private List<TMDBCrew> crew;
}
