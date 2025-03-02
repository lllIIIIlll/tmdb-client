package net.ow.movie.tmdb.model.language;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Language {
    @JsonAlias("english_name")
    private String englishName;

    @JsonAlias("iso_639_1")
    private String iso6391;

    private String name;
}
