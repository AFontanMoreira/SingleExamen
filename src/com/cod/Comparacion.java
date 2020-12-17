package com.cod;

public class Comparacion {
    //En esta clase tambien estan aplicados los formatos de la main
    /*Aqui le cambie el nombre de los atributos por unos q me parecian mas adecuados y tambien el nombre de la clase
     por uno que se entendiese lo que hacia sin tener que leer el codigo
    */
    public static String direccion = "";
    String ip = "127.0.0.2";

    private static Comparacion instance = null;
/*
Se crea un get instance que es donde se le van a dar las instancias en el main y
 mira si ya hay alguna creada si es asi se borra y se crea otra nueva
 */

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
