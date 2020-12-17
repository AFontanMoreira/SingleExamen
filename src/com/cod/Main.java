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
    //Aqui modifique los nombres de as clases y los parametros como conexion para que sean mas entendibles y comodos de ver
    public static boolean conexion(String direccion) {
        // creas una instancia del singleton y se utiliza
        Comparacion enlace = Comparacion.getInstance(direccion);
        System.out.println("Conectando a " + enlace.ip + ", con el usuario " + direccion);
        return enlace.diferenciar();
    }

    public static boolean segundaConexion() {
        //Aqui se realiza como en la clase anterior
        Comparacion segundoEnlace = Comparacion.getInstance();
        System.out.println("Conectando a :" + segundoEnlace.ip + ", con el usuario " + segundoEnlace.direccion);
        return segundoEnlace.diferenciar();
    }
}
