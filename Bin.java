import java.util.Scanner;

public class Bin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //int num;

        System.out.println("Zadej cislo. ");
        int num = sc.nextInt();

        //int modulo = (num % 2);

        while(num > 0){
            System.out.print(num % 2);
            num = (num / 2);
        }
    }
}
