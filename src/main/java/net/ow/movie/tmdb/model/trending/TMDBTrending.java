package net.ow.movie.tmdb.model.trending;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import net.ow.movie.tmdb.constant.TMDBMediaType;

@Data
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "media_type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = TMDBTrendingMovie.class, name = TMDBMediaType.MOVIE),
    @JsonSubTypes.Type(value = TMDBTrendingTVShow.class, name = TMDBMediaType.TV_SHOW)
})
public class TMDBTrending {
    protected Integer id;

    @JsonAlias("media_type")
    protected String mediaType;
}
