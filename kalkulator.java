import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("jaka jest twoja waga? ");
    double weight = sc.nextDouble();
    System.out.println("jaki jest twój wzrost? ");
    double height = sc.nextDouble();

    double bmi =weight/ (height * height);
    System.out.println("BMI: " + bmi);
    if (bmi < 18.5) {
        System.out.print("Niedowaga");
    }else if (bmi >= 18.5 && bmi < 24.9) {
        System.out.print("Idealna waga");
    }else if (bmi >= 24.9 && bmi < 29.9) {
        System.out.print("Nadwaga");
    } else if (bmi >= 29.9) {
        System.out.print("Otyłość");

    }

    }
}