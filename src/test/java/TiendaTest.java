import es.formacion.cip.entornos.poo.Articulo;
import es.formacion.cip.entornos.poo.Tienda;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TiendaTest {
    Tienda tienda = new Tienda();
    Articulo[] articulosEsperados;
    @Before
    public void before(){


    }

    @Test
    public void llenarAlmacenTest(){
        Assert.assertNotNull("Es nulo",tienda);
       // Assert.assertArrayEquals(articulosEsperados,tienda.llenarAlmacen());
    }

    @Test
    public void mostrarInventarioTest(){
        Assert.assertNotNull("Es nulo",tienda);
    }


}
