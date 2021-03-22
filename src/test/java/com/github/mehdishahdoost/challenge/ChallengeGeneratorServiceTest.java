package com.github.mehdishahdoost.challenge;

import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
public class ChallengeGeneratorServiceTest {

    private ChallengeGeneratorService challengeGeneratorService;
    @Spy
    private Random random;

    @BeforeEach
    public void setup() {
         challengeGeneratorService = new ChallengeGeneratorServiceImpl(random);
    }

    @Test
    public void generateRandomFactorBetweenExpectedLimits() {
        given(random.nextInt(89)).willReturn(20, 30);
        Challenge challenge = challengeGeneratorService.randomChallenge();
        BDDAssertions.then(challenge).isEqualTo(new Challenge(31, 41));
    }

}
