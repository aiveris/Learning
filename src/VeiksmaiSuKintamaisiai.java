import java.util.Scanner;

public class VeiksmaiSuKintamaisiai {

    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        int num1, num2, ats;

        System.out.println("Enter first number: ");
        num1 = keyboard.nextInt();

        System.out.println("Enter second number: ");
        num2 = keyboard.nextInt();

        ats=num1+num2;
        System.out.println("Answer: " +ats);

    }
}
