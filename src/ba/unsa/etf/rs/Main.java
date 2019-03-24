package ba.unsa.etf.rs;

import java.util.Scanner;

public class Main {

    public static int brojVecihOdX(double[] niz, double x){
        int broj = 0;
        for (double r: niz)
            if(r > x) broj = broj + 1;
        return broj;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj clanova niza [1,100]: ");
        do {
            n = scanner.nextInt();
            if (n < 1 || n > 100){
                System.out.println("Pogresan unos!");
                System.out.print("Unesite broj clanova niza [1,100]: ");
            }
        }while (n < 1 || n >100);

        double[] niz = new double[n];
        for (int i = 0; i < n; i++){
            System.out.print("Unesite " + (i+1) + ". clan niza: ");
            niz[i] = scanner.nextDouble();
            System.out.println();
        }

        double max = niz[0];
        for (double r: niz)
            if(r > max) max = r;

        System.out.println("Elementi niza koji su veci od korijena najveceg elementa su: ");
        for (double r: niz)
            if(r > Math.sqrt(max)) System.out.print(r + " ");

    }
}