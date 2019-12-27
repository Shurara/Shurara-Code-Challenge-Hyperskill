import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       long firstNumber = sc.nextLong();
       char operation = sc.next().charAt(0);
       long secondNumber = sc.nextLong();
       switch (operation){
           case '+':{
               System.out.println(firstNumber + secondNumber);
               break;
           }
           case '-':{
               System.out.println(firstNumber - secondNumber);
               break;
           }
           case '/':{
               System.out.println(secondNumber != 0? firstNumber/secondNumber: "Division by 0!");
               break;
           }
           case '*':{
               System.out.println(firstNumber * secondNumber);
               break;
           }
           default:{
               System.out.println("Unknown operator");
           }
       }
    }
}