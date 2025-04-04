package net.ow.movie.tmdb.model.search;

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
    @JsonSubTypes.Type(value = TMDBMovieSearchResult.class, name = TMDBMediaType.MOVIE),
    @JsonSubTypes.Type(value = TMDBTVShowSearchResult.class, name = TMDBMediaType.TV_SHOW),
    @JsonSubTypes.Type(value = TMDBPersonSearchResult.class, name = TMDBMediaType.PERSON)
})
public class TMDBSearchResult {
    protected Integer id;

    @JsonAlias("media_type")
    protected String mediaType;
}
