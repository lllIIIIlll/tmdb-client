package net.ow.movie.tmdb.model.movie;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.ow.movie.tmdb.constant.TMDBJob;
import net.ow.movie.tmdb.deserializer.ImagePathDeserializer;
import net.ow.movie.tmdb.model.collection.TMDBBaseCollection;
import net.ow.movie.tmdb.model.company.TMDBBaseCompany;
import net.ow.movie.tmdb.model.country.TMDBCountry;
import net.ow.movie.tmdb.model.genre.TMDBGenre;
import net.ow.movie.tmdb.model.language.TMDBLanguage;
import net.ow.movie.tmdb.model.person.TMDBCast;
import net.ow.movie.tmdb.model.person.TMDBCrew;
import net.ow.movie.tmdb.serializer.ImagePathSerializer;
import net.ow.shared.jsonutils.deserializer.DateInstantDeserializer;
import net.ow.shared.jsonutils.serializer.DateInstantSerializer;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TMDBMovie {
    private Boolean adult;

    @JsonAlias("backdrop_path")
    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    private String backdropPath;

    @JsonAlias("belongs_to_collection")
    private TMDBBaseCollection belongsToCollection;

    private BigDecimal budget;

    private List<TMDBGenre> genres;

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
    private List<TMDBBaseCompany> productionCompanies;

    @JsonAlias("production_countries")
    private List<TMDBCountry> productionCountries;

    @JsonAlias("release_date")
    @JsonSerialize(using = DateInstantSerializer.class)
    @JsonDeserialize(using = DateInstantDeserializer.class)
    private Instant releaseDate;

    private BigDecimal revenue;

    private Integer runtime;

    @JsonAlias("spoken_languages")
    private List<TMDBLanguage> spokenLanguages;

    private String status;

    private String tagline;

    private String title;

    private Boolean video;

    @JsonAlias("vote_average")
    private BigDecimal voteAverage;

    @JsonAlias(value = "vote_count")
    private Integer voteCount;

    private TMDBCredits credits;

    private List<TMDBBaseMovie> recommendations;

    public List<TMDBCast> getCast() {
        return Optional.ofNullable(credits)
                .map(TMDBCredits::getCast)
                .orElseGet(Collections::emptyList);
    }

    public TMDBCrew getCrew(String job) {
        return Optional.ofNullable(credits)
                .map(TMDBCredits::getCrew)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(crew -> crew.getJob().equals(job))
                .findFirst()
                .orElse(null);
    }

    public TMDBCrew getDirector() {
        return getCrew(TMDBJob.DIRECTOR);
    }

    public TMDBCrew getEditor() {
        return getCrew(TMDBJob.EDITOR);
    }
}
