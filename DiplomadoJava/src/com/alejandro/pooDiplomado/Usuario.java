package com.alejandro.pooDiplomado;

import com.alejandro.pooDiplomado.Ejercicios.Destinatario;

import java.util.UUID;

public class Usuario extends Destinatario{
   private String tipoUsuario;

   public Usuario(UUID identificador, String correo, long identificacion, String tipoidentificaicon,String tipoUsuario){
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
