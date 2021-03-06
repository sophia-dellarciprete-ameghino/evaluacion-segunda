import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class FigurasTest{

    @Test
    public void calcularArea() {
        Figura fig = new Rectangulo(5,10);

        Assert.assertEquals(50, fig.area(), 0);

    }

    @Test
    public void calcularPerimetro() {
        Figura fig = new Circulo(10);

        Assert.assertEquals(Math.PI*10, fig.perimetro(),0);

    }

    @Test
    public void calcularAreas(){
        Cuadrado cuadrado = new Cuadrado(1);
        Figura fig  = new Cuadrado(5);
        Figura fig2 = new Rectangulo(5,10);
        Figura fig3 = new Circulo(20);

        List<Figura> figuras = Arrays.asList(fig,fig2,fig3);

        Assert.assertEquals(1331, cuadrado.sumarAreasDeFiguras(figuras),10);
    }

    /* Clase del 15/08 */

    @Test
    public void comp () {
        Figura f1 = new Cuadrado(10);
        Figura f2 = new Circulo(12);
        boolean comp = f1.compararPerimetros(f2);

        Assert.assertTrue(comp);
    }

    @Test
    public void nTest (){
        Figura f1 = new Cuadrado(5);
        Figura f2 = new Circulo(10);
        Figura f3 = new Rectangulo(20, 10);

        List <Figura> figuras = new ArrayList<Figura>();

        figuras.add (f1);
        figuras.add (f2);
        figuras.add (f3);

        Dibujo d = new Dibujo (figuras);

        Assert.assertEquals(539, d.area(),10);
    }


    /* Clase del 22/08*/

    @Test
    public void figuraEnFigura(){


        Figura f1 = new Cuadrado(5);
        Figura f2 = new Cuadrado(10);
        Figura f3 = new Rectangulo(10, 100);


        List <Figura> lista = new ArrayList<Figura>();

        lista.add (f3);
        lista.add (f1);

        Dibujo d1 = new Dibujo (lista);

        List <Figura> lista2 = new ArrayList<Figura>();
        lista2.add (d1);
        lista2.add (d1);
        lista2.add (f2);

        Dibujo d2 = new Dibujo (lista2);

        Assert.assertEquals(d2.area(),2150,   0);
    }

}
