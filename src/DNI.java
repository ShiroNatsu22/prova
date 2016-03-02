import com.esliceu.ProvaCaixaNegre;

/**
 * test de javadoc
 *@author joshua
 */

public class DNI {
    public static void main(String[] args) {
        ProvaCaixaNegre p = new ProvaCaixaNegre(43206702);

        System.out.println(p.lletraDNI(1));

        /*prova DNI
          que pasa si no posam int:funciona
          Que validi dni:no
          Comprobar que es complesquin es requisits de longitud: no, es pasa de 1 numero.
          primer i darrer valor= no, ja que podem posar 2 numeros per exemple y funciona

         */
    }
}
