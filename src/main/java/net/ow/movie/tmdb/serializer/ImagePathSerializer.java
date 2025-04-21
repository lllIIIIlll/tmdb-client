package net.ow.movie.tmdb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Value;

public class ImagePathSerializer extends JsonSerializer<String> {
    @Value("${tmdb.image.url}")
    private String imageURL;

    @Value("${tmdb.image.size}")
    private String imageSize;

    @Value("${tmdb.image.not-found}")
    private String notFoundImageURL;

    @Override
    public void serialize(
            String posterPath, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        if (null == posterPath || posterPath.isBlank()) {
            jsonGenerator.writeString(Strings.EMPTY);
            return;
        }

        if (posterPath.equals(notFoundImageURL)) {
            jsonGenerator.writeString(Strings.EMPTY);
            return;
        }

        jsonGenerator.writeString(posterPath.replace(imageURL + "/" + imageSize, Strings.EMPTY));
    }
}
