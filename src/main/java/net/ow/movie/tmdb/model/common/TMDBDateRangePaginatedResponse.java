package net.ow.movie.tmdb.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TMDBDateRangePaginatedResponse<T> extends TMDBPaginatedResponse<T> {
    private TMDBDateRange dates;
}
