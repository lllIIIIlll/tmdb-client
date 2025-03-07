package net.ow.movie.tmdb.model.search;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import net.ow.movie.tmdb.constant.MediaType;

@Data
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "media_type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = MovieSearchResult.class, name = MediaType.MOVIE),
    @JsonSubTypes.Type(value = TVSearchResult.class, name = MediaType.TV_SHOW),
    @JsonSubTypes.Type(value = PersonSearchResult.class, name = MediaType.PERSON)
})
public class SearchResult {
    protected Integer id;

    @JsonAlias("media_type")
    protected String mediaType;
}
