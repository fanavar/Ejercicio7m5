package cl.awakelab.ejercicio7m5;

public class Modelo {
    public static final int DEBIL = 0;
    public static final int MEDIA = 1;
    public static final int FUERTE = 2;

    public int validarClave(String password){

        if (password.length()< 5){
            return DEBIL;
        }
        //la siguiente linea lleva la pass a minusculas ( .toLowerCase) luego la compara
        //mediante .equals con la misma pass y como no tiene mayusculas es media
        else if (password.equals(password.toLowerCase())) {
            return MEDIA;
        }else {
            return FUERTE;
        }
    }
}
