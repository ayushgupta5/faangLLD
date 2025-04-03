package Model.Team;

import Model.User.User;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Team {
    private int teamID;
    private User user;
    private List<String> players;
}
