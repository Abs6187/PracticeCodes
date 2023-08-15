import java.util.Scanner;
public class cwh_12_ps5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of v");
        int v = sc.nextInt();
        System.out.println("Enter the Value of u");
        int u = sc.nextInt();
        System.out.println("Enter the Value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of s");
        int s = sc.nextInt();
        float sum = (v*v - u*u) / (2.0f*a*s);
        System.out.println(sum);

    }
    
}
