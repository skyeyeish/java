/*
Write main method in Solution class.
In the main method, read a String and print all consonants characters (in lower case) in the sequence as they 
appear in the input value. Please note: The consonants are characters that are not vowels.
Sample input:
DATABase
Output:
dtbs
*/

import java.util.*;

class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                continue;
            else
                System.out.print(ch);
        }
    }
}
