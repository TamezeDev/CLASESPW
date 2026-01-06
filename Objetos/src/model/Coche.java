package model;

import lombok.*;

@Getter // proporciona los getters
@Setter // proporciona lo setters
@Data //  proporciona getters y setters y el método toString
@NoArgsConstructor // proporciona el constructor vacío
@AllArgsConstructor // proporciona el constructor completo
public class Coche {
    private String matricula;
    private String bastidor;
    private String marca;
    private String modelo;
    private String color;
    private int cv;
    private double precio;
    private double velocidad;

    private boolean usado;

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    //Constructor
    public Coche() {
    }

    public Coche(String marca, String modelo,double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Coche(String matricula, String bastidor, String marca, String modelo, String color, int cv) {
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cv = cv;
    }

    @Override
    public String toString(){
        return String.format("Matricula: %s, Bastidor: %s, Marca: %s, Modelo: %s, Color: %s, Caballos: %d",matricula,bastidor,marca,modelo,color,cv);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}
