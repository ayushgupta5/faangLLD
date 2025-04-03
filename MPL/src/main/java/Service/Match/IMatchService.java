package Service.Match;

import Model.Match.Match;

public interface IMatchService {
    void scheduleMatch(Match match);
    void updateScore(Match match);
}
