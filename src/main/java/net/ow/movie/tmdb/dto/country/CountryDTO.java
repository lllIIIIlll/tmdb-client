package net.ow.movie.tmdb.dto.country;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class CountryDTO {
    @JsonAlias("iso_3166_1")
    private String iso31661;

    private String name;
}
