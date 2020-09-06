import java.util.Random;
import java.util.Scanner;

public class Semyon_Belyaev_homework3 {

static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        guessTheNumber();//задание 1
        guessTheWord();


    }

    static void guessTheNumber() //задание 1
    {
        Random random = new Random();
        int b = random.nextInt(10);
        System.out.println("Угадайте число от 0 до " + 9);
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("Попытка " + (i + 1) + " :");
            int a = scanner.nextInt();
            if (a > b) System.out.println("Загаданное число меньше");
            if (a < b) System.out.println("Загаданное число больше");
            if (a == b) {
                System.out.println("Вы угадали загаданное число");
                System.out.println("Повторить игру еще раз? 1- да, 0 - нет");
                int c = scanner.nextInt();
                if (c == 1) guessTheNumber();
                else {
                    System.out.println("Спасибо за игру");
                    break;

                }
            }
        }
        System.out.println("Вы не угадали");
        System.out.println("Повторить игру еще раз? 1- да, 0 - нет");
        int c = scanner.nextInt();
        if (c == 1) {
            guessTheNumber();
        } else {
            System.out.println("Спасибо за игру");
        }
    }
    static void guessTheWord()
    {

        Random random=new Random();
        int y =random.nextInt(10);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Угадайте загаданное слово");
        int l;
        String str = "words[l]";
        while (true){
            for (l=0; l<words.length;l++ ) {
                String g = scanner.next();
                words[l] = words[l] + y;
                if (g.equals(words[l])) {
                    System.out.println("Вы угадали");
                    break;
                } else
                   System.out.println("Попробуйте ещё раз");
                
            }


        }
    }
    static String maskWord(String s) {
        String mask = "###############";
        for (int i = s.length() - 1; i < mask.length() - 1; i++) {
            s += mask.charAt(i);
        }
            return s;
    }
}



