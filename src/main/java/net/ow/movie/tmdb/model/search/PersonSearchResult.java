package net.ow.movie.tmdb.model.search;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import net.ow.movie.tmdb.deserializer.ImagePathDeserializer;
import net.ow.movie.tmdb.serializer.ImagePathSerializer;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PersonSearchResult extends SearchResult {
    private Boolean adult;

    private BigDecimal popularity;

    private String name;

    @JsonAlias("original_name")
    private String originalName;

    private Integer gender;

    @JsonAlias("known_for_department")
    private String knownForDepartment;

    @JsonAlias("profile_path")
    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    private String profilePath;

    @JsonAlias("known_for")
    private List<SearchResult> knownFor;
}
