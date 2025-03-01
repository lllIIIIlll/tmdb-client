package net.ow.movie.tmdb.dto.movie;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import lombok.Data;
import net.ow.shared.jsonutils.deserializer.DateInstantDeserializer;
import net.ow.shared.jsonutils.serializer.DateInstantSerializer;

@Data
public class MovieListItemDTO {
    protected Integer id;

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

    private String title;

    @JsonAlias("original_title")
    private String originalTitle;

    @JsonAlias("release_date")
    @JsonSerialize(using = DateInstantSerializer.class)
    @JsonDeserialize(using = DateInstantDeserializer.class)
    private Instant releaseDate;
}
