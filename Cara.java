import java.util.Scanner;

public class  Cara {

    public static void main(String args[]) {
        // program, který se zeptá uživatele "Jak dlouhou čáru chceš vykreslit"
        // program následně vygeneruje čáru z teček

        int decision, dotCountIndex = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Jak dlouha ma byt cara? ");
        decision = sc.nextInt();

        System.out.println("*cara* xdd");
        for(int x = 0; x < decision; x++) {
            System.out.print("."); // tady vymyslet jak udelat output tecek a propojit to s inkrementaci
        }
    }
}
