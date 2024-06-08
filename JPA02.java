import java.util.Scanner;
public class JPA02 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();

    }
    public static void test() {
        System.out.println("Input:");
        Scanner sc = new Scanner(System.in); 
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();

            if(a>b)
                   System.out.printf("%d is large than %d\n",a,b);

            else if(b>a)
                   System.out.printf("%d is large than %d\n",b,a);

            else
                   System.out.printf("%d is equal to %d\n",a,b);


        }





    }


