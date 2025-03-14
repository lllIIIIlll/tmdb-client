package net.ow.move.tmdb.constant;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import net.ow.movie.tmdb.constant.TMDBMediaType;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;

class TMDBMediaTypeTest {
    @Test
    void isMovieTest_OK() {
        assertTrue(TMDBMediaType.isMovie("movie"));
    }

    @Test
    void isMovieTest_whenUpperCase_OK() {
        assertTrue(TMDBMediaType.isMovie("MOVIE"));
    }

    @Test
    void isMovieTest_whenNull_thenReturnFalse() {
        assertFalse(TMDBMediaType.isMovie(null));
    }

    @Test
    void isMovieTest_whenEmptyString_thenReturnFalse() {
        assertFalse(TMDBMediaType.isMovie(Strings.EMPTY));
    }

    @Test
    void isMovieTest_whenRandomString_thenReturnFalse() {
        assertFalse(TMDBMediaType.isMovie("asdf"));
    }

    @Test
    void isTVShowTest_OK() {
        assertTrue(TMDBMediaType.isTVShow("tv"));
    }

    @Test
    void isTVShowTest_whenUpperCase_OK() {
        assertTrue(TMDBMediaType.isTVShow("TV"));
    }

    @Test
    void isTVShowTest_whenNull_thenReturnFalse() {
        assertFalse(TMDBMediaType.isTVShow(null));
    }

    @Test
    void isTVShowTest_whenEmptyString_thenReturnFalse() {
        assertFalse(TMDBMediaType.isTVShow(Strings.EMPTY));
    }

    @Test
    void isTVShowTest_whenRandomString_thenReturnFalse() {
        assertFalse(TMDBMediaType.isTVShow("asdf"));
    }

    @Test
    void isPersonTest_OK() {
        assertTrue(TMDBMediaType.isPerson("person"));
    }

    @Test
    void isPersonTest_whenUpperCase_OK() {
        assertTrue(TMDBMediaType.isPerson("PERSON"));
    }

    @Test
    void isPersonTest_whenNull_thenReturnFalse() {
        assertFalse(TMDBMediaType.isPerson(null));
    }

    @Test
    void isPersonTest_whenEmptyString_thenReturnFalse() {
        assertFalse(TMDBMediaType.isPerson(Strings.EMPTY));
    }

    @Test
    void isPersonTest_whenRandomString_thenReturnFalse() {
        assertFalse(TMDBMediaType.isPerson("asdf"));
    }
}
