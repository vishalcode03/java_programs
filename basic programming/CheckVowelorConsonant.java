import java.util.Scanner;


public class CheckVowelorConsonant {

    public static void checkVowelOrConsonant(char ch) {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.nextLine().charAt(0);

        CheckVowelorConsonant.checkVowelOrConsonant(ch);

        sc.close();
    }
}