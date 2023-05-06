package Ex4_7;

import java.util.Scanner;

class BasketballGame {
    private String team1Name;
    private String team2Name;
    private int team1Score;
    private int team2Score;
    boolean isFinished;

    public BasketballGame(String team1Name, String team2Name) {
        this.team1Name = team1Name;
        this.team2Name = team2Name;
        this.team1Score = 0;
        this.team2Score = 0;
        this.isFinished = false;
    }

    public void recordOnePoint(String teamName) {
        if (!isFinished && teamName.equals(team1Name)) {
            team1Score++;
        } else if (!isFinished && teamName.equals(team2Name)) {
            team2Score++;
        }
    }

    public void recordTwoPoints(String teamName) {
        if (!isFinished && teamName.equals(team1Name)) {
            team1Score += 2;
        } else if (!isFinished && teamName.equals(team2Name)) {
            team2Score += 2;}
    }
   
    public void recordThreePoints(String teamName) {
        if (!isFinished && teamName.equals(team1Name)) {
            team1Score += 3;
        } else if (!isFinished && teamName.equals(team2Name)) {
            team2Score += 3;
        }
    }

    public void finishGame() {
        isFinished = true;
    }

    public int getTeamScore(String teamName) {
        if (teamName.equals(team1Name)) {
            return team1Score;
        } else if (teamName.equals(team2Name)) {
            return team2Score;
        } else {
            return -1; // Invalid team name
        }
    }

    public String getCurrentWinningTeam() {
        if (isFinished) {
            if (team1Score > team2Score) {
                return team1Name;
            } else if (team2Score > team1Score) {
                return team2Name;
            } else {
                return null; // Scores are tied
            }
        } else {
            if (team1Score > team2Score) {
                return team1Name;
            } else if (team2Score > team1Score) {
                return team2Name;
            } else {
                return null; // Scores are tied
            }
        }
    
}
}
public class Ex4_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the name of the first team: ");
		String team1Name = scanner.nextLine();
		System.out.print("Enter the name of the second team: ");
		String team2Name = scanner.nextLine();
		BasketballGame game = new BasketballGame(team1Name, team2Name);
		
		
		
	    while (true) {
	        System.out.print("Enter the name of the scoring team (enter a, finsh): ");
	        String teamName = scanner.nextLine();
	        if(teamName=="a")break; 
	        
	        System.out.print("Enter the number of points scored (1, 2, or 3): ");
	        int points = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        switch (points) {
	            case 1:
	                game.recordOnePoint(teamName);
	                break;
	            case 2:
	                game.recordTwoPoints(teamName);
	                break;
	            case 3:
	                game.recordThreePoints(teamName);
	                break;
	            default:
	                System.out.println("Invalid number of points scored.");
	                break;
	        }

	        System.out.println("Current score: " + game.getTeamScore(team1Name) + " - " + game.getTeamScore(team2Name));
	        System.out.println("Winning team: " + game.getCurrentWinningTeam());
	    }

	}
}
