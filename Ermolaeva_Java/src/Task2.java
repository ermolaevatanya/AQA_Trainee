import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String x = scanner.nextLine();
        String name = "Вячеслав";
        boolean isName = Objects.equals(x, name);
        if(isName){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
