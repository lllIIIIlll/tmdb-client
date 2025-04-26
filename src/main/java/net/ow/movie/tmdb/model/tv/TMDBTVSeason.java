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
import net.ow.movie.tmdb.model.person.TMDBCast;
import net.ow.movie.tmdb.model.person.TMDBCredits;
import net.ow.movie.tmdb.serializer.ImagePathSerializer;
import net.ow.shared.jsonutils.deserializer.DateInstantDeserializer;
import net.ow.shared.jsonutils.serializer.DateInstantSerializer;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TMDBTVSeason {
    @JsonAlias("_id")
    private String internalId;

    @JsonAlias("air_date")
    @JsonSerialize(using = DateInstantSerializer.class)
    @JsonDeserialize(using = DateInstantDeserializer.class)
    private Instant airDate;

    private List<TMDBTVEpisode> episodes;

    private String name;

    private String overview;

    private Integer id;

    @JsonAlias("poster_path")
    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    private String posterPath;

    @JsonAlias("season_number")
    private Integer seasonNumber;

    @JsonAlias("vote_average")
    private BigDecimal voteAverage;

    private TMDBCredits credits;

    public List<TMDBCast> getCast() {
        return Optional.ofNullable(credits)
                .map(TMDBCredits::getCast)
                .orElseGet(Collections::emptyList);
    }

    public Integer getEpisodeCount() {
        return Optional.ofNullable(episodes).map(List::size).orElse(0);
    }
}
