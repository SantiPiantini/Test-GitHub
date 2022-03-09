
package Entidades;


public class Cafetera {
    
    private double capMaxima;
    private double capActual;
    private double llenar;
    private double vaciar;
    private double servir;
    private double agregar;
    private String atributo1;
    private String atributo2;
    public Cafetera() {
    }

    
    public Cafetera(double capMaxima, double capActual, double llenar, double vaciar, double servir, double agregar) {
        this.capMaxima = capMaxima;
        this.capActual = capActual;
        this.llenar = llenar;
        this.vaciar = vaciar;
        this.servir = servir;
        this.agregar = agregar;
    }

    public double getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(double capMaxima) {
        this.capMaxima = capMaxima;
    }

    public double getCapActual() {
        return capActual;
    }

    public void setCapActual(double capActual) {
        this.capActual = capActual;
    }

    public double getLlenar() {
        return llenar;
    }

    public void setLlenar(double llenar) {
        this.llenar = llenar;
    }

    public double getVaciar() {
        return vaciar;
    }

    public void setVaciar(double vaciar) {
        this.vaciar = vaciar;
    }

    public double getServir() {
        return servir;
    }

    public void setServir(double servir) {
        this.servir = servir;
    }

    public double getAgregar() {
        return agregar;
    }

    public void setAgregar(double agregar) {
        this.agregar = agregar;
    }
    
    
}
