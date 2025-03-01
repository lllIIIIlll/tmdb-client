package net.ow.movie.tmdb.dto.search;

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
    @JsonSubTypes.Type(value = SearchMovieDTO.class, name = MediaType.MOVIE),
    @JsonSubTypes.Type(value = SearchTVShowDTO.class, name = MediaType.TV_SHOW),
    @JsonSubTypes.Type(value = SearchPersonDTO.class, name = MediaType.PERSON)
})
public abstract class SearchResultDTO {
    protected Integer id;

    @JsonAlias("media_type")
    protected String mediaType;
}
