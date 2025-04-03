package net.ow.movie.tmdb.model.tv;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.ow.movie.tmdb.deserializer.ImagePathDeserializer;
import net.ow.movie.tmdb.serializer.ImagePathSerializer;
import net.ow.shared.jsonutils.deserializer.DateInstantDeserializer;
import net.ow.shared.jsonutils.serializer.DateInstantSerializer;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TMDBBaseTV {
    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    @JsonAlias("backdrop_path")
    private String backdropPath;

    @JsonAlias("first_air_date")
    @JsonSerialize(using = DateInstantSerializer.class)
    @JsonDeserialize(using = DateInstantDeserializer.class)
    private Instant firstAirDate;

    @JsonAlias("genre_ids")
    private List<Integer> genreIds;

    private Integer id;

    private String name;

    @JsonAlias("origin_country")
    private List<String> originCountry;

    @JsonAlias("original_language")
    private String originalLanguage;

    @JsonAlias("original_name")
    private String originalName;

    private String overview;

    private Integer popularity;

    @JsonAlias("poster_path")
    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    private String posterPath;

    @JsonAlias("vote_average")
    private Integer voteAverage;

    @JsonAlias("vote_count")
    private Integer voteCount;
}
