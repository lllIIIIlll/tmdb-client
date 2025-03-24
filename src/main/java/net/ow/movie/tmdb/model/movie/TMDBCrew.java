package net.ow.movie.tmdb.model.movie;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.ow.movie.tmdb.deserializer.ImagePathDeserializer;
import net.ow.movie.tmdb.serializer.ImagePathSerializer;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TMDBCrew {
    private Boolean adult;

    private Integer gender;

    private Integer id;

    @JsonAlias("known_for_department")
    private String knownForDepartment;

    private String name;

    @JsonAlias("original_name")
    private String originalName;

    private Double popularity;

    @JsonAlias("profile_path")
    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    private String profilePath;

    @JsonAlias("credit_id")
    private String creditId;

    private String department;

    private String job;
}
