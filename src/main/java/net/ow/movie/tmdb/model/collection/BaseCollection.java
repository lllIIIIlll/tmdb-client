package net.ow.movie.tmdb.model.collection;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import net.ow.movie.tmdb.deserializer.ImagePathDeserializer;
import net.ow.movie.tmdb.serializer.ImagePathSerializer;

@Data
public class BaseCollection {
    private Integer id;

    private String name;

    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    @JsonAlias("poster_path")
    private String posterPath;

    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    @JsonAlias("backdrop_path")
    private String backdropPath;
}
