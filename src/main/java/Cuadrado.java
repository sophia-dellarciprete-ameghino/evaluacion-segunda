import java.util.List;

/**
 * Created by damian on 26/08/16.
 */
public class Cuadrado implements Figura {
    public int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public double area() {
        double areaT = 0;
        areaT=areaT + this.lado * this.lado;
        return areaT;
    }

    public double perimetro() {
        double perimetroT = 0;
        perimetroT=perimetroT + lado *4;
        return perimetroT;
    }


    public double sumarAreasDeCuadrados(List<Cuadrado> cuadrados) {
        double sum = 0;
        for (Cuadrado c : cuadrados){
            sum = sum + c.area();
        }
        return sum;
    }

    public double sumarAreasDeFiguras(List<Figura> figuras) {
        double sum = 0;
        for (Figura c : figuras){
            sum = sum + c.area();
        }
        return sum;
    }
}
