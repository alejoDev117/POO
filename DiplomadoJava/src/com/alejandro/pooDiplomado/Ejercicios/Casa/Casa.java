package com.alejandro.pooDiplomado.Ejercicios.Casa;

public class Casa {
    private final String CIUDAD;
    private final String DIRECCION;
    private final String COLOR;
    private final int CANTIDAD_BAÑOS;
    private final int CANTIDAD_HABITACIONES;
    private final int CANTIDAD_COCINAS;

    public Casa(String CIUDAD, String DIRECCION, String COLOR, int CANTIDAD_BAÑOS, int CANTIDAD_HABITACIONES, int CANTIDAD_COCINAS) {
        this.CIUDAD = CIUDAD;
        this.DIRECCION = DIRECCION;
        this.COLOR = COLOR;
        this.CANTIDAD_BAÑOS = CANTIDAD_BAÑOS;
        this.CANTIDAD_HABITACIONES = CANTIDAD_HABITACIONES;
        this.CANTIDAD_COCINAS = CANTIDAD_COCINAS;
    }

    public String getCIUDAD() {
        return CIUDAD;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public int getCANTIDAD_BAÑOS() {
        return CANTIDAD_BAÑOS;
    }

    public int getCANTIDAD_HABITACIONES() {
        return CANTIDAD_HABITACIONES;
    }

    public int getCANTIDAD_COCINAS() {
        return CANTIDAD_COCINAS;
    }
}
