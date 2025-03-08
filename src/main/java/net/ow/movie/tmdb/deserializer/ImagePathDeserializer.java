package net.ow.movie.tmdb.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Value;

public class ImagePathDeserializer extends JsonDeserializer<String> {
    @Value("${tmdb.image.url}")
    private String imageUrl;

    @Value("${tmdb.image.size}")
    private String imageSize;

    @Override
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        String text = jsonParser.getText();
        if (null == text || text.isBlank()) {
            return Strings.EMPTY;
        }

        return imageUrl + "/" + imageSize + text;
    }
}
