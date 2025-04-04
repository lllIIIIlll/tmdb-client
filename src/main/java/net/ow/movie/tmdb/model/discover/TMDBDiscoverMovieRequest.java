package net.ow.movie.tmdb.model.discover;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.InstantSerializer;
import java.math.BigDecimal;
import java.time.Instant;
import lombok.Builder;
import lombok.Data;
import net.ow.shared.common.server.annotation.QueryParameter;

@Data
@Builder
public class TMDBDiscoverMovieRequest {
    @QueryParameter(name = "certification")
    private String certification;

    @QueryParameter(name = "certification.gte")
    private String certificationGreaterThen;

    @QueryParameter(name = "certification.lte")
    private String certificationLessThen;

    @QueryParameter(name = "certification_country")
    private String certificationCountry;

    @QueryParameter(name = "include_adult")
    private Boolean includeAdult;

    @QueryParameter(name = "include_video")
    private Boolean includeVideo;

    private String language;

    private Integer page;

    @QueryParameter(name = "primary_release_year")
    private Integer primaryReleaseYear;

    @JsonSerialize(using = InstantSerializer.class)
    @JsonDeserialize(using = InstantDeserializer.class)
    @QueryParameter(name = "primary_release_date.gte")
    private Instant primaryReleaseDateGreaterThen;

    @JsonSerialize(using = InstantSerializer.class)
    @JsonDeserialize(using = InstantDeserializer.class)
    @QueryParameter(name = "primary_release_date.lte")
    private Instant primaryReleaseDateLessThen;

    private String region;

    @QueryParameter(name = "release_date.gte")
    @JsonSerialize(using = InstantSerializer.class)
    @JsonDeserialize(using = InstantDeserializer.class)
    private Instant releaseDateGreaterThen;

    @QueryParameter(name = "release_date.lte")
    @JsonSerialize(using = InstantSerializer.class)
    @JsonDeserialize(using = InstantDeserializer.class)
    private Instant releaseDateLessThen;

    @QueryParameter(name = "sort_by")
    private String sortBy;

    @QueryParameter(name = "vote_average.gte")
    private BigDecimal voteAverageGreaterThen;

    @QueryParameter(name = "vote_average.lte")
    private BigDecimal voteAverageLessThen;

    @QueryParameter(name = "vote_count.gte")
    private Integer voteCountGreaterThen;

    @QueryParameter(name = "vote_count.lte")
    private Integer voteCountLessThen;

    @QueryParameter(name = "watch_region")
    private String watchRegion;

    @QueryParameter(name = "with_cast")
    private String withCast;

    @QueryParameter(name = "with_companies")
    private String withCompanies;

    @QueryParameter(name = "with_crew")
    private String withCrew;

    @QueryParameter(name = "with_genres")
    private String withGenres;

    @QueryParameter(name = "with_keywords")
    private String withKeywords;

    @QueryParameter(name = "with_origin_country")
    private String withOriginCountry;

    @QueryParameter(name = "with_original_language")
    private String withOriginalLanguage;

    @QueryParameter(name = "with_people")
    private String withPeople;

    @QueryParameter(name = "with_release_type")
    private Integer withReleaseType;

    @QueryParameter(name = "with_runtime.gte")
    private Integer withRuntimeGreaterThen;

    @QueryParameter(name = "with_runtime.lte")
    private Integer withRuntimeLessThen;

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

    private Integer year;
}
