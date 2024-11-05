package company;

import java.util.Arrays;
import java.util.Scanner;

/*
Create a Class Player with below attributes:
playerId - int
playerName - String
iccRank - int
noOfMatchesPlayed - int
totalRunsScored - int
Write getters, setters and parameterized constructor as required. Create class Solution with main method.
Implement static method - findAverageScoreOfPlayers in Solution class. This method will take an int
parameter named target along with the other parameter as array of Player objects. The method will
calculate the average runrate of the player based on totalRunsScored and noOfMatchesPlayed and return the
same in a double array where the noOfMatchesPlayed attribute is greater than or equal to the int parameter
target passed.
This method should be called from the main method and display the Grade of the players. If the
averageRunRate is greater than or equal to 80 then it should print "Grade A Player". If the averageRunRate is
between 50 to 79 then it should print "Grade B Player", else it should print "Grade C Player" .
Before calling this method(findAverageScoreOfPlayers) in the main method, use Scanner object to read
values for four Player objects referring the attributes in the above sequence. then, read the value for
noOfMatchesPlayed parameter. Next call the method findAverageScoreOfPlayers, write the logic to display
the Grade(in the main method) and display the result.
Consider below sample input and output:
Input:
100
Sachin
1
102
13000
101
Shewag
2
110
10000
102
Dhoni
3
80
7500
104
Kholi
4
70
7000
100
Output:
Grade A Player
Grade A Player

 */
class Player1{
    int playerId, iccRank, noOfMatchesPlayed, totalRunsScored;
    String playerName;
    public Player1(int playerId, String playerName, int iccRank, int noOfMatchesPlayed, int totalRunsScored){
        this.playerId = playerId;
        this.playerName =playerName;
        this.iccRank = iccRank;
        this.noOfMatchesPlayed = noOfMatchesPlayed;
        this.totalRunsScored = totalRunsScored;
    }

}
public class ipa10 {
    public static double[] findAverageScoreOfPlayers(int target, Player1[] arr){
        double[] arr2 = new double[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].noOfMatchesPlayed >= target){
                double avg = (double)arr[i].totalRunsScored/(double)arr[i].noOfMatchesPlayed;
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] =avg;
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player1[] arr = new Player1[4];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            int e = sc.nextInt();sc.nextLine();

            arr[i] = new Player1(a,b,c,d,e);
        }

        int x = sc.nextInt();sc.nextLine();
        double[] arr2 = findAverageScoreOfPlayers(x,arr);
        for (double d: arr2){
            if (d>=80)
                System.out.println("Grade A Player");
            else if(d>=50 && d<=79)
                System.out.println("Grade B Player");
            else
                System.out.println("Grade C Player");
        }
    }
}
