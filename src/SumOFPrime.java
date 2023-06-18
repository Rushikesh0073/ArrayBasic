import java.util.Scanner;
public class SumOFPrime {
    public static void main(String[] args) {
        int sum=0;
        System.out.println(sum);
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end= sc.nextInt();
        boolean isprime = true;

               for( int num=0;num<end;start++)
               {
                   for ( int i=2;i<=Math.sqrt(num);i++)
                   {
                      //for (int j = 2; j<Math.sqrt(i); j++) {
                    if (num%i == 0) {
                        isprime = false;
                        break;
                    }
                    if (isprime == true) {
                     sum=sum+num;
                        System.out.println(sum);
                    }



            }

        }

    }
}
