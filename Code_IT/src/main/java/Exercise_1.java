
public class Exercise_1 {
    public static void main(String[] args) {
//         Using iteration method 
        
        for (int i = 1; i <=100; i++) {
            if(i%3 == 0 && i%5 == 0){
                System.out.print("FizzBuzz ");
            }
            else if(i%3 == 0){
                System.out.print("Fizz ");
            }
            else if(i%5 == 0){
                System.out.print("Buzz ");
            }
            else{
                System.out.print(i+" ");
            }
        }
//        Using Recursion
          print(1);
    }
    static void print(int num){
        if(num == 100){
            System.out.println("Buzz ");
            return;
        }
         if(num%3 == 0 && num%5 == 0){
                System.out.print("FizzBuzz ");
            }
            else if(num%3 == 0){
                System.out.print("Fizz ");
            }
            else if(num%5 == 0){
                System.out.print("Buzz ");
            }
            else{
                System.out.print(num+" ");
            }
         print(num+1);        
    }
}
