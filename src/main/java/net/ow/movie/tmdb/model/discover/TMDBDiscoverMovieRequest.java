package net.ow.movie.tmdb.model.discover;

import lombok.Builder;
import lombok.Data;
import net.ow.shared.common.server.annotation.QueryParameter;

@Data
@Builder
public class TMDBDiscoverMovieRequest {
    @QueryParameter(name = "include_adult")
    private Boolean includeAdult;

    @QueryParameter(name = "include_video")
    private Boolean includeVideo;

    private String language;

    private Integer page;

    @QueryParameter(name = "sort_by")
    private String sortBy;

    private String region;

    @QueryParameter(name = "watch_region")
    private String watchRegion;

    @QueryParameter(name = "certification_country")
    private String certificationCountry;

    @QueryParameter(name = "certification")
    private String certification;

    @QueryParameter(name = "certification.gte")
    private String certificationGte;

    @QueryParameter(name = "certification.lte")
    private String certificationLte;

    @QueryParameter(name = "primary_release_date.gte")
    private String primaryReleaseDateGte;

    @QueryParameter(name = "primary_release_date.lte")
    private String primaryReleaseDateLte;

    @QueryParameter(name = "primary_release_year")
    private Integer primaryReleaseYear;

    @QueryParameter(name = "release_date.gte")
    private String releaseDateGte;

    @QueryParameter(name = "release_date.lte")
    private String releaseDateLte;

    private Integer year;

    @QueryParameter(name = "vote_average.gte")
    private Float voteAverageGte;

    @QueryParameter(name = "vote_average.lte")
    private Float voteAverageLte;

    @QueryParameter(name = "vote_count.gte")
    private Integer voteCountGte;

    @QueryParameter(name = "vote_count.lte")
    private Integer voteCountLte;

    @QueryParameter(name = "with_runtime.gte")
    private Integer withRuntimeGte;

    @QueryParameter(name = "with_runtime.lte")
    private Integer withRuntimeLte;

    @QueryParameter(name = "with_release_type")
    private Integer withReleaseType;

    @QueryParameter(name = "with_original_language")
    private String withOriginalLanguage;

    @QueryParameter(name = "with_original_country")
    private String withOriginalCountry;

    @QueryParameter(name = "with_cast")
    private String withCast;

    @QueryParameter(name = "with_crew")
    private String withCrew;

    @QueryParameter(name = "with_people")
    private String withPeople;

    @QueryParameter(name = "with_genres")
    private String withGenres;

    @QueryParameter(name = "without_genres")
    private String withoutGenres;

    @QueryParameter(name = "with_keywords")
    private String withKeywords;

    @QueryParameter(name = "without_keywords")
    private String withoutKeywords;

    @QueryParameter(name = "with_companies")
    private String withCompanies;

    @QueryParameter(name = "without_companies")
    private String withoutCompanies;

    @QueryParameter(name = "with_watch_providers")
    private String withWatchProviders;

    @QueryParameter(name = "without_watch_providers")
    private String withoutWatchProviders;

    @QueryParameter(name = "with_watch_monetization_types")
    private String withWatchMonetizationTypes;
}
