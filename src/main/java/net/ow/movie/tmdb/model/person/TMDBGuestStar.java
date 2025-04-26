package net.ow.movie.tmdb.model.person;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.ow.movie.tmdb.deserializer.ImagePathDeserializer;
import net.ow.movie.tmdb.serializer.ImagePathSerializer;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TMDBGuestStar {
    private String character;

    @JsonAlias("credit_id")
    private String creditId;

    private Integer order;

    private Boolean adult;

    private String gender;

    private Integer id;

    @JsonAlias("known_for_department")
    private String knownForDepartment;

    private String name;

    @JsonAlias("original_name")
    private String originalName;

    private BigDecimal popularity;

    @JsonAlias("profile_path")
    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    private String profilePath;
}
