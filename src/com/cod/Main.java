package com.cod;

public class Main {
    public static void main(String[] args) {
        if (conexion("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        if (segundaConexion()) {
            System.out.println("Listo ");
        } else {
            System.out.println("Fallo");
        }
        ;
    }

    public static boolean conexion(String direccion) {
        Comparacion direcc = new Comparacion(direccion);
        System.out.println("Conectando a " + direcc.ip + ", con el usuario " + direccion);
        return direcc.con();
    }

    public static boolean segundaConexion() {
        Comparacion segundoEnlace = new Comparacion();
        System.out.println("Conectando a " + segundoEnlace.ip + ", con el usuario " + segundoEnlace.direccion);
        return segundoEnlace.con();
    }
}
