package theater;

/**
 * Class representing a performance of a play with playID and # of audience.
 */
public class Performance {

    private final String playID;
    private final int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    public String getPlayID() {
        return playID;
    }

    public int getAudience() {
        return audience;
    }
}
