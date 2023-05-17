import java.util.*;

public class Main {
    public static void main(String[] args) {
//        myFunction();
//        poleProstokata();
//        walec();
//        Function7();
//        stoLiczb();
//        PiecLiczbRandom();
//        MinMaxList();
//        zlicznanieWyrazow();
//        kalkulator();
//        liczba10();
//        convertToBinary();
        fibb();
    }
    static void myFunction() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Wpisz 1, 2 lub 3: ");
        String myNumStr = myObj.nextLine();
        int myNum = Integer.parseInt(myNumStr);
        if (myNum == 1) {
            System.out.println("Hello world!");
            // myFunction();
        } else if (myNum == 2) {
            System.out.println(21 + 65);
            // myFunction();
        } else if (myNum == 3) {
            System.out.print("Wpisz Imię: ");
            String userName = myObj.nextLine();
            System.out.print("Wpisz Nazwisko: ");
            String userSurname = myObj.nextLine();
            System.out.print("Wpisz Cenę: ");
            String userPrice = myObj.nextLine();
            System.out.println(userName + " " + userSurname + " " + userPrice + '.');
            // myFunction();
        }
    }
    static void poleProstokata() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Wpisz pierwszą stronę: ");
        String firstSideStr = myObj.nextLine();
        float firstSide = Float.parseFloat(firstSideStr);
        System.out.print("Wpisz drugą stronę: ");
        String secondSideStr = myObj.nextLine();
        float secondSide = Float.parseFloat(secondSideStr);
        float result = firstSide * secondSide;
        System.out.println(result);
    }
    static void walec() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Wpisz promień walca: ");
        String promienStr = myObj.nextLine();
        System.out.print("Wpisz wysokość walca: ");
        String wysokoscStr = myObj.nextLine();
        int promien = Integer.parseInt(promienStr);
        int wysokosc = Integer.parseInt(wysokoscStr);

        if (promien >= 0 && wysokosc >= 0) {
            float powerzchnia = (float) ((2 * Math.PI * promien * wysokosc) + (2 * Math.PI * Math.pow(promien, 2)));
            float objetosc = (float) (Math.PI * Math.pow(promien, 2) * wysokosc);
            System.out.println(powerzchnia + "- powierzchnia walca");
            System.out.println(objetosc + "- objętość walca");
        }
    }
    static void Function7() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        String pierwszaLiczbaStr = myObj.nextLine();
        System.out.print("Podaj drugą liczbę: ");
        String drugaLiczbaStr = myObj.nextLine();
        int pierwszaLiczba = Integer.parseInt(pierwszaLiczbaStr);
        int drugaLiczba = Integer.parseInt(drugaLiczbaStr);
        if (pierwszaLiczba == drugaLiczba) {
            System.out.println(drugaLiczba * 3);
        } else {
            System.out.println(pierwszaLiczba + drugaLiczba);
        }
    }
    static void stoLiczb() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            ++i;
        }
    }
    static void PiecLiczbRandom() {
        int i = 0;
        while (i < 5) {
            int n = (int) Math.floor(Math.random() * 99 + 1);
            System.out.println(n);
            ++i;
        }
    }
    static void MinMaxList() {
        int[] list = {1, 2, 3, 4, 123, 405, -13, 545};
        int min = list[0];
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
            if (list[i] < min) {
                min = list[i];
            }
        }
        System.out.println(String.valueOf(min) + " - element minimalny");
        System.out.println(String.valueOf(max) + " - element maksymalny");
    }
    static void zlicznanieWyrazow() {
        String str = "Ja cię pierdolę kobyła mała";
        int arrayWords = str.split(" ").length;
        System.out.println(arrayWords + " - ilość wyrazów");
        System.out.println(str.length() + " - ilość liter");
        String[] letters = str.split("");
        Map lettersCounter = new HashMap();
        for (String l : letters) {
            if (lettersCounter.containsKey(l) == false) {
                int count = 0;
                for (int i = 0; i < letters.length; i++) {
                    if (letters[i] == l) {
                        count++;
                    }
                }
                lettersCounter.put(l, count);
            }
        }
        System.out.println(lettersCounter);
    }
    static void kalkulator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz operator aryfmetyczny(+, -, * lub /): ");
        String operator = scanner.nextLine();
        System.out.print("Podaj pierwszą liczbę: ");
        String pierwszaLiczbaStr = scanner.nextLine();
        System.out.print("Podaj drugą liczbę: ");
        String drugaLiczbaStr = scanner.nextLine();
        int pierwszaLiczba = Integer.parseInt(pierwszaLiczbaStr);
        int drugaLiczba = Integer.parseInt(drugaLiczbaStr);
        if (operator.equals("+")) {
            int wynik = pierwszaLiczba + drugaLiczba;
            System.out.println("Suma liczb jest równa: " + wynik);
        } else if (operator.equals("-")) {
            int wynik = pierwszaLiczba - drugaLiczba;
            System.out.println("Różnica liczb jest równa: " + wynik);
        } else if (operator.equals("*")) {
            int wynik = pierwszaLiczba * drugaLiczba;
            System.out.println("Iloczyn liczb jest równa: " + wynik);
        } else if (operator.equals("/")) {
            int wynik = pierwszaLiczba / drugaLiczba;
            System.out.println("Iloraz liczb jest równa: " + wynik);
        }
    }
    static void liczba10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int liczbaCalkowita = scanner.nextInt();
        if (liczbaCalkowita < 10) {
            System.out.println("Ta liczba jest za mała");
        } else if (liczbaCalkowita >= 10) {
            System.out.println("Ta liczba jest wystarczająco duża");
        }
    }
    static void convertToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        String liczbaCalkowitaStr = scanner.nextLine();
        int liczbaCalkowita = Integer.parseInt(liczbaCalkowitaStr);
        int binary[] = new int[40];
        int index = 0;
        while(liczbaCalkowita > 0){
            binary[index++] = liczbaCalkowita%2;
            liczbaCalkowita = liczbaCalkowita/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();
    }
    public static void fibb() {
        int maxNumber = 0;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.println("How many numbers you want in Fibonacci:");
        Scanner scanner = new Scanner(System.in);
        maxNumber = scanner.nextInt();
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}