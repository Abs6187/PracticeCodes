import java.util.Scanner;


public class percentage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Subject1 marks");
        System.out.println("Subject2 marks");
        System.out.println("Subject3 marks");
        System.out.println("Subject4 marks");
        float Sub1 = scan.nextFloat();
        float Sub2 = scan.nextFloat();
        float Sub3 = scan.nextFloat();
        float Sub4 = scan.nextFloat();

        float percentage = ((Sub1 + Sub2 + Sub3 + Sub4) / 400) * 100;
        System.out.println("percentage:");
        System.out.println(percentage);
    }
}