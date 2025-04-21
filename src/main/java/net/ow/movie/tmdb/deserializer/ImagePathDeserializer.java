package net.ow.movie.tmdb.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Value;

public class ImagePathDeserializer extends JsonDeserializer<String> {
    @Value("${tmdb.image.url}")
    private String imageURL;

    @Value("${tmdb.image.size}")
    private String imageSize;

    @Value("${tmdb.image.not-found}")
    private String notFoundImageURL;

    @Override
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        String text = jsonParser.getText();
        if (null == text || text.isBlank()) {
            return notFoundImageURL;
        }

        return imageURL + "/" + imageSize + text;
    }
}
