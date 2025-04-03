package Service.Contest;

import Model.Contest.Contest;

public class ContestService implements IContestService {
    @Override
    public void createContest(Contest contest) {
        System.out.println("Create the Contest :" +contest.toString());
    }

    @Override
    public void joinContest(Contest contest) {
        System.out.println("Join the Contest :" +contest.toString());
    }

    @Override
    public void calculateLeaderBoard(Contest contest) {
        System.out.println("Calculate LeaderBoard :" +contest.toString());
    }
}
