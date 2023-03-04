package org.example.cajeroHilos;

public class Cliente {

    private String nombre;
    private int[] CarroCompra;

    public Cliente(String nombre, int[] carroCompra) {
        this.nombre = nombre;
        CarroCompra = carroCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCarroCompra() {
        return CarroCompra;
    }

    public void setCarroCompra(int[] carroCompra) {
        CarroCompra = carroCompra;
    }
}
