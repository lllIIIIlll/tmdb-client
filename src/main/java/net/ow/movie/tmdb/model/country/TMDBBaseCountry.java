package net.ow.movie.tmdb.model.country;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TMDBBaseCountry {
    @JsonAlias("iso_3166_1")
    private String iso31661;

    private String name;
}
