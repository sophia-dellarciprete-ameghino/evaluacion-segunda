import java.util.List;

/**
 * Created by Sophi on 2/9/2016.
 */
public class Circulo implements Figura {

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        double areaT = 0;
        areaT = areaT + Math.PI * this.radio * this.radio;
        return areaT;
    }

    public double perimetro() {
        double perimetroT = 0;
        perimetroT = perimetroT + Math.PI*this.radio;
        return perimetroT;
    }

    public double sumarAreasDeFiguras(List<Figura> figuras) {
        double sum = 0;
        for (Figura c : figuras){
            sum = sum + c.area();
        }
        return sum;
    }
}
