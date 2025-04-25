package net.ow.movie.tmdb.model.network;

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
public class TMDBNetwork {
    private Integer id;

    @JsonAlias("logo_path")
    @JsonSerialize(using = ImagePathSerializer.class)
    @JsonDeserialize(using = ImagePathDeserializer.class)
    private String logoPath;

    private String name;

    @JsonAlias("origin_country")
    private String originCountry;
}
