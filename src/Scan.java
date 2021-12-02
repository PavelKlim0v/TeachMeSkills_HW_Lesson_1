import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое имя, для приветствия.");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
