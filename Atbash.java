import java.util.Scanner;

public class Atbash {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("text k zasifrovani: ");
        String textik = sc.nextLine();

        String encrypted = textik.replace("a", "z")
                .replace("b","y")
                .replace("c","x")
                .replace("d","w")
                .replace("e","v")
                .replace("f","u")
                .replace("g","t")
                .replace("h","s")
                .replace("i","r")
                .replace("j","q")
                .replace("k","p")
                .replace("l","o")
                .replace("m","n")
                .replace("n","m")
                .replace("o","l")
                .replace("p","k")
                .replace("q","j")
                .replace("r","i")
                .replace("s","h")
                .replace("t","g")
                .replace("u","f")
                .replace("v","e")
                .replace("w","d")
                .replace("x","c")
                .replace("y","b")
                .replace("z","a");

        System.out.println(encrypted);
    }
}
