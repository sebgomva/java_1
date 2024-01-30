package b6;

public class circulo implements  Forma {


    private double radio;
    circulo(double radio){
        this.radio=radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*radio*radio;
    }

    @Override
    public void mostrar() {
        System.out.println("El radio es: "+radio);
    }
}
