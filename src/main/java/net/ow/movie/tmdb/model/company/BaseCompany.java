package net.ow.movie.tmdb.model.company;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class BaseCompany {
    private Integer id;

    @JsonAlias("logo_path")
    private String logoPath;

    private String name;

    @JsonAlias("origin_country")
    private String originCountry;
}
