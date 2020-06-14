import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\nЗробіть свій вибір");
            System.out.println("1: вивести текст");
            System.out.println("2: порахувати к-сть речень у тексті.");
            System.out.println("3: порахувати к-сть слів у реченні.");
            System.out.println("4: замінити всі голосні на тире \"-\".");
            System.out.println("5: знайти слово яке найчастіше зустрічається в реченні");
            System.out.println("6: знайти слово яке  найчастіше зустрічається в тексті.");
            int input = sc.nextInt();
            switch (input) {
                case 1: {
                    System.out.println(text());
                }
                break;
                case 2: {
                    CountSentenceInText();
                    break;
                }
                case 3:{
                   CountWordsInSentence();
                   break;
                }
                case 4:{
                    ChangeVowelsInText();
                    break;
                }
                case 5:{
                   FindWordsMostCommonInSentence();
                    break;
                }
                case 6:{
                    FindWordsMostCommonInText();
                    break;
                }
            }
        }
    }

    public static void ChangeVowelsInText(){
        System.out.println(text().replaceAll("[аоуіие]", "-"));
        }

    public static void CountWordsInSentence(){
        String[] sentenceInText = text().split("[.?!]");
        for (int i = 0; i < sentenceInText.length; i++) {
            int iter = i + 1;
            String[] wordsInSentence = sentenceInText[i].split("\\s+");
            System.out.print("Кількість слів у "+iter+" реченні: ");
            System.out.println(wordsInSentence.length-1);
        }
    }

    public static void CountSentenceInText () {
                String[] sentence = text().split("[.?!]");
                System.out.println("К-сть речень у тексті: " + sentence.length);
            }

    public static void FindWordsMostCommonInSentence(){
        String[] wordsMostCommon = text().split("[.!?]");
        String[] wordsInSentence = wordsMostCommon[9].split("\\s+");
        Arrays.sort(wordsInSentence);

        String maxWord = "", word = "";
        int maxCount = 0, count = 1;

        for (String s : wordsInSentence) {
            if (s.equals(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = s;
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxWord = word;
        }
        System.out.println("Слово яке найбільше повторялося в реченні - " + maxWord + " (зустрічаеться " + maxCount + " раз)");



    }

    public static void FindWordsMostCommonInText(){
        String[] wordsMostCommon = text().split("\\s+");
        Arrays.sort(wordsMostCommon);

        String maxWord = "", word = "";
        int maxCount = 0, count = 1;

        for (String s : wordsMostCommon) {
            if (s.equals(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = s;
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxWord = word;
        }

        System.out.println("Слово яке найбільше повторялося - " + maxWord + " (зустрічаеться " + maxCount + " рази)");


    }

    public static String text () {
                return "\nПо діброві вітер виє, \n" +
                        "Гуляє по полю, \n" +
                        "Край дороги гне тополю \n" +
                        "До самого долу. \n" +
                        "Стан високий, лист широкий — \n" +
                        "Нащо зеленіє? \n" +
                        "Кругом поле, як те море \n" +
                        "Широке, синіє. \n" +
                        "Чумак іде, подивиться \n" +
                        "Та й голову схилить; \n" +
                        "Чабан вранці з сопілкою \n" +
                        "Сяде на могилі, \n" +
                        "Подивиться — серце ниє: \n" +
                        "Кругом ні билини! \n" +
                        "Одна, одна, як сирота\n" +
                        "На чужині, гине!\n" +
                        "\n" +
                        "Хто ж викохав тонку, гнучку\n" +
                        "В степу погибати?\n" +
                        "Постривайте, все розкажу,\n" +
                        "Слухайте ж, дівчата.\n" +
                        "Полюбила чорнобрива\n" +
                        "Козака дівчина.\n" +
                        "Полюбила — не спинила,\n" +
                        "Пішов та й загинув.\n" +
                        "Якби знала, що покине,—\n" +
                        "Була б не любила;\n" +
                        "Якби знала, що загине,—\n" +
                        "Була б не пустила;\n" +
                        "Якби знала, не ходила б\n" +
                        "Пізно за водою,\n" +
                        "Не стояла б до півночі\n" +
                        "З милим під вербою;\n" +
                        "Якби знала!..";
            }
    }

