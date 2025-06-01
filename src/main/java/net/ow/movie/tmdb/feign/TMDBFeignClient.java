package net.ow.movie.tmdb.feign;

import java.util.List;
import net.ow.movie.tmdb.config.TMDBFeignClientConfig;
import net.ow.movie.tmdb.model.common.TMDBDateRangePaginatedResponse;
import net.ow.movie.tmdb.model.common.TMDBPaginatedResponse;
import net.ow.movie.tmdb.model.country.TMDBBaseCountry;
import net.ow.movie.tmdb.model.discover.TMDBDiscoverMovieRequest;
import net.ow.movie.tmdb.model.discover.TMDBDiscoverTVShowRequest;
import net.ow.movie.tmdb.model.genre.TMDBGenreList;
import net.ow.movie.tmdb.model.movie.TMDBBaseMovie;
import net.ow.movie.tmdb.model.movie.TMDBMovie;
import net.ow.movie.tmdb.model.person.TMDBCredits;
import net.ow.movie.tmdb.model.search.TMDBSearchResult;
import net.ow.movie.tmdb.model.trending.TMDBTrending;
import net.ow.movie.tmdb.model.trending.TMDBTrendingMovie;
import net.ow.movie.tmdb.model.trending.TMDBTrendingTVShow;
import net.ow.movie.tmdb.model.tv.TMDBBaseTVShow;
import net.ow.movie.tmdb.model.tv.TMDBTVSeason;
import net.ow.movie.tmdb.model.tv.TMDBTVShow;
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

    @GetMapping("${tmdb.uri.discover.tv-show}")
    TMDBPaginatedResponse<TMDBBaseTVShow> discoverTVShows(
            @SpringQueryMap TMDBDiscoverTVShowRequest request);

    // Trending
    @GetMapping("${tmdb.uri.trending.all}")
    TMDBPaginatedResponse<TMDBTrending> getTrending(
            @RequestParam("time_window") String timeWindow,
            @RequestParam("language") String language,
            @RequestParam("page") Integer page);

    @GetMapping("${tmdb.uri.trending.movie}")
    TMDBPaginatedResponse<TMDBTrendingMovie> getTrendingMovies(
            @RequestParam("time_window") String timeWindow,
            @RequestParam("language") String language,
            @RequestParam("page") Integer page);

    @GetMapping("${tmdb.uri.trending.tv}")
    TMDBPaginatedResponse<TMDBTrendingTVShow> getTrendingTVShows(
            @RequestParam("time_window") String timeWindow,
            @RequestParam("language") String language,
            @RequestParam("page") Integer page);

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
    TMDBPaginatedResponse<TMDBBaseTVShow> getAiringTodayTVShows(
            @RequestParam("language") String language,
            @RequestParam("page") Integer page,
            @RequestParam("timezone") String timezone);

    @GetMapping("${tmdb.uri.tv-show.details}")
    TMDBTVShow getTVShowDetails(
            @PathVariable("series_id") Integer id,
            @RequestParam("append_to_response") String appendToResponse,
            @RequestParam("language") String language);

    @GetMapping("${tmdb.uri.tv-show.season.details}")
    TMDBTVSeason getTVSeasonDetails(
            @PathVariable("series_id") Integer seriesId,
            @PathVariable("season_number") Integer seasonNumber,
            @RequestParam("append_to_response") String appendToResponse,
            @RequestParam("language") String language);

    // Genre
    @GetMapping("${tmdb.uri.genre.movie}")
    TMDBGenreList getMovieGenres(@RequestParam("language") String language);

    @GetMapping("${tmdb.uri.genre.tv-show}")
    TMDBGenreList getTVShowGenres(@RequestParam("language") String language);
}
