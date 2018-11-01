package com.efdouk.apps.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class PrototypeFactoryTest {

    @Test
    void getClone_shouldGetClonesOfPrototypeMovie() {
        // Given
        // When
        Movie movie = (Movie) PrototypeFactory.getClone(ObjectType.MOVIE);
        Movie movie2 = (Movie) PrototypeFactory.getClone(ObjectType.MOVIE);
        // Then
        assertNotNull(movie);
        assertNotNull(movie2);
        assertEquals(movie.getName(), movie2.getName());
        assertNotSame(movie, movie2);
    }

    @Test
    void getClone_shouldGetClonesOfPrototypeTvShow() {
        // Given
        // When
        TvShow tvShow = (TvShow) PrototypeFactory.getClone(ObjectType.TV_SHOW);
        TvShow tvShow2 = (TvShow) PrototypeFactory.getClone(ObjectType.TV_SHOW);
        // Then
        assertNotNull(tvShow);
        assertNotNull(tvShow2);
        assertEquals(tvShow.getName(), tvShow2.getName());
        assertNotSame(tvShow, tvShow2);
    }

    @Test
    void getClone_shouldGetClonesOfPrototypeAlbum() {
        // Given
        // When
        Album album = (Album) PrototypeFactory.getClone(ObjectType.ALBUM);
        Album album2 = (Album) PrototypeFactory.getClone(ObjectType.ALBUM);
        // Then
        assertNotNull(album);
        assertNotNull(album2);
        assertEquals(album.getName(), album2.getName());
        assertNotSame(album, album2);
    }

}