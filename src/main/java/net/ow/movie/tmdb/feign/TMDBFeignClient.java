package net.ow.movie.tmdb.feign;

import net.ow.movie.tmdb.config.TMDBFeignClientConfig;
import net.ow.movie.tmdb.model.common.TMDBDateRangePaginatedResponse;
import net.ow.movie.tmdb.model.common.TMDBPaginatedResponse;
import net.ow.movie.tmdb.model.discover.TMDBDiscoverMovieRequest;
import net.ow.movie.tmdb.model.genre.TMDBGenreList;
import net.ow.movie.tmdb.model.movie.TMDBBaseMovie;
import net.ow.movie.tmdb.model.movie.TMDBCredits;
import net.ow.movie.tmdb.model.movie.TMDBMovie;
import net.ow.movie.tmdb.model.search.TMDBSearchResult;
import net.ow.movie.tmdb.model.tv.TMDBBaseTV;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
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
    TMDBPaginatedResponse<TMDBSearchResult> search(
            @RequestParam("query") String query,
            @RequestParam("include_adult") Boolean includeAdult,
            @RequestParam("language") String language,
            @RequestParam("page") Integer page);

    // Discover
    @GetMapping("${tmdb.uri.discover.movie}")
    TMDBPaginatedResponse<TMDBBaseMovie> discoverMovies(
            @SpringQueryMap TMDBDiscoverMovieRequest request);

    // Movie
    @GetMapping("${tmdb.uri.movie.now-playing}")
    TMDBDateRangePaginatedResponse<TMDBBaseMovie> getNowPlayingMovies(
            @RequestParam("language") String language,
            @RequestParam("page") Integer page,
            @RequestParam("region") String region);

    @GetMapping("${tmdb.uri.movie.popular}")
    TMDBPaginatedResponse<TMDBBaseMovie> getPopularMovies(
            @RequestParam("language") String language,
            @RequestParam("page") Integer page,
            @RequestParam("region") String region);

    @GetMapping("${tmdb.uri.movie.top-rated}")
    TMDBPaginatedResponse<TMDBBaseMovie> getTopRatedMovies(
            @RequestParam("language") String language,
            @RequestParam("page") Integer page,
            @RequestParam("region") String region);

    @GetMapping("${tmdb.uri.movie.details}")
    TMDBMovie getMovieDetails(
            @PathVariable("movie_id") Integer id,
            @RequestParam("append_to_response") String appendToResponse,
            @RequestParam("language") String language);

    @GetMapping("${tmdb.uri.movie.credits}")
    TMDBCredits getMovieCredits(
            @PathVariable("movie_id") Integer id, @RequestParam("language") String language);

    // TV-Show
    @GetMapping("${tmdb.uri.tv-show.airing-today}")
    TMDBPaginatedResponse<TMDBBaseTV> getAiringTodayTVShows(
            @RequestParam("language") String language,
            @RequestParam("page") Integer page,
            @RequestParam("timezone") String timezone);

    // Genre
    @GetMapping("${tmdb.uri.genre.list}")
    TMDBGenreList getGenres(@RequestParam("language") String language);

    @GetMapping("${tmdb.uri.genre.movie}")
    TMDBGenreList getMovieGenres(@RequestParam("language") String language);

    @GetMapping("${tmdb.uri.genre.tv-show}")
    TMDBGenreList getTVShowGenres(@RequestParam("language") String language);
}
