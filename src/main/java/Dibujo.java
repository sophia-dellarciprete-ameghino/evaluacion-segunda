import java.util.List;

/**
 * Created by alumno on 15/09/16.
 */
public class Dibujo implements Figura  {

    List<Figura> imagen;

    public Dibujo(List<Figura> figuras) {
        this.imagen = figuras;
    }

    public double area() {
        double sum = 0;
        for (Figura d : imagen){
            sum = sum + d.area();
        }
        return sum;
    }

    @Override
    public double perimetro() {
        return 0;
    }

    public double sumarAreasDeFiguras(List<Figura> figuras) {
        return 0;
    }
    @Override
    public boolean compararPerimetros(Figura f2) {
        return false;
    }


}
