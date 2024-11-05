package company;

import java.util.Arrays;
import java.util.Scanner;

/*
Create a class Player with below attributes:
playerId - int
playerName - String
runs - int
playerType - String
matchType - String
The above attributes should be private, write getters, setters and parameterized constructor as required.
Create class Solution with main method.
Implement two static methods - findPlayerWithLowestRuns and findPlayerByMatchType in Solution class.

findPlayerWithLowestRuns method:
This method will take array of Player objects and a String value as input parameters.
The method will return the least runs of the Player from array of Player objects for the given player type.
(String parameter passed). If no Player with the above condition are present in array of Player objects,
then the method should return 0.

findPlayerByMatchType method:
This method will take array of Player objects and String value as input parameters and return the array of Player objects
belonging to the match type passed as input parameter in Descending order of playerId.
If no Player with the above condition are present in the array of Player objects, then the method should return null.
Note : No two Players will have the same playerId and runs.
All the searches should be case insensitive.
The above mentioned static methods should be called from the main method.
For findPlayerWithLowestRuns method - The main method should print the returned runs as it is
if the returned value is greater than 0 or it should print "No such player".
Eg: 25
where 25 is the lowest runs of the Player.
For findPlayerByMatchType method - The main method should print the playerId from the returned Player array for each
Player if the returned value is not null.
If the returned value is null then it should print "No Player with given matchType".
Eg:
13
11
where 13 and 11 are the playerId's.
Before calling these static methods in main, use Scanner object to read the values of four Player
objects referring attributes in the above mentioned attribute sequence.
Next, read the value of two String parameter for capturing player type and match Type.
Consider below sample input and output:

Input1:
11
Sachin
100
International
One day
12
Shewag
133
International
Test
13
Varun
78
State
Test
14
Ashwin
67
State
One day
State
One day
Output:
67
14
11

Input2:
11
Sachin
100
International
One day
12
Shewag
133
International
Test
13
Varun
78
State
Test
14
Ashwin
67
State
One day
District
T20
Output:
No such player
No Player with given matchType

*/
class Player2{
    int playerId;
    String playerName;
    int runs;
    String playerType;
    String matchType;

    public Player2(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
}
public class ipa11 {
    public static int findPlayerWithLowestRuns(Player2[] arr, String parameter){
        int run = Integer.MAX_VALUE;
        boolean playerFound = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].playerType.equalsIgnoreCase(parameter) && arr[i].runs<run){
                playerFound = true;
                run = arr[i].runs;
            }
        }
        return playerFound ? run : 0;
    }

    public static Player2[] findPlayerByMatchType(Player2[] arr, String parameter){
        Player2[] arr2 = new Player2[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].matchType.equalsIgnoreCase(parameter)){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player2[] arr = new Player2[4];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Player2(a,b,c,d,e);
        }

        String x = sc.nextLine();
        String y = sc.nextLine();


        int run = findPlayerWithLowestRuns(arr, x);
        if(run>0)
            System.out.println(run);
        else System.out.println("No such player");

        Player2[] arr2 = findPlayerByMatchType(arr,y);
        if (arr2.length == 0)
            System.out.println("No Player with given matchType");
        else{
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i].playerId);
            }
        }
    }
}
