package cricketmatch;

public class BatsMan {
	    String name;
	    int totalruns= 0;
	    int balls= 0;

	    public BatsMan(String name) {
	        this.name = name;
	    }

	    public void addRuns(int runs) {
	        totalruns+= runs;
	        balls++;
	    }

	    public String toString() {
	        return name + " - " + totalruns + " runs from " + balls+ " balls";
	    }
	}

