package cricketmatch;

public class Bowler {
    String name;
    int ballsbowled= 0;
    int wickets= 0;
    int totalruns=0;
    int ballsfaced=0;

    public Bowler(String name) {
        this.name = name;
    }

    public void wicket(boolean isWicket) {
        ballsbowled++;
        if (isWicket) wickets++;
    }
    public void addRuns(int runs) {
        totalruns+= runs;
        ballsfaced++;
    }

    public String toString() {
        return name +" - score "+totalruns+" runs from "+ ballsfaced/6+" over and, take " + wickets + " wickets from " + ballsbowled/6+ " overs";
    }
}
