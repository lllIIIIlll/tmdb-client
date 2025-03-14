package net.ow.movie.tmdb.model.movie;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import net.ow.movie.tmdb.deserializer.ImagePathDeserializer;
import net.ow.movie.tmdb.serializer.ImagePathSerializer;

@Data
public class TMDBCast {
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

    @JsonAlias("cast_id")
    private Integer castId;

    private String character;

    @JsonAlias("credit_id")
    private String creditId;

    private Integer order;
}
