package net.ow.movie.tmdb.model.movie;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import lombok.Data;
import net.ow.movie.tmdb.deserializer.ImagePathDeserializer;
import net.ow.movie.tmdb.model.collection.BaseCollection;
import net.ow.movie.tmdb.model.company.BaseCompany;
import net.ow.movie.tmdb.model.country.Country;
import net.ow.movie.tmdb.model.genre.Genre;
import net.ow.movie.tmdb.model.language.Language;
import net.ow.movie.tmdb.serializer.ImagePathSerializer;
import net.ow.shared.jsonutils.deserializer.DateInstantDeserializer;
import net.ow.shared.jsonutils.serializer.DateInstantSerializer;

@Data
public class Movie {
    private Boolean adult;

    @JsonAlias("backdrop_path")
    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    private String backdropPath;

    @JsonAlias("belongs_to_collection")
    private BaseCollection belongsToCollection;

    private BigDecimal budget;

    private List<Genre> genres;

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
    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    private String posterPath;

    @JsonAlias("production_companies")
    private List<BaseCompany> productionCompanies;

    @JsonAlias("production_countries")
    private List<Country> productionCountries;

    @JsonAlias("release_date")
    @JsonSerialize(using = DateInstantSerializer.class)
    @JsonDeserialize(using = DateInstantDeserializer.class)
    private Instant releaseDate;

    private BigDecimal revenue;

    private Integer runtime;

    @JsonAlias("spoken_languages")
    private List<Language> spokenLanguages;

    private String status;

    private String tagline;

    private String title;

    private Boolean video;

    @JsonAlias("vote_average")
    private BigDecimal voteAverage;

    @JsonAlias("vote_count")
    private Integer voteCount;
}
