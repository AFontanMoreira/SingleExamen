package com.cod;

public class Comparacion {
    String direccion = "";
    String ip = "127.0.0.2";

    Comparacion() {
        direccion = "anonymous@danielcastelao.org";
    }

    Comparacion(String direccion) {
        this.direccion = direccion;
    }

    public boolean con() {
        if (direccion != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
