/*

Enter a String and Print all vowel as it is which is available on the string in the 0 index.

input : Hello I am a Student
output : Iaa
*/
import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        
        for(int i =0; i<arr.length; i++){
            String word = arr[i];
            char first = word.charAt(0);
            
            if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U'){
                System.out.print(first);
            }
        }
        
    }    
}
