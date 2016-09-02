/**
 * Created by Sophi on 2/9/2016.
 */
public class Rectangulo implements Figura {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public double area() {
        double areaT = 0;
        areaT = areaT + base * altura;
        return areaT;
    }

    public double perimetro() {
        double perimetroT = 0;
        perimetroT = perimetroT + base*2 + altura*2;
        return perimetroT;
    }
}
