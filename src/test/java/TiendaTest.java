import es.formacion.cip.entornos.poo.Articulo;
import es.formacion.cip.entornos.poo.Main;
import es.formacion.cip.entornos.poo.Tienda;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Clase principal de test
 */
public class TiendaTest {

    Tienda tienda = new Tienda();
    Articulo articulo = new Articulo(1,"articuloPrueba",30.5);
    Main main = new Main();
    @Before
    public void before(){

    }

    /**
     * Test
     */
    @Test
    public void nullClassTest(){
        Assert.assertNotNull("No puede ser nulo",main);
        Assert.assertNotNull("No puede ser nulo",tienda);
        Assert.assertNotNull("No puede ser nulo",articulo);
        Assert.assertNotNull("No puede ser nulo",articulo.toString());
        Assert.assertNotNull("No puede ser nulo",articulo.getId());
        Assert.assertNotNull("No puede ser nulo",articulo.getNombre());
        Assert.assertNotNull("No puede ser nulo",articulo.getPrecio());
    }




}
