import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String Sentence = sc.nextLine();

        System.out.print("Enter a word to find: ");
        String w1 = sc.next();

        System.out.print("Enter a word to replace: ");
        String w2 = sc.next();

        String out = "";

        int iterator = 0;

        for (int i = 0; i < Sentence.length(); i++) {
            if (Sentence.charAt(i) == 32 || i + 1 == Sentence.length()) {
                String e = Sentence.substring(iterator, i + 1);
                iterator = i + 1;
                e = e.trim();
                if (e.equals(w1)) out += w2 + " ";
                else out += e + " ";
            }
        }

        System.out.println(out);
    }
}
