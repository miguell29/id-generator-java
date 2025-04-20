import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String name;
        String lastname;
        Integer yearDate;
        String id;
        var console = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\t\tID GENERATOR");
        System.out.print("Name: ");
        name = console.nextLine();
        System.out.print("Lastname: ");
        lastname = console.nextLine();
        System.out.print("Year Date (YYYY): ");
        yearDate = Integer.parseInt(console.nextLine());




        int number = random.nextInt(1,9999);
        //WE NORMALIZE VALUES
        name = name.trim().toUpperCase();
        lastname = lastname.trim().toUpperCase();

        id = name.substring(0,2)
                .concat(lastname.substring(0,2)
                        .concat(yearDate.toString().substring(2))
                        .concat(String.format("%04d",number)));

        System.out.println("\tID GENERATED CORRECTLY");
        System.out.println("id = " + id);
    }
}
