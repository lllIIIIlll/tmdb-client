package net.ow.movie.tmdb.model.common;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;
import lombok.Data;

@Data
public class TMDBPaginatedResponse<T> {
    private Integer page;

    private List<T> results;

    @JsonAlias("total_pages")
    private Integer totalPages;

    @JsonAlias("total_results")
    private Integer totalResults;
}
