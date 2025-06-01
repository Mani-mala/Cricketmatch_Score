package cricketmatch;
public class Match {
    Team teamA;
    Team teamB;

    public Match(String nameA, String nameB) {
        teamA = new Team(nameA);
        teamB = new Team(nameB);
    }

    public void startMatch() {
        System.out.println("=== " + teamA.teamName + " Batting ===");
        teamA.playInningsAgainst(teamB);
        teamA.displayScore();

        System.out.println("\n=== " + teamB.teamName + " Batting ===");
        teamB.playInningsAgainst(teamA);
        teamB.displayScore();

        System.out.println("\n Winner: " + decideWinner());
    }

    String decideWinner() {
        if (teamA.totalruns > teamB.totalruns) 
        	return teamA.teamName;
        if (teamB.totalruns > teamA.totalruns) 
        	return teamB.teamName;
        return "Match Tied";
    }
    public static void main(String[] args) {
        Match match = new Match("RCB", "DC");
        match.startMatch();
    }
}

