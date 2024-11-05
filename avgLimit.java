/*
Write main method in Solution class. In the main method, read five values for an integer array and two int value which are 
the limits (limit1 and limit2). The main method should print the average of integer values which are greater than limit1 and less 
than limit2.
For example if the values are 1,2,3,4,5 and the limits are 2 and 6 then the average is 4((3+4+5)/3). The output should be in the 
format of sample output.
Note : The returned average value should be of int data type.

Sample input1:
1
2
3
4
5
2
6
Output:
4

Sample input2:
100
200
300
400
500
100
500
Output:
300
*/
import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int count = 0;
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>x && arr[i]<y) {
                sum = sum + arr[i];
                count++;
            }
        }
        System.out.print(sum/count);
    }
}
