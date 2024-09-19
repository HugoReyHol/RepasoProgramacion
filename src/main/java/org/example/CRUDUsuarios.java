package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CRUDUsuarios {
    static Scanner sc = new Scanner(System.in);

    public static void insertarUsuario(ArrayList<Usuario> lista) {
        Usuario usuario = new Usuario();



        System.out.print("Introduzca el email: ");
        usuario.setIdentificador(sc.nextLine());

        System.out.print("Introduzca la contraseña: ");
        usuario.setContrasena(sc.nextLine());

        System.out.print("Introduzca el descuento: ");
        usuario.setDescuento(sc.nextFloat());

        System.out.println("¿Es usuario premium?: (1)Si / (2)No");
        int opcion = sc.nextInt();
        sc.nextLine();

        usuario.setPremium(opcion == 1);

        lista.add(usuario);

    }

    public static void buscarUsuario(ArrayList<Usuario> lista, String email) {
        for (Usuario u : lista) {
            if (u.getIdentificador().equals(email)) System.out.println(u);

        }
    }

    public static void totalIngreso(ArrayList<Usuario> lista) {
        float total = 0;

        for (Usuario u : lista) {
            if (u.isPremium()) total += 35.5f;
            else total += 20.5f;

            total -= u.getDescuento();

        }

        System.out.println("El total de ingresos es " + total + "€.");
    }
}
