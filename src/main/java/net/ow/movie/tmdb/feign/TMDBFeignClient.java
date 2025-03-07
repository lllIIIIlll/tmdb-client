package net.ow.movie.tmdb.feign;

import net.ow.movie.tmdb.config.TMDBFeignClientConfig;
import net.ow.movie.tmdb.model.common.DateRangePagedResponse;
import net.ow.movie.tmdb.model.common.PagedResponse;
import net.ow.movie.tmdb.model.genre.GenreList;
import net.ow.movie.tmdb.model.movie.BaseMovie;
import net.ow.movie.tmdb.model.movie.Credits;
import net.ow.movie.tmdb.model.movie.Movie;
import net.ow.movie.tmdb.model.search.SearchResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        value = "tmdb",
        url = "${tmdb.base-url}" + "/" + "${tmdb.api-version}",
        configuration = TMDBFeignClientConfig.class)
public interface TMDBFeignClient {
    // Search
    @GetMapping("${tmdb.uri.search.multi}")
    PagedResponse<SearchResult> search(
            @RequestParam("query") String query,
            @RequestParam("include_adult") Boolean includeAdult,
            @RequestParam("language") String language,
            @RequestParam("page") Integer page);

    // Movie
    @GetMapping("${tmdb.uri.movie.now-playing}")
    DateRangePagedResponse<BaseMovie> getNowPlayingMovies(
            @RequestParam("language") String language,
            @RequestParam("page") Integer page,
            @RequestParam("region") String region);

    @GetMapping("${tmdb.uri.movie.details}")
    Movie getMovieDetails(
            @PathVariable("movie_id") Integer id,
            @RequestParam("append_to_response") String appendToResponse,
            @RequestParam("language") String language);

    @GetMapping("${tmdb.uri.movie.credits}")
    Credits getMovieCredits(
            @PathVariable("movie_id") Integer id, @RequestParam("language") String language);

    // Genre
    @GetMapping("${tmdb.uri.genre.list}")
    GenreList getGenres(@RequestParam("language") String language);
}
