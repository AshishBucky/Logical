package com.pb.demo;

public class Match {

	public static void main(String[] args) throws InterruptedException {
		Team team1=new Team();
		Team team2=new Team();
		int team1Total=0;
		int team2Total=0;
		
		for(int i=1;i<=5;i++) {
			
			int isGoal=0;
			
			isGoal=team1.shoot();
			team1Total=team1Total+isGoal;
			System.out.println("team1 kick" +i+" score--->"+isGoal);
			
			Thread.sleep(1000);
			
			isGoal=team1.shoot();
			team2Total=team2Total+isGoal;
			System.out.println("team2 kick "+i+" score--->"+isGoal);
			
			Thread.sleep(1000);	
		}
		
		team1.setScore(team1Total);
		team2.setScore(team2Total);
		System.out.println();
		System.out.println("team1 Total score--->"+team1.getScore());
		System.out.println("team2 Total score--->"+team2.getScore());
		
		System.out.println("\n**setting score to same**\n");
		team1.setScore(5);
		team2.setScore(5);
		
		
		if(team1.getScore()>team2.getScore())
			System.out.println("Team1 WINS !!!");
		
		else if(team1.getScore()<team2.getScore())
			System.out.println("Team2 WINS !!!");
		
		else {
			
			team1.setScore(0);
			team2.setScore(0);
			while(true) {
				System.out.println("SCORE TIED--->Entering to Sudden Death");
				team1.setScore(team1.shoot());
				System.out.println("team1 soore--->"+team1.getScore());
				Thread.sleep(1000);
				team2.setScore(team2.shoot());
				System.out.println("team2 soore--->"+team2.getScore());
				Thread.sleep(1000);
				if(team1.getScore()!=team2.getScore())
					break;
			}
			if(team1.getScore()>team2.getScore())
				System.out.println("Team1 WINS !!!");
		
			else 
				System.out.println("Team2 WINS !!!");
		}
	}
}
