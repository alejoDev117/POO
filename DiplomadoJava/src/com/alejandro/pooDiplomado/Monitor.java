package com.alejandro.pooDiplomado;

import com.alejandro.pooDiplomado.Ejercicios.Destinatario;
import com.alejandro.pooDiplomado.Ejercicios.PersonaEncargada;

import javax.lang.model.type.DeclaredType;
import java.util.UUID;

public class Monitor extends PersonaEncargada {

    @Override
    public long getNumeroCelular() {
        return 0;
    }

    @Override
    public void setNumeroCelular(long numeroCelular) {

    }

    @Override
    protected UUID getIdentificador() {
        return null;
    }

    @Override
    protected void setIdentificador(UUID identificador) {

    }

    @Override
    protected String getCorreoInstitucional() {
        return null;
    }

    @Override
    protected void setCorreoInstitucional(String correoInstitucional) {

    }

    @Override
    protected long getIdentificacion() {
        return 0;
    }

    @Override
    protected void setIdentificacion(long identificacion) {

    }

    @Override
    protected String getTipoIdentificacion() {
        return null;
    }

    @Override
    protected void setTipoIdentificacion(String tipoIdentificacion) {

    }
}
