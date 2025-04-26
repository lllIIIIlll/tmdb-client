package net.ow.movie.tmdb.model.person;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TMDBCredits {
    private Integer id;

    private List<TMDBCast> cast;

    private List<TMDBCrew> crew;
}
