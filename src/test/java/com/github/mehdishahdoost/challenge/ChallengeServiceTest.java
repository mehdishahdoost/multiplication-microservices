package com.github.mehdishahdoost.challenge;


import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChallengeServiceTest {

    private ChallengeService challengeService;

    @BeforeEach
    public void setup() {
        challengeService = new ChallengeServiceImpl();
    }

    @Test
    public void checkCorrectAttemptTest() {
        ChallengeAttemptDTO dto = new ChallengeAttemptDTO(50, 60, "Jon_doe", 3000);
        ChallengeAttempt challengeAttempt = challengeService.verifyAttempt(dto);
        BDDAssertions.then(challengeAttempt.isCorrect()).isTrue();
    }

    @Test
    public void checkWrongAttemptTest() {
        ChallengeAttemptDTO dto = new ChallengeAttemptDTO(50, 60, "Jon_doe", 5000);
        ChallengeAttempt challengeAttempt = challengeService.verifyAttempt(dto);
        BDDAssertions.then(challengeAttempt.isCorrect()).isFalse();

    }


}
