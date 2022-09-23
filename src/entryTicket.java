import java.util.Scanner;
public class entryTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        if (age >= 21) {
            System.out.println("you get a wrist band");
        }
    }
}