package net.ow.movie.tmdb.model.language;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TMDBLanguage {
    @JsonAlias("english_name")
    private String englishName;

    @JsonAlias("iso_639_1")
    private String iso6391;

    private String name;
}
