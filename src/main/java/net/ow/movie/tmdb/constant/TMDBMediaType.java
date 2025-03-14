package net.ow.movie.tmdb.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TMDBMediaType {
    public static final String MOVIE = "movie";

    public static final String TV_SHOW = "tv";

    public static final String PERSON = "person";

    public static Boolean isMovie(String mediaType) {
        return mediaType != null && mediaType.equalsIgnoreCase(MOVIE);
    }

    public static Boolean isTVShow(String mediaType) {
        return mediaType != null && mediaType.equalsIgnoreCase(TV_SHOW);
    }

    public static Boolean isPerson(String mediaType) {
        return mediaType != null && mediaType.equalsIgnoreCase(PERSON);
    }
}
