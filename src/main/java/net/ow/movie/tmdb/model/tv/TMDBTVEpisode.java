package net.ow.movie.tmdb.model.tv;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.ow.movie.tmdb.deserializer.ImagePathDeserializer;
import net.ow.movie.tmdb.model.person.TMDBCrew;
import net.ow.movie.tmdb.model.person.TMDBGuestStar;
import net.ow.movie.tmdb.serializer.ImagePathSerializer;
import net.ow.shared.jsonutils.deserializer.DateInstantDeserializer;
import net.ow.shared.jsonutils.serializer.DateInstantSerializer;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TMDBTVEpisode {
    @JsonAlias("air_date")
    @JsonSerialize(using = DateInstantSerializer.class)
    @JsonDeserialize(using = DateInstantDeserializer.class)
    private Instant airDate;

    private List<TMDBCrew> crew;

    @JsonAlias("episode_number")
    private Integer episodeNumber;

    @JsonAlias("guest_stars")
    private List<TMDBGuestStar> guestStars;

    private String name;

    private String overview;

    private Integer id;

    @JsonAlias("production_code")
    private String productCode;

    @JsonAlias("season_number")
    private Integer seasonNumber;

    @JsonAlias("still_path")
    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    private String stillPath;

    @JsonAlias("vote_average")
    private BigDecimal voteAverage;

    @JsonAlias("vote_count")
    private Integer voteCount;
}
