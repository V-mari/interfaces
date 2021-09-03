package Infordata;

import interfaces.IReseteable;

public class DiscoDuro extends  Alquiler implements IReseteable {
    private int capacidad;
    public DiscoDuro(String codigo, String modelo, double precioHora, int capacidad){
        super(codigo, modelo, precioHora);


    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    @Override
    public String toString() {
        return "DiscoDuro{" +
                "precioHora=" + precioHora +
                ", capacidad=" + capacidad +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void reset() {
        System.out.println("Formateando disco duro...");
    }
}
