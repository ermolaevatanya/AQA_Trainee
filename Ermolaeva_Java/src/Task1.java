import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = Integer.parseInt(scanner.nextLine());
        if(x > 7){
            System.out.println("Привет");
        } else {
            System.out.println("Число меньше или равно 7");
        }
    }
}
