import java.util.Scanner;
public class Show20Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of prime numbers to print: ");
        int numbers = scanner.nextInt();

        int count = 0;
        int N = 2;

        while (count < numbers) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
}
