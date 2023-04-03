import java.util.Arrays;
import java.util.Scanner;

public class StringTest {
    Scanner scanner = new Scanner(System.in);
    boolean a;

    public void str(String s) {
        System.out.println(s.charAt(13));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.replace('a', 'o'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(7, 11));
        System.out.println();
    }

    public void findPalindrome(String text) {
        String[] array = text.split(" ");
        for (int i = 0; i < array.length; i++) {
            String s1 = array[i];
            char[] array1 = s1.toCharArray();
            for (int j = 0; j < array1.length / 2; j++) {
                if (array1[j] == array1[array1.length - j - 1]) {
                    a = true;
                } else {
                    a = false;
                }
            }
            if (a == true) {
                System.out.println(s1);
            }
        }

    }

    public void findWords3To5Letters(String text) {
        String[] array = text.split(" ");
        for (int i = 0; i < array.length; i++) {
            String s1 = array[i];
            if (s1.length() >= 3 && s1.length() <= 5) {
                System.out.println(s1);
            }
        }
    }

    public String findTheSmallestWord(String text) {
        String[] array = text.split(" ");
        String minWord = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() <= minWord.length()) {
                minWord = array[i];
            }
        }
        return minWord;
    }

    public String findTheBiggestWord(String text) {
        String[] array = new String[]{Arrays.toString(text.split(" "))};
        String maxWord = "a";
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() >= maxWord.length()) {
                maxWord = array[i];
            }
        }
        return maxWord;
    }

    public void testStringBuilder() {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        builder.append(3).append(" ").append("+").append(" ").append(56).append(" ").append("=").append(" ").append(59);
        System.out.println(builder);
        builder1.append(3).append(" ").append("-").append(" ").append(56).append(" ").append("=").append(" ").append("-").append(59);
        System.out.println(builder1);
        builder2.append(3).append(" ").append("*").append(" ").append(56).append(" ").append("=").append(" ").append(168);
        System.out.println(builder2);
    }

    public void sumWords() {
        System.out.println("Введите два слова состоящих из четного числа букв");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(s1.substring(0, (s1.length() / 2)) + s2.substring(s2.length() / 2, s2.length()));
    }
}
