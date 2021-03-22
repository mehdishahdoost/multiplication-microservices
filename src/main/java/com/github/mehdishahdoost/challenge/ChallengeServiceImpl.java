package com.github.mehdishahdoost.challenge;

import com.github.mehdishahdoost.user.User;

public class ChallengeServiceImpl implements ChallengeService
{
    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO challengeAttemptDTO) {

        boolean correct = challengeAttemptDTO.getGuess() == challengeAttemptDTO.getFactorA() * challengeAttemptDTO.getFactorB();
        User user = new User(null, challengeAttemptDTO.getUserAlias());
        ChallengeAttempt challengeAttempt = new ChallengeAttempt(null, user.getId(), challengeAttemptDTO.getFactorA(),
                challengeAttemptDTO.getFactorB(), challengeAttemptDTO.getGuess(), correct);
        return challengeAttempt;
    }
}
