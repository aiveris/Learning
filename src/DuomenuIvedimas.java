import java.util.Scanner;
public class DuomenuIvedimas {
    public static void main(String[] args) {
        String name;
        int height;
        int age;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = keyboard.nextLine();

        System.out.println("Enter your height: ");
        height = keyboard.nextInt();

        System.out.println("Enter your age: ");
        age = keyboard.nextInt();

        System.out.println("Your name is: "+name);
        System.out.println("Your heeigt is: "+height);
        System.out.println("Your age is: "+age);

    }

}
