/*
String input : Xplore
Char input : r
output : 4

return index of char in the string
*/
import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        int n = -1;
        for(int i =0; i<str.length(); i++){
            char c = str.charAt(i);
            if (c==ch)
                n = i;
        }
        System.out.print(n);
    }    
}
