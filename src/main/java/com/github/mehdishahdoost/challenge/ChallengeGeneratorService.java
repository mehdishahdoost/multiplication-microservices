package com.github.mehdishahdoost.challenge;

public interface ChallengeGeneratorService {

    /**
     * @return a randomly-generated challenge with factors between 11 and 99.
     */
    Challenge randomChallenge();
}
