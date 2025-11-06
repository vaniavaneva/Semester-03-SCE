package lab01;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter company's name: ");
        String name = in.nextLine();
        System.out.print("Enter company's address: ");
        String address = in.nextLine();
        System.out.print("Enter company's phone: ");
        int phone = in.nextInt();
        System.out.print("Enter company's fax number: ");
        String fax = in.nextLine();
        System.out.print("Enter company's website: ");
        String web = in.nextLine();
        System.out.print("Enter company's manager's name: ");
        String manName = in.nextLine();
        System.out.print("Enter manager's last name: ");
        String manLast = in.nextLine();
        System.out.print("Enter manager's phone: ");
        int manPhone = in.nextInt();
        System.out.printf("Company's name: %s", name);
        System.out.printf("Company's address: %s", address);
        System.out.printf("Company's phone: %010d%n", phone);
        System.out.printf("Company's fax: %010d%n", fax);
        System.out.printf("Company's website: %s", web);
        System.out.printf("Manager's name: %s %s", manName, manLast);
        System.out.printf("Manager's phone: %010d%n", manPhone);
        in.close();
    }
}
