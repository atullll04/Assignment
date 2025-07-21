import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        int a,b,sum;
        Scanner input = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter your num: ");
         a = input.nextInt(); 

         System.out.print("Enter your other num: ");
         b = input.nextInt();
         sum=a+b;
        System.out.println(sum);

        input.close(); // Close the scanner
    }
}

