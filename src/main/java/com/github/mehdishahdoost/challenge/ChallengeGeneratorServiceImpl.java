package com.github.mehdishahdoost.challenge;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService{

    private Random random;
    private final int MINIMUM_FACTOR = 11;
    private final int MAXIMUM_FACTOR = 100;

    ChallengeGeneratorServiceImpl() {
        this.random = new Random();
    }

    protected ChallengeGeneratorServiceImpl(Random random) {
        this.random = random;
    }

    private int next() {
        return random.nextInt(MAXIMUM_FACTOR - MINIMUM_FACTOR) + MINIMUM_FACTOR;
    }


    @Override
    public Challenge randomChallenge() {
        return new Challenge(next(), next());
    }
}
