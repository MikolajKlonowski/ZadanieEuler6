package klonowski.mikolaj.euler5;

public class Euler6 {
    public static void main(String[] args) {
        Euler6 euler6 = new Euler6();
        int wynik1= euler6.sumaKwadaratowLiczb(1000);
    int wynik2 = euler6.kwadratSumyLiczb(1000);
        System.out.println("Wynik sumy kwadratów: "+wynik1);
        System.out.println("Wynik kwadratu sumy: "+wynik2);
    }

    public int sumaKwadaratowLiczb(int a) {
        int wynik = 0;
        for (int i = 0; i <= a; i++) {
            wynik += i * i;
        }
        return wynik;
    }

    public int kwadratSumyLiczb(int a) {
        int wynik = 0;
        for (int i = 0; i <= a; i++) {
            wynik += i;
        }
        wynik = wynik * wynik;

        return wynik;
    }
}
