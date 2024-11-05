package company;
import java.util.*;

/*
Create a Class Player with below attributes:
id - int
country - String
side - String
price - double
Write getters, setters and parameterized constructor as required.
Create class Solution with main method.
Implement static method - searchPlayerForMatch in Solution class.
This method will take a String parameter along with the other parameter as array of Player objects.
The method will return array of Player where the String parameter appears in the side attribute (with case
insensitive search).
This method should be called from main method and display the id of returned objects in ascending order.
Before calling this method(searchPlayerForMatch) in the main method, use Scanner object to read values for
four Player objects referring the attributes in the above sequence.
then, read the value for search parameter.
Next call the method searchPlayerForMatch, write the logic to sort the id in ascending order (in main method)
and display the result.
Consider below sample input and output:
Input:
1
India
Batting
2500000
2
Australia
Batting
1000000
3
Srilanka
Bowling
1700000
4
England
Bowling
2000000
Batting

Output:
1
2
 */

import javax.swing.plaf.IconUIResource;

class Player{
    int id;
    String country;
    String side;
    double price;

    public Player(int id, String company, String side, double price){
        this.id = id;
        this.country = country;
        this.side = side;
        this.price = price;
    }

}
public class ipa9 {
    public static Player[] searchPlayerForMatch(String parameter, Player[] arr){
        Player[] arr2 = new Player[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].side.equalsIgnoreCase(parameter)){
                arr2 = Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1] = arr[i];
            }
        }
        return arr2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] arr = new Player[4];

        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();

            arr[i] = new Player(a, b, c, d);
        }

        String x = sc.nextLine();
        Player[] arr2 = searchPlayerForMatch(x, arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i].id);
        }
//        not writing asc order vala ocde since the objects will be added in default order itself and works if it is in ascending order
    }

}
