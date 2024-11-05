/*
Write a program to print the last character of every word in a string
Condition : Ignore all the digits and whitespaces
String input : Hey3 Java Learners
output :  as
*/
import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr= str.split(" ");
        String lasts = "";
        for(int i =0; i<arr.length; i++){
            String word = arr[i];
            char last = word.charAt(word.length()-1);
            if (Character.isDigit(last))
                continue;
            else
                System.out.print(last);
            
        }
    }    
}
