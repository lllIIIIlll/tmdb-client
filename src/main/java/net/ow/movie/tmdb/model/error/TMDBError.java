package net.ow.movie.tmdb.model.error;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TMDBError {
    private String success;

    @JsonAlias("status_code")
    private Integer statusCode;

    @JsonAlias("status_message")
    private String statusMessage;
}
