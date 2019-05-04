public class IF2 {
    public static void main(String[] args) {
        int age = 15;
        int age2 = 32;

        if (age >= 18 || age2 >= 18){
            System.out.println("You can enter");
        }else{
            System.out.println("You can't enter");}

        if (age >= 18 && age2 >= 18){
            System.out.println("You can enter");
        }else{
            System.out.println("You can't enter");}

        if (age != 18 || age2 != 18){
            System.out.println("You can enter");
        }else{
            System.out.println("You can't enter");}

        if (age == 18 || age2 == 18){
            System.out.println("You can enter");
        }else{
            System.out.println("You can't enter");}
    }
}
