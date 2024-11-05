/*

Find Characters of a string at odd index.

input : Management
output : aaeet
*/
import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        for(int i =0; i<str.length(); i++){
            if (i%2 == 0)
                continue;
            else
                System.out.print(str.charAt(i));
        }
        
    }    
}
