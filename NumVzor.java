import java.util.Scanner;

public class NumVzor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej cislo");
        String decision = sc.nextLine();

        for(int i = 0; i < decision.length(); i++) { //substring od nuly do delky cisla a implementovat dekrementaci
            System.out.println(decision.substring(0, decision.length() - i));
        }
    }
}
