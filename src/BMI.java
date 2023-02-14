import java.util.Scanner;

public class BMI {
    public static void calculate(){
        Scanner sc = new Scanner(System.in);

        double height, weight, bmi;

        System.out.println("Enter your height : (Exm: 1.79)");
        height = sc.nextDouble();

        System.out.println("Enter your weight : (Exm: 86)");
        weight = sc.nextDouble();
        sc.close();
        bmi = (weight / (height * height));

        System.out.println("Your body mass index is : " + bmi);


    }
}
