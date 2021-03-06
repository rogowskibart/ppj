class Ppj10 {
    public static void main(String[] args) {
        // Zadanie I
        System.out.println("\nZadanie I\n");

        int varInt = 1;
        float varFloat = 2.0f;
        char varChar = 3;
        byte varByte = 4;
        ZbiorMetod zm = new ZbiorMetod();
        zm.ustalWartosc(varInt);
        zm.ustalWartosc(varFloat);
        zm.ustalWartosc(varChar);
        zm.ustalWartosc(varByte);

        // Zadanie II
        System.out.println("\nZadanie II\n");
        zm.ustalWartosc(varInt);
        zm.ustalWartosc(varFloat);
        Liczba liczba = new Liczba();
        liczba.przypiszWartosc(1);
        zm.ustalWartosc(liczba);

        // Zadanie III
        System.out.println("\nZadanie III\n");
        Osoba osoba = new Osoba();
        osoba.imie = "Janusz";
        osoba.nazwisko = "Programista";
        osoba.rokUrodzenia = 1970;

        // Zadanie IV
        System.out.println("\nZadanie IV\n");
        System.out.println("Z inicjalizacja:");
        osoba.show();

        System.out.println("\nBez inicjazlizacji:");
        Osoba osoba2 = new Osoba();
        osoba2.show();

        // Zadanie V
        System.out.println("\nZadanie V\n");
        LiczbaZespolona liczba1 = new LiczbaZespolona(1, 2);
        LiczbaZespolona liczba2 = new LiczbaZespolona(0, 5);
        LiczbaZespolona liczba3 = new LiczbaZespolona(6, 1);
        LiczbaZespolona liczba4 = new LiczbaZespolona(7, 8);
        LiczbaZespolona liczba5 = new LiczbaZespolona(4, 9);

        liczba1.wyswietlln();
        liczba2.wyswietlln();
        liczba3.wyswietlln();
        liczba4.wyswietlln();
        liczba5.wyswietlln();

        System.out.println("Dodawanie");
        liczba1 = liczba1.dodaj(liczba5);
        liczba2 = liczba2.dodaj(liczba4);
        liczba3 = liczba3.dodaj(liczba5);

        System.out.println("Odejmowanie");
        liczba4 = liczba4.odejmij(liczba2);
        liczba5 = liczba5.odejmij(liczba1);
        liczba3 = liczba3.odejmij(liczba4);

        System.out.println("Mnozenie");
        liczba1 = liczba1.pomnoz(liczba2);
        liczba3 = liczba3.pomnoz(liczba5);
        liczba4 = liczba4.pomnoz(liczba1);

        System.out.println("Zwiekszenie czesci rzeczywistej o 1");
        liczba1 = liczba1.zwieksz();
        liczba3 = liczba3.zwieksz();
        liczba4 = liczba4.zwieksz();

    }
}
