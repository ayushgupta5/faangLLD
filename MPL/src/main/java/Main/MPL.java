package Main;


import Model.Contest.Contest;
import Model.Match.Match;
import Model.Payment.Payment;
import Model.Player.Player;
import Model.Team.Team;
import Model.User.User;
import Service.Contest.ContestService;
import Service.Contest.IContestService;
import Service.Match.IMatchService;
import Service.Match.MatchService;
import Service.Payment.CreditCard;
import Service.Payment.PaymentService;
import Service.Payment.PaymentStrategy;
import Service.Payment.UPI;
import Service.Team.ITeamService;
import Service.Team.TeamService;
import Service.User.IUserService;
import Service.User.UserService;

import java.util.ArrayList;
import java.util.List;

public class MPL {
    public static void main(String[] args) {
        User user = User.builder().userID(1).userName("Ayush").walletBalance(100.00).passwordHash("password").build();
        List<String> players = new ArrayList<>();
        Match match = Match.builder().matchID(1).startTime("04:00").endTime("07:00").sportType("Cricket").build();
        Contest contest = Contest.builder().contestID(1).contestType("ShortContest").match(match).entryFee(240.90).prizePool(300.00).build();
        Team team = Team.builder().teamID(1).user(user).players(players).build();
        Player player = Player.builder().playerID(1).playerName("Kohli").points("22").role("Batsman").build();
        Payment payment = Payment.builder().paymentID(1).amount(111.00).transactionType("UPI").user(user).build();

        IUserService userService = new UserService();
        userService.register();
        userService.login(user);

        IMatchService matchService = new MatchService();
        matchService.scheduleMatch(match);
        matchService.updateScore(match);

        IContestService contestService = new ContestService();
        contestService.createContest(contest);
        contestService.joinContest(contest);
        contestService.calculateLeaderBoard(contest);

        ITeamService teamService = new TeamService();
        teamService.validateTeam(team);
        teamService.addPlayer(player);
        teamService.removePlayer(player);

        Payment(payment);
        payment.setTransactionType("Credit Card");
        Payment(payment);
        userService.logout(user);


    }
    private static void Payment(Payment payment) {
        PaymentStrategy paymentStrategy;
        if(payment.getTransactionType() == "UPI") {
            paymentStrategy = new UPI();
        } else {
            paymentStrategy = new CreditCard();
        }

        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(paymentStrategy);
        paymentService.pay(payment);
    }
}
