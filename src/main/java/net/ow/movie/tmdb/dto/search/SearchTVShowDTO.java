package net.ow.movie.tmdb.dto.search;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import net.ow.shared.jsonutils.deserializer.DateInstantDeserializer;
import net.ow.shared.jsonutils.serializer.DateInstantSerializer;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SearchTVShowDTO extends SearchResultDTO {
    protected Boolean adult;

    protected BigDecimal popularity;

    @JsonAlias("backdrop_path")
    protected String backdropPath;

    protected String overview;

    @JsonAlias("poster_path")
    protected String posterPath;

    @JsonAlias("original_language")
    protected String originalLanguage;

    @JsonAlias("genre_ids")
    protected List<Integer> genreIds;

    protected Boolean video;

    @JsonAlias("vote_average")
    protected String voteAverage;

    @JsonAlias("vote_count")
    protected String voteCount;

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
