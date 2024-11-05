/*
String input : experience
output : exprinc

return string after removing duplicate chars
*/
import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = "";
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (temp.indexOf(ch)==-1)
                temp = temp + ch;
        }
        System.out.print(temp);
    }    
}
