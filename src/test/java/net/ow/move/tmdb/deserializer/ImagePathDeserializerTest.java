package net.ow.move.tmdb.deserializer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import lombok.SneakyThrows;
import net.ow.movie.tmdb.deserializer.ImagePathDeserializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

@ExtendWith(MockitoExtension.class)
class ImagePathDeserializerTest {
    @InjectMocks private ImagePathDeserializer imagePathDeserializer;

    @Mock private JsonParser jsonParser;

    @Mock private DeserializationContext deserializationContext;

    private final String imageUrl = "http://image.tmdb.org/t/p";

    private final String imageSize = "w500";

    @BeforeEach
    void setUp() {
        ReflectionTestUtils.setField(imagePathDeserializer, "imageUrl", imageUrl);
        ReflectionTestUtils.setField(imagePathDeserializer, "imageSize", imageSize);
    }

    @Test
    @SneakyThrows
    void deserializeTest_OK() {
        String text = "/example.jpg";
        when(jsonParser.getText()).thenReturn(text);

        String expectedUrl = imageUrl + "/" + imageSize + text;
        String result = imagePathDeserializer.deserialize(jsonParser, deserializationContext);

        assertEquals(expectedUrl, result);
    }

    @Test
    @SneakyThrows
    void deserializeTest_whenTextIsNull_thenReturnsEmptyString() {
        when(jsonParser.getText()).thenReturn(null);

        String result = imagePathDeserializer.deserialize(jsonParser, deserializationContext);

        assertEquals("", result);
    }

    @Test
    @SneakyThrows
    void deserializeTest_whenTextIsBlank_thenReturnsEmptyString() {
        when(jsonParser.getText()).thenReturn("   ");

        String result = imagePathDeserializer.deserialize(jsonParser, deserializationContext);

        assertEquals("", result);
    }
}
