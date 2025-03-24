package net.ow.movie.tmdb.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TMDBDateRangePaginatedResponse<T> extends TMDBPaginatedResponse<T> {
    private TMDBDateRange dates;
}
