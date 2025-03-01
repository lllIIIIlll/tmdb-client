package net.ow.movie.tmdb.dto.movie;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import net.ow.movie.tmdb.dto.common.DatesDTO;
import net.ow.movie.tmdb.dto.common.PagedResultDTO;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MovieNowPlayingResponse extends PagedResultDTO<MovieListItemDTO> {
    private DatesDTO dates;
}
