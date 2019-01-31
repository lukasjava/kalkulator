package com.company;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int L1;
        int L2;
        //ty
        char odpowiednieftytfytgf_znak;

        Scanner wej = new Scanner(System.in);
        System.out.println("podaj liczbe pierwsza:");
        L1 = wej.nextInt();

        System.out.println("podaj liczbe drugą");
        L2 = wej.nextInt();

        System.out.println("dodawanie: wpisz +");
        System.out.println("odejmowanie: wpisz -");
        System.out.println("mnożenie: wpisz *");
        System.out.println("dzielenie: wpisz /");
        System.out.println("modulo: wpisz %");

        odpowiedni_znak = wej.next().charAt(0);
        switch (odpowiedni_znak) {
            case '+': {
                int wynikSumy = L1 + L2;
                boolean prawda = true;
                System.out.println("L1 + L2 = " + wynikSumy  + " dalsza czesc " + "  kolejna czesc " + 2 + "  " + prawda
                );
                break;
            }
            case '-': {
                System.out.println("L1 - L2");

                break;
            }
            case '*': {
                System.out.println("L1*L2");
                break;
            }
            case '/': {
                if (L2 != 0) {
                    System.out.println("L1 / L2" + "oraz reszty: " + L1 % L2);
                } else {
                    System.out.println("nie dziel przez zero");
                }

                break;
            }
            case '%': {
                if (L2 != 0) {
                    System.out.println("L1 % L2");
                } else {
                    System.out.println("nie dziel przez zero");

                }

            }
        }
    }
}

