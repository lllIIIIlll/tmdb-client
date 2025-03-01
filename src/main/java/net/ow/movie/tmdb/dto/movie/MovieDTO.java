package net.ow.movie.tmdb.dto.movie;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import lombok.Data;
import net.ow.movie.tmdb.dto.collection.CollectionDTO;
import net.ow.movie.tmdb.dto.company.CompanyDTO;
import net.ow.movie.tmdb.dto.country.CountryDTO;
import net.ow.movie.tmdb.dto.genre.GenreDTO;
import net.ow.movie.tmdb.dto.language.LanguageDTO;
import net.ow.shared.jsonutils.deserializer.DateInstantDeserializer;
import net.ow.shared.jsonutils.serializer.DateInstantSerializer;

@Data
public class MovieDTO {
    private Boolean adult;

    @JsonAlias("backdrop_path")
    private String backdropPath;

    @JsonAlias("belongs_to_collection")
    private CollectionDTO belongsToCollection;

    private BigDecimal budget;

    private List<GenreDTO> genres;

    private String homepage;

    private Integer id;

    @JsonAlias("imdb_id")
    private String imdbId;

    @JsonAlias("original_language")
    private String originalLanguage;

    @JsonAlias("original_title")
    private String originalTitle;

    private String overview;

    private BigDecimal popularity;

    @JsonAlias("poster_path")
    private String posterPath;

    @JsonAlias("production_companies")
    private List<CompanyDTO> productionCompanies;

    @JsonAlias("production_countries")
    private List<CountryDTO> productionCountries;

    @JsonAlias("release_date")
    @JsonSerialize(using = DateInstantSerializer.class)
    @JsonDeserialize(using = DateInstantDeserializer.class)
    private Instant releaseDate;

    private BigDecimal revenue;

    private Integer runtime;

    @JsonAlias("spoken_languages")
    private List<LanguageDTO> spokenLanguages;

    private String status;

    private String tagline;

    private String title;

    private Boolean video;

    @JsonAlias("vote_average")
    private BigDecimal voteAverage;

    @JsonAlias("vote_count")
    private Integer voteCount;
}
