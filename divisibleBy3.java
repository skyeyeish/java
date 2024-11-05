/*

Take an integer as input and calculate the sum of its digit.
If the sum is divisible by 3, then print True, else print False
input : 123
output : True

input : 1234
output : False
*/
import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        
        if (sum%3==0) 
            System.out.print("True");
        else System.out.print("False");
    }    
}
