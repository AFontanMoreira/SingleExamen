package com.cod;

public class Main {
    //Hice un cambio de formatos para que el intellij ponga los espacios para que siga la convencion
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
        Comparacion enlace = Comparacion.getInstance(direccion);
        System.out.println("Conectando a " + enlace.ip + ", con el usuario " + direccion);
        return enlace.diferenciar();
    }

    public static boolean segundaConexion() {
        Comparacion segundoEnlace = Comparacion.getInstance();
         segundoEnlace = new Comparacion();
        System.out.println("Conectando a :" + segundoEnlace.ip + ", con el usuario " + segundoEnlace.direccion);
        return segundoEnlace.diferenciar();
    }
}
