package ec.puce.interfaces;

public class Circulo implements FiguraGeometrica {
    private double radio;

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Getter y setter para el radio
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}