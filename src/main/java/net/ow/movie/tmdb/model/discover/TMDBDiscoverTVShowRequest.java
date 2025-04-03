package net.ow.movie.tmdb.model.discover;

import lombok.Builder;
import lombok.Data;
import net.ow.shared.common.server.annotation.QueryParameter;

@Data
@Builder
public class TMDBDiscoverTVShowRequest {
    @QueryParameter(name = "air_date.gte")
    private String airDateGte;

    @QueryParameter(name = "air_date.lte")
    private String airDateLte;

    @QueryParameter(name = "first_air_date_year")
    private Integer firstAirDateYear;

    @QueryParameter(name = "first_air_date.gte")
    private String firstAirDateGte;

    @QueryParameter(name = "first_air_date.lte")
    private String firstAirDateLte;

    @QueryParameter(name = "include_adult")
    private Boolean includeAdult;

    @QueryParameter(name = "include_null_first_air_dates")
    private Boolean includeNullFirstAirDates;

    private String language;

    private Integer page;

    @QueryParameter(name = "screened_theatrically")
    private Boolean screenedTheatrically;

    @QueryParameter(name = "sort_by")
    private String sortBy;

    private String timezone;

    @QueryParameter(name = "vote_average.gte")
    private Float voteAverageGte;

    @QueryParameter(name = "vote_average.lte")
    private Float voteAverageLte;

    @QueryParameter(name = "vote_count.gte")
    private Integer voteCountGte;

    @QueryParameter(name = "vote_count.lte")
    private Integer voteCountLte;

    @QueryParameter(name = "watch_region")
    private String watchRegion;

    @QueryParameter(name = "with_companies")
    private String withCompanies;

    @QueryParameter(name = "with_genres")
    private String withGenres;

    @QueryParameter(name = "with_keywords")
    private String withKeywords;

    @QueryParameter(name = "with_origin_country")
    private String withOriginCountry;

    @QueryParameter(name = "with_original_language")
    private String withOriginalLanguage;

    @QueryParameter(name = "with_runtime.gte")
    private Integer withRuntimeGte;

    @QueryParameter(name = "with_runtime.lte")
    private Integer withRuntimeLte;

    @QueryParameter(name = "with_status")
    private String withStatus;

    @QueryParameter(name = "with_watch_monetization_types")
    private String withWatchMonetizationTypes;

    @QueryParameter(name = "with_watch_providers")
    private String withWatchProviders;

    @QueryParameter(name = "without_companies")
    private String withoutCompanies;

    @QueryParameter(name = "without_genres")
    private String withoutGenres;

    @QueryParameter(name = "without_keywords")
    private String withoutKeywords;

    @QueryParameter(name = "without_watch_providers")
    private String withoutWatchProviders;

    @QueryParameter(name = "with_type")
    private String withType;
}
