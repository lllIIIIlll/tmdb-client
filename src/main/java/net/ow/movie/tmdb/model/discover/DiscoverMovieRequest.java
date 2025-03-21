package net.ow.movie.tmdb.model.discover;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DiscoverMovieRequest {
    // 基础参数
    private Boolean includeAdult;
    private Boolean includeVideo;
    private String language;
    private Integer page;
    private String sortBy;
    private String region;
    private String watchRegion;

    // 认证相关
    private String certificationCountry;
    private String certification;
    private String certificationGte;
    private String certificationLte;

    // 日期相关
    private String primaryReleaseDateGte;
    private String primaryReleaseDateLte;
    private Integer primaryReleaseYear;
    private String releaseDateGte;
    private String releaseDateLte;
    private Integer year;

    // 评分相关
    private Float voteAverageGte;
    private Float voteAverageLte;
    private Integer voteCountGte;
    private Integer voteCountLte;

    // 电影元数据
    private Integer withRuntimeGte;
    private Integer withRuntimeLte;
    private Integer withReleaseType;
    private String withOriginalLanguage;
    private String withOriginalCountry;

    // 人员相关
    private String withCast;
    private String withCrew;
    private String withPeople;

    // 分类标签
    private String withGenres;
    private String withoutGenres;
    private String withKeywords;
    private String withoutKeywords;
    private String withCompanies;
    private String withoutCompanies;

    // 观看相关
    private String withWatchProviders;
    private String withoutWatchProviders;
    private String withWatchMonetizationTypes;
}
