package MyPackage;


import java.util.Formatter;

public class Figura {

    float dlugoscPocz,h,zmniejszonaWartosc=1,x,polePrzed,polePo,tangens;

    public void figura(int dlugosc,int wysokosc){
        Formatter formatDlugosc = new Formatter();
        Formatter formatPole = new Formatter();
        String formatowanePole,formatowenaDlugosc;
        dlugoscPocz = (float)dlugosc;
        h = (float) wysokosc;
        x=dlugosc;
        tangens = (h/dlugoscPocz);
        polePrzed = x*h/2;
        x--;
        polePo = ((h + (h-tangens*x)) * x) / 2;
        zmniejszonaWartosc++;

        while(polePrzed>=polePo){ // pole po zmniejszeniu długosci początkowej dalej się zmnejsza
            nowePole();
        }
        formatPole.format("Najmniejsze pole uzyskanej figury to: %.2f",polePrzed);
        formatowanePole = formatPole.toString();
        System.out.println(formatowanePole);
        formatDlugosc.format("%.2f",x/dlugoscPocz*100);
        formatowenaDlugosc = formatDlugosc.toString();
        System.out.println("Taka wartosc pola uzyskamy kiedy ugniemy trojkat w " + formatowenaDlugosc+ "% dlugosci podstawy");

    }
    public void nowePole(){
        polePrzed = polePo;
        x--;
        if(zmniejszonaWartosc<=x) { //nowy trojkat nie wystaje poza krawedz h więc otrzymana figura to trapez - liczę jego pole
            polePo = ((h + (h-tangens*x)) * x) / 2;
        }else{ // nowy mniejszy trójkąt wystaje poza trapez więc pole całej figury to pole trapezu + pole mniejszego trojkąta
            polePo = (((h + (h-tangens*x)) * x) / 2) + (zmniejszonaWartosc-x)*tangens*(zmniejszonaWartosc-x)/2;
        }

        zmniejszonaWartosc++; // zaginamy trojkat dalej
    }
}
