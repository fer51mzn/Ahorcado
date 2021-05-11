package com.fernando.ui;

import java.util.Scanner;

public class Menu {

    public void principal(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1) Jugar\n2) Palabras\n3) Salir\nOpcion: ");
            String opcionText = scanner.nextLine();
            if (opcionText.equals("1")) {
                menuCampeonatos.principal();
            } else {
                break;
            }
        }
    }
}
