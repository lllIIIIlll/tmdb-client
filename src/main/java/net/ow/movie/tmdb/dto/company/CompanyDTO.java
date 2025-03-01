package net.ow.movie.tmdb.dto.company;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class CompanyDTO {
    private Integer id;

    @JsonAlias("logo_path")
    private String logoPath;

    private String name;

    @JsonAlias("origin_country")
    private String originCountry;
}
