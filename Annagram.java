import java.util.Arrays;
import java.util.Scanner;
public class Annagram {

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the word1");
            String word1 = sc.nextLine();

            System.out.println("Please enter the word2");
            String word2 = sc.nextLine();

            word1 = word1.replace(" ", "");
            word2 = word2.replace(" ", "");

            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();

            char a[] = word1.toCharArray();
            char b[] = word2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            Boolean resultat = Arrays.equals(a, b);
            if (resultat == true) {
                System.out.println("the two words comparing are ANNAGRAM");
            } else {
                System.out.println("the two words comparing are not ANNAGRAM");
            }

        }
    }





}
