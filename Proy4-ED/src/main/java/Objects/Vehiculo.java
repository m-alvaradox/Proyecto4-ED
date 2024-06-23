package Objects;

import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double precio;
    private int kilometraje;
    private String motor;
    private String transmision;
    private double peso;
    private String ubicacion;
    private List<String> fotos;
    private List<String> historialAccidentes;
    private List<String> historialMantenimiento;

    public Vehiculo(String marca, String modelo, int anio, double precio, int kilometraje, String motor,
                    String transmision, double peso, String ubicacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.kilometraje = kilometraje;
        this.motor = motor;
        this.transmision = transmision;
        this.peso = peso;
        this.ubicacion = ubicacion;
        this.fotos = new ArrayList<>();
        this.historialAccidentes = new ArrayList<>();
        this.historialMantenimiento = new ArrayList<>();
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<String> getFotos() {
        return fotos;
    }

    public void setFotos(List<String> fotos) {
        this.fotos = fotos;
    }

    public List<String> getHistorialAccidentes() {
        return historialAccidentes;
    }

    public void setHistorialAccidentes(List<String> historialAccidentes) {
        this.historialAccidentes = historialAccidentes;
    }

    public List<String> getHistorialMantenimiento() {
        return historialMantenimiento;
    }

    public void setHistorialMantenimiento(List<String> historialMantenimiento) {
        this.historialMantenimiento = historialMantenimiento;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio
                + ", kilometraje=" + kilometraje + ", motor=" + motor + ", transmision=" + transmision + ", peso="
                + peso + ", ubicacion=" + ubicacion + ", fotos=" + fotos + ", historialAccidentes="
                + historialAccidentes + ", historialMantenimiento=" + historialMantenimiento + "]";
    }

    // Getters y Setters

    public boolean AgegrarFoto(){


        return true;
    }

    public boolean AgregarAccidente(){
    
        return true;
    }

    public boolean agregarMantenimiento(){

        return true;
    }
    

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }


}

