package Model.Contest;

import Model.Match.Match;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contest {
    private int contestID;
    private Match match;
    private double entryFee;
    private double prizePool;
    private String contestType;
}
