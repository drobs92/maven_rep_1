package pl.sda.arppl2.maven;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        System.out.println("Wpisz swoje imie: ");
        Scanner scanner= new Scanner(System.in);
        //przypisanie, że to co się wpisze bedzie nazywało się słowo
        String slowo = scanner.next();

        System.out.println("cześć " + slowo + ",jesteś spoko");
        //deklaracja zmiennej liczba i przypisanie jej wartości, która jest wynikiem fukncji nextint z scannera
        System.out.println("ile masz lat?");
int liczba = scanner.nextInt();

liczba = liczba/10;

        System.out.println("Czy wiesz, że żyjesz już od " + liczba + " dekad");
    }
}
