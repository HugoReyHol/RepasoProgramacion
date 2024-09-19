package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            ArrayList<Usuario> clientes = new ArrayList<>();

            int opcion;

            do {
                System.out.println("Elige una opción:\n" +
                        "1. -Añadir Usuario\n" +
                        "2. -Buscar Usuario\n" +
                        "3. -Total Ingresos\n" +
                        "0. -Salir\n");

                opcion = sc.nextInt();

                sc.nextLine(); //Limpia el scanner

                switch (opcion) {
                    case 1 -> {
                        CRUDUsuarios.insertarUsuario(clientes);

                    }

                    case 2 -> {
                        System.out.print("Introduzca el email del cliente: ");
                        String email = sc.nextLine();

                        CRUDUsuarios.buscarUsuario(clientes, email);

                    }

                    case 3 -> {
                        CRUDUsuarios.totalIngreso(clientes);

                    }

                    case 0 -> System.out.println("Saliendo del programa.");

                    default -> System.out.println("Opción no reconocida.");
                }

                System.out.println();

            } while (opcion != 0);

        } catch (Exception e) {
            System.out.println("Error " + e);

        }
    }
}