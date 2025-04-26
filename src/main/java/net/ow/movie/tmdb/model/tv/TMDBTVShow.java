package net.ow.movie.tmdb.model.tv;

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
import net.ow.movie.tmdb.deserializer.ImagePathDeserializer;
import net.ow.movie.tmdb.model.common.TMDBPaginatedResponse;
import net.ow.movie.tmdb.model.company.TMDBBaseCompany;
import net.ow.movie.tmdb.model.country.TMDBCountry;
import net.ow.movie.tmdb.model.genre.TMDBGenre;
import net.ow.movie.tmdb.model.language.TMDBLanguage;
import net.ow.movie.tmdb.model.network.TMDBNetwork;
import net.ow.movie.tmdb.model.person.TMDBCast;
import net.ow.movie.tmdb.model.person.TMDBCreator;
import net.ow.movie.tmdb.model.person.TMDBCredits;
import net.ow.movie.tmdb.serializer.ImagePathSerializer;
import net.ow.shared.jsonutils.deserializer.DateInstantDeserializer;
import net.ow.shared.jsonutils.serializer.DateInstantSerializer;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TMDBTVShow {
    private Boolean adult;

    @JsonAlias("backdrop_path")
    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    private String backdropPath;

    @JsonAlias("created_by")
    List<TMDBCreator> createdBy;

    @JsonAlias("episode_run_time")
    private List<Integer> episodeRunTime;

    @JsonAlias("first_air_date")
    @JsonSerialize(using = DateInstantSerializer.class)
    @JsonDeserialize(using = DateInstantDeserializer.class)
    private Instant firstAirDate;

    private List<TMDBGenre> genres;

    private String homepage;

    private Integer id;

    @JsonAlias("in_production")
    private Boolean inProduction;

    @JsonAlias("languages")
    private List<String> languages;

    @JsonAlias("last_air_date")
    @JsonSerialize(using = DateInstantSerializer.class)
    @JsonDeserialize(using = DateInstantDeserializer.class)
    private Instant lastAirDate;

    @JsonAlias("last_episode_to_air")
    private TMDBBaseTVEpisode lastEpisodeToAir;

    @JsonAlias("name")
    private String name;

    @JsonAlias("next_episode_to_air")
    private TMDBBaseTVEpisode nextEpisodeToAir;

    @JsonAlias("networks")
    private List<TMDBNetwork> networks;

    @JsonAlias("number_of_episodes")
    private Integer numberOfEpisodes;

    @JsonAlias("number_of_seasons")
    private Integer numberOfSeasons;

    @JsonAlias("original_language")
    private String originCountry;

    @JsonAlias("original_language")
    private String originalLanguage;

    @JsonAlias("original_name")
    private String originalName;

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

    private List<TMDBBaseTVSeason> seasons;

    @JsonAlias("spoken_languages")
    private List<TMDBLanguage> spokenLanguages;

    private String status;

    private String tagline;

    private String type;

    @JsonAlias("vote_average")
    private BigDecimal voteAverage;

    @JsonAlias("vote_count")
    private Integer voteCount;

    private TMDBCredits credits;

    private TMDBPaginatedResponse<TMDBBaseTVShow> recommendations;

    public List<TMDBBaseTVShow> getRecommendations() {
        return Optional.ofNullable(recommendations)
                .map(TMDBPaginatedResponse::getResults)
                .orElseGet(Collections::emptyList);
    }

    public List<TMDBCast> getCast() {
        return Optional.ofNullable(credits)
                .map(TMDBCredits::getCast)
                .orElseGet(Collections::emptyList);
    }
}
