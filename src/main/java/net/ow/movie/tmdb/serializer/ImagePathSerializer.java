package net.ow.movie.tmdb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Value;

public class ImagePathSerializer extends JsonSerializer<String> {
    @Value("${tmdb.image.url}")
    private String imageUrl;

    @Value("${tmdb.image.size}")
    private String imageSize;

    @Override
    public void serialize(
            String posterPath, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        if (null == posterPath || posterPath.isBlank()) {
            jsonGenerator.writeString("");
            return;
        }

        jsonGenerator.writeString(posterPath.replace(imageUrl + "/" + imageSize, ""));
    }
}
