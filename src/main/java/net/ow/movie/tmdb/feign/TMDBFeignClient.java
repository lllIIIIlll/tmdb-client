package net.ow.movie.tmdb.feign;

import net.ow.movie.tmdb.config.TMDBFeignClientConfig;
import net.ow.movie.tmdb.dto.common.PagedResultDTO;
import net.ow.movie.tmdb.dto.movie.MovieNowPlayingResponse;
import net.ow.movie.tmdb.dto.search.SearchResultDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        value = "tmdb",
        url = "${tmdb.base-url}" + "/" + "${tmdb.api-version}",
        configuration = TMDBFeignClientConfig.class)
public interface TMDBFeignClient {
    @GetMapping("${tmdb.search}")
    PagedResultDTO<SearchResultDTO> search(
            @RequestParam("query") String query,
            @RequestParam("include_adult") Boolean includeAdult,
            @RequestParam("language") String language,
            @RequestParam("page") Integer page);

    @GetMapping("${tmdb.uri.movie.now-playing}")
    MovieNowPlayingResponse getNowPlayingMovies(
            @RequestParam("language") String language,
            @RequestParam("page") Integer page,
            @RequestParam("region") String region);
}
