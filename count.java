/*
Write a program to compute the number of spaces and characters in string
String input : Hi I am a student
output : 4 13

return string after removing duplicate chars
*/
import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int s = 0;
        int c = 0;
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch>='a' && ch <='z' || ch>='A' && ch<='Z')
                c++;
            else if (ch == ' ')
                s++;
        }
        System.out.print(s+" "+c);
    }    
}
