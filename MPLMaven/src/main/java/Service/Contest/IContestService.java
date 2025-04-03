package Service.Contest;

import Model.Contest.Contest;

public interface IContestService {
    void createContest(Contest contest);

    void joinContest(Contest contest);

    void calculateLeaderBoard(Contest contest);
}
