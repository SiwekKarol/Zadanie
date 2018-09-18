import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój pesel");
        String number = scanner.nextLine();
        System.out.println("Podaj swoje imię");
        String name = scanner.nextLine();
        System.out.println("Podaj swoje nazwisko");
        String surname = scanner.nextLine();
        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();
        User user1 = new User(name, surname, age, number);
    }
}
