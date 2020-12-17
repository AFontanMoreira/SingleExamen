package com.cod;

public class Comparacion {
    //En esta clase tambien estan aplicados los formatos de la main
    public static String direccion = "";
    String ip = "127.0.0.2";

    private static Comparacion instance = null;

    public static  Comparacion getInstance(){
        if (instance == null){
            instance = new Comparacion();
        }
        direccion = "anonymous@danielcastelao.org";
        return instance;
    }
    public static  Comparacion getInstance(String direcc){
        if (instance == null){
            instance = new Comparacion();
        }
        direccion = direcc;
        return instance;
    }

    public boolean diferenciar() {
        if (direccion != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false ;
        }
    }
}
