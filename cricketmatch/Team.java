package cricketmatch;
import java.util.*;
public class Team {
	    String teamName;
	    ArrayList<BatsMan> batsman = new ArrayList<>();
	    ArrayList<Bowler> bowler = new ArrayList<>();
	    int totalruns = 0;
	    int wickets = 0;
	    public Team(String name)
	    {
	        teamName = name;
	        for (int i = 1; i <= 6; i++) {
	            batsman.add(new BatsMan(name + "_Batsman" + i));
	        }
	        for (int i = 1; i <= 5; i++) {
	            bowler.add(new Bowler(name + "_Bowler" + i));
	        }
	    }

	    public void playInningsAgainst(Team opponent) 
	    {
	        Random rand = new Random();
	        int bIndex = 0;
	        int bowlerIndex = 0;
	        int overs=1;
	        
	        while (wickets < 10 && overs<=20)
	        {
	        	//int ballscount=1;
	        	if(bIndex>5)
	        	{
	        		Bowler striker = bowler.get(bIndex-6);
		            Bowler bowler = opponent.bowler.get(bowlerIndex);
		            int balls=0;
		            for (int i = balls; i < 6; i++) 
		            {
//		            	if(ballscount==6)
//		            	{
//		            		overs++;
//		            		break;
//		            	}
		                int run = rand.nextInt(8);
		                if (run == 7) 
		                {
		                    bowler.wicket(true);
		                    wickets++;
		                    striker.addRuns(0);
		                    //ballscount++;
		                    bIndex++;
		                    balls++;
		                   break;
		                   
		                } 
		                else 
		                {
		                    bowler.wicket(false);
		                    striker.addRuns(run);
		                    totalruns += run;
		                    balls++;
		                    //ballscount++;
		                }
		            }
		            if(balls==6)
		            {
		            	overs++;
		            	bowlerIndex = (bowlerIndex + 1) % opponent.bowler.size();
		            }
		            else
		            {
		                for (int i = balls; i < 6; i++) 
			            {
//			            	if(ballscount==6)
//			            	{
//			            		overs++;
//			            		break;
//			            	}
			                int run = rand.nextInt(8);
			                if (run == 7) 
			                {
			                    bowler.wicket(true);
			                    wickets++;
			                    striker.addRuns(0);
			                    //ballscount++;
			                    bIndex++;
			                    balls++;
			                   break;
			                   
			                } 
			                else 
			                {
			                    bowler.wicket(false);
			                    striker.addRuns(run);
			                    totalruns += run;
			                    balls++;
			                    //ballscount++;
			                }
			            }
		            }
	        	}
	        	else
	        	{
	           	BatsMan striker = batsman.get(bIndex);
	            Bowler bowler = opponent.bowler.get(bowlerIndex);

	            for (int i = 1; i <=6; i++)
	            {
//	            	if(ballscount==6)
//	            	{
//	            		overs++;
//	            		break;
//	            	}
	        
	                int run = rand.nextInt(8);
	                if (run == 7) 
	                {
	                    bowler.wicket(true);
	                    wickets++;
	                    striker.addRuns(0);
	                    //ballscount++;
	                    bIndex++;
	                   // break; 
	                } 
	                else
	                {
	                    bowler.wicket(false);
	                    striker.addRuns(run);
	                    totalruns += run;
	                    //ballscount++;
	                }	           
	            }
	            overs++;
	            bowlerIndex = (bowlerIndex + 1) % opponent.bowler.size();
	        }
	        }
	    }

	    public void displayScore() {
	        System.out.println(teamName + " Score: " + totalruns + "/" + wickets);
	        System.out.println("-- Batsmen --");
	        for (BatsMan b : batsman)
	        	System.out.println(b);
	        System.out.println("-- Bowlers --");
	        for (Bowler b : bowler) 
	        	System.out.println(b);
	    }
}
