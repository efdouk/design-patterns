package com.efdouk.apps.creational.singleton;

public enum GameScoreManager {

    INSTANCE(0);

    private int score;

    GameScoreManager(int initialScore) {
        this.score = initialScore;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }

    public void decrementScore() {
        score--;
    }

}
