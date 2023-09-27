import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age;

        System.out.println("How old are you?");
        if (scan.hasNextInt()) {
            age = scan.nextInt();
            if (age >= 21){
                System.out.println("You get a wristband");
            }

        } else {
            System.out.println("The value you entered is incorrect");
        }
    }
}