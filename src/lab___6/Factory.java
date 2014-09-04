
import java.util.*;


/**
 * Luis Carlos Ralón    13030
 * Johnny del Cid       13032
 */

/**
 * 
 * @author Dell Latitude
 * @param opcion: Ingresa un valor de entero para elegir la implementación
 * @Set<E> : Devuelve la implementación elegida
 */
class Factory<E> {
    public Set<E> getSET(int valor)
    {
        if(valor==1)
        {
            return new HashSet<E>();
        }
        if (valor==2)
        {
            return new TreeSet<E>();
        }
        else
        {
            return new LinkedHashSet<E>();
        }
    }
    
}
