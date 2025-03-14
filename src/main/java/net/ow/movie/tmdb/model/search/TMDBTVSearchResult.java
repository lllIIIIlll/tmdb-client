package net.ow.movie.tmdb.model.search;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import net.ow.movie.tmdb.deserializer.ImagePathDeserializer;
import net.ow.movie.tmdb.serializer.ImagePathSerializer;
import net.ow.shared.jsonutils.deserializer.DateInstantDeserializer;
import net.ow.shared.jsonutils.serializer.DateInstantSerializer;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TMDBTVSearchResult extends TMDBSearchResult {
    private Boolean adult;

    private BigDecimal popularity;

    @JsonAlias("backdrop_path")
    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    private String backdropPath;

    private String overview;

    @JsonAlias("poster_path")
    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    private String posterPath;

    @JsonAlias("original_language")
    private String originalLanguage;

    @JsonAlias("genre_ids")
    private List<Integer> genreIds;

    private Boolean video;

    @JsonAlias("vote_average")
    private String voteAverage;

    @JsonAlias("vote_count")
    private String voteCount;

    private String name;

    @JsonAlias("original_name")
    private String originalName;

    @JsonAlias("first_air_date")
    @JsonSerialize(using = DateInstantSerializer.class)
    @JsonDeserialize(using = DateInstantDeserializer.class)
    private Instant firstAirDate;

    @JsonAlias("origin_country")
    private List<String> originCountry;
}
