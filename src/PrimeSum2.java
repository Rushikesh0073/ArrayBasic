
import  java.util.Scanner;
    public class PrimeSum2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int sum = 0;
            for (int num= start; num<=end; num++) {
                if (isPrime(num)) {
                    sum=sum+ num;
                }
            }
            System.out.println(sum);
        }
        private static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

