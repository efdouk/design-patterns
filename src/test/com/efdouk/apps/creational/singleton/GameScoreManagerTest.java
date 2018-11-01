package com.efdouk.apps.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class GameScoreManagerTest {

    @Test
    void incrementScore_shouldAmendScoreFromMultipleReferences() {
        // Given
        GameScoreManager manager = GameScoreManager.INSTANCE;
        GameScoreManager manager2 = GameScoreManager.INSTANCE;
        // When
        manager.incrementScore();
        manager2.incrementScore();
        manager.incrementScore();
        manager2.decrementScore();
        // Then
        assertEquals(manager.getScore(), manager2.getScore());
        assertEquals(2, manager.getScore());
        assertSame(manager, manager2);
    }

}