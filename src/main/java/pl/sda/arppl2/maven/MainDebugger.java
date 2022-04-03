package pl.sda.arppl2.maven;

public class MainDebugger {
    public static void main(String[] args) {
//Deklaracje:
        //Zmienna z wartością którą jest liczba całkowita
        int a;
        a = 5;
                a =a+1;

        //Zmienna z wartością która jest zmienną przecinkową
        //duża precyzja 64 bity =8 bajtów
        double b;
        //małej precyzji 32 bity =4 bajty
        float c;
        //ctrl+d duplikuje
Float cc;
//duża litera float może być nulem, a typy prymitywne są pisane z małej i nie mogą być 0, double,float,byte,char,short,long
        //#########
        //Deklaracje z inicjalizacją zmienne mają zaczynać się od małej litery reszta CamelCase
        int zmiennaZWartościąCałkowitą = 5;
        zmiennaZWartościąCałkowitą = zmiennaZWartościąCałkowitą +10;
        zmiennaZWartościąCałkowitą = zmiennaZWartościąCałkowitą * 23;
        zmiennaZWartościąCałkowitą = zmiennaZWartościąCałkowitą / 7;
        zmiennaZWartościąCałkowitą = zmiennaZWartościąCałkowitą +10;
        //wypisanie wartości bez " "
        System.out.println(zmiennaZWartościąCałkowitą);
        //wypisanie treści
        System.out.println("zmiennaZWartościąCałkowitą");
        //sou i serr
        System.err.println("to jest inny wypis");

        //tekst -ciąg liter, a char to jedna
        String zmiennaZTekstem;


    }
}
