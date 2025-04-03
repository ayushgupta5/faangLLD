package Service.Match;

import Model.Match.Match;

public class MatchService implements IMatchService {
    @Override
    public void scheduleMatch(Match match) {
        System.out.println("Schedule The Match : " + match.toString());
    }

    @Override
    public void updateScore(Match match) {
        System.out.println("Update the Score : " + match.toString());
    }
}
