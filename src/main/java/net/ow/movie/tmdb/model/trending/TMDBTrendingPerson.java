package net.ow.movie.tmdb.model.trending;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.ow.movie.tmdb.serializer.ImagePathSerializer;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TMDBTrendingPerson extends TMDBTrending {
    private Boolean adult;

    @JsonAlias("backdrop_path")
    @JsonSerialize(using = ImagePathSerializer.class)
    private String backdropPath;

    private String name;

    @JsonAlias("original_name")
    private String originalName;

    private BigDecimal popularity;

    private Integer gender;

    @JsonAlias("known_for_department")
    private String knownForDepartment;

    @JsonAlias("profile_path")
    private String profilePath;

    @JsonAlias("known_for")
    private List<TMDBTrending> knownFor;
}
