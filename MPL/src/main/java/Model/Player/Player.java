package Model.Player;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Player {
    private int playerID;
    private String playerName;
    private String role;
    private String points;
}
