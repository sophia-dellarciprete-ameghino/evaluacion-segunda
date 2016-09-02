import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class RectanguloTest {


    @Test
    public void crearRectangulo(){
        Rectangulo rectangulo = new Rectangulo(5,10);

        Assert.assertEquals(rectangulo.base, 5,0);
        Assert.assertEquals(rectangulo.altura, 10,0);
    }


    @Test
    public void area(){
        Rectangulo rectangulo = new Rectangulo(10,30);

        Assert.assertEquals(300, rectangulo.area(),0);
    }


    @Test
    public void calcularPerimetro(){
        Rectangulo rectangulo = new Rectangulo(5,12);

        Assert.assertEquals(34, rectangulo.perimetro(),0);
    }



    @Test
    public void sumarTodasLasAreas(){
        Cuadrado c = new Cuadrado(1);
        Rectangulo rectangulo1 = new Rectangulo(3,2);
        Rectangulo rectangulo2 = new Rectangulo(2,5);
        Rectangulo rectangulo3 = new Rectangulo(10,30);

        List<Figura> rectangulos = new ArrayList<Figura>();
        rectangulos.add(rectangulo1);
        rectangulos.add(rectangulo2);
        rectangulos.add(rectangulo3);

        Assert.assertEquals(316, c.sumarAreasDeFiguras(rectangulos),0);
    }


}
