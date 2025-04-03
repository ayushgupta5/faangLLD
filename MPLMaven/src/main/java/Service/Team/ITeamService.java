package Service.Team;

import Model.Player.Player;
import Model.Team.Team;

public interface ITeamService {
    void addPlayer(Player player);
    void removePlayer(Player player);
    void validateTeam(Team team);
}
