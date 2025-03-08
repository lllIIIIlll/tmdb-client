package net.ow.move.tmdb.serializer;

import static org.mockito.Mockito.verify;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import lombok.SneakyThrows;
import net.ow.movie.tmdb.serializer.ImagePathSerializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

@ExtendWith(MockitoExtension.class)
class ImagePathSerializerTest {
    @InjectMocks private ImagePathSerializer imagePathSerializer;

    @Mock private JsonGenerator jsonGenerator;

    @Mock private SerializerProvider serializerProvider;

    @BeforeEach
    void setUp() {
        final String imageUrl = "http://image.tmdb.org/t/p";
        ReflectionTestUtils.setField(imagePathSerializer, "imageUrl", imageUrl);

        final String imageSize = "w500";
        ReflectionTestUtils.setField(imagePathSerializer, "imageSize", imageSize);
    }

    @Test
    @SneakyThrows
    void serializeTest_OK() {
        String posterPath = "http://image.tmdb.org/t/p/w500/abc.jpg";
        imagePathSerializer.serialize(posterPath, jsonGenerator, serializerProvider);
        verify(jsonGenerator).writeString("/abc.jpg");
    }

    @Test
    @SneakyThrows
    void serializeTest_whenNullPosterPath_thenWritesEmptyString() {
        imagePathSerializer.serialize(null, jsonGenerator, serializerProvider);
        verify(jsonGenerator).writeString("");
    }

    @Test
    @SneakyThrows
    void serializeTest_whenBlankPosterPath_thenWritesEmptyString() {
        imagePathSerializer.serialize("   ", jsonGenerator, serializerProvider);
        verify(jsonGenerator).writeString("");
    }

    @Test
    @SneakyThrows
    void serializeTest_whenPosterPathWithoutImageUrl_thenWritesOriginalString() {
        String posterPath = "/abc.jpg";
        imagePathSerializer.serialize(posterPath, jsonGenerator, serializerProvider);
        verify(jsonGenerator).writeString(posterPath);
    }
}
