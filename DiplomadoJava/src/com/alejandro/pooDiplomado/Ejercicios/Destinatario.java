package com.alejandro.pooDiplomado.Ejercicios;

import java.util.UUID;

public abstract class Destinatario {
    protected UUID identificador;
    protected String correoInstitucional;
    protected long identificacion;
    protected String tipoIdentificacion;


    protected abstract UUID getIdentificador();

    protected abstract void setIdentificador(UUID identificador);

    protected abstract String getCorreoInstitucional();

    protected abstract void setCorreoInstitucional(String correoInstitucional);

    protected  abstract  long getIdentificacion();

    protected abstract  void setIdentificacion(long identificacion);

    protected abstract String getTipoIdentificacion();

    protected abstract void setTipoIdentificacion(String tipoIdentificacion);


}
