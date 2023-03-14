
import java.util.Scanner;


public class Reverse_String {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Word: ");
          String str = sc.next();
          reverse(str);
    }
     static void reverse(String str){
        String ans = "";
        for (int i = str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            ans+=ch;
        }
        System.out.println(ans);
    }
}
