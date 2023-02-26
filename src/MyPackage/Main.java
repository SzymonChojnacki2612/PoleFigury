package MyPackage;

import java.util.Scanner;

public class Main {
/*
Dany jest trójkąt prostokątny o przyprostokątnych wprowadzonych przez użytkownika - wysokość h i długość boku podstawy a.
Trójkąt ten zaginamy wzdłuż podstawy a - miejsce ugięcia oznaczmy jako x.
W zależności od miejsca ugięcia uzyskana figura będzie trapezem ( uginamy trójkąt w drugiej połowie długości podstawy - x>0,5a)
albo trapezem i trójkątem ( uginamy trójkąt w pierwszej połowie długości podstawy - x<0,5a ).
Zadaniem programu jest znalezienie miejsca ugięcie ( z dokładnością co do 1 jednostki)  dla którego pole uzyskanej figury jest najmniejsze.
 */
    public static void main(String[] args) {
        System.out.println("Program rozwiazuje problem polegajacy na znalezieniu najmniejszego pola powierzchni figury, ktora powstala po zginaniu boku trojkata prostokatnego wzdluz jego podstawy.");
        char znak = 0;
        int dlugosc,wysokosc;
        Scanner scr = new Scanner(System.in);
        while(true){
            System.out.println("Czy chcesz wprowadzic nowy trojkat? T/N");
            znak = scr.next().charAt(0);
            if(znak == 'n' || znak == 'N'){
                 System.out.println("Nastepuje zamkniecie programu");
                System.exit(0);
            }else if(znak=='t'||znak=='T'){
                System.out.println("Wprowadz dlugosci bokow trojkata");
                do {
                    System.out.println("Podaj dlugosc boku");
                    dlugosc=scr.nextInt();
                    if(dlugosc<=0) System.out.println("Bok musi miec dlugosc wieksza od 0");
                }while(dlugosc<=0);

                do {
                    System.out.println("Podaj wysokosc trojkata");
                    wysokosc=scr.nextInt();
                    if(wysokosc<=0) System.out.println("Wysokosc musi byc dodatnia");
                }while(wysokosc<=0);
                Figura objekt1 = new Figura();
                objekt1.figura(dlugosc,wysokosc);
            }else {
                System.out.println("Wprowadzono niepoprawna odpowiedz");
            }
            System.out.println();
            }
    }
}
