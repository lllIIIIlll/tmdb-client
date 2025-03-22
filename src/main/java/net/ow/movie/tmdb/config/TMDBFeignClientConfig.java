package net.ow.movie.tmdb.config;

import feign.QueryMapEncoder;
import feign.RequestInterceptor;
import lombok.RequiredArgsConstructor;
import net.ow.shared.common.server.encoder.CommonQueryMapEncoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.security.OAuth2AccessTokenInterceptor;
import org.springframework.context.annotation.Bean;

@RequiredArgsConstructor
public class TMDBFeignClientConfig {
    @Value("${tmdb.authorization.access-token}")
    private String accessToken;

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header(
                    OAuth2AccessTokenInterceptor.AUTHORIZATION,
                    OAuth2AccessTokenInterceptor.BEARER + " " + accessToken);
        };
    }

    @Bean
    public QueryMapEncoder queryMapEncoder() {
        return new CommonQueryMapEncoder();
    }
}
