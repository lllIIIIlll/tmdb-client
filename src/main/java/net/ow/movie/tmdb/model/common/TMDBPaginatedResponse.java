package net.ow.movie.tmdb.model.common;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TMDBPaginatedResponse<T> {
    private Integer page;

    private List<T> results;

    @JsonAlias("total_pages")
    private Integer totalPages;

    @JsonAlias("total_results")
    private Integer totalResults;
}
