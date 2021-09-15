import java.util.Scanner;

public class Bin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //int num;

        System.out.println("Zadej cislo. ");
        int num = sc.nextInt();
        
        System.out.println(Integer.toString(num, 2));
    }
}
