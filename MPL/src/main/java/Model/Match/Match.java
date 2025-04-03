package Model.Match;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Match {
    private int matchID;
    private String sportType;
    private String startTime;
    private String endTime;
}
