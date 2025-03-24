package net.ow.movie.tmdb.model.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.ow.shared.jsonutils.deserializer.DateInstantDeserializer;
import net.ow.shared.jsonutils.serializer.DateInstantSerializer;

@Data
@AllArgsConstructor
public class TMDBDateRange {
    @JsonSerialize(using = DateInstantSerializer.class)
    @JsonDeserialize(using = DateInstantDeserializer.class)
    private Instant maximum;

    @JsonSerialize(using = DateInstantSerializer.class)
    @JsonDeserialize(using = DateInstantDeserializer.class)
    private Instant minimum;
}
