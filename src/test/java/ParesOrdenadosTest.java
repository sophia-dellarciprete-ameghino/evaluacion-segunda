import org.junit.Assert;
import org.junit.Test;

/**
 * Created by damian on 02/09/16.
 */
public class ParesOrdenadosTest {

    @Test
    public void crearParOrdenado(){
        //Tipar la Clase Par
        Par dosTres = new Par(2,3);

        Assert.assertEquals(dosTres.first(), 2);
        Assert.assertEquals(dosTres.second(), 3);
    }

    @Test
    public void elPrimero(){
        Par<String, Integer> dosTres = new Par("casa",3);

        Assert.assertEquals(dosTres.first(), "casa");
    }

    @Test
    public void elSegundo(){
        Cuadrado c = new Cuadrado(2);
        Par dosTres = new Par("casa",c);

        Assert.assertEquals(dosTres.second(), c);
    }

    @Test
    public void elPrimero2(){
        //Tipar las siguientes variables:

        Par<String, Double> par = new Par("casa",2d);
        Cuadrado c = new Cuadrado(1);
        Rectangulo r = new Rectangulo(2,3);
        Par<Cuadrado, Rectangulo> par2 = new Par(c,r);

        Par<Par<String, Double>, Par<Cuadrado, Rectangulo>> parGroso = new Par(par,par2);

        //acceder a la base del rectangulo que esta dentro de la variable parGroso

        Assert.assertEquals(parGroso.second().second().area() , r.area(),0);

    }

}
