package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private List<Zona> zonas = new ArrayList<>();

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Zoologico(){}

    public List<Zona> getZona() {
        return zonas;
    }

    public void setZonas(List<Zona> zonas) {
        this.zonas = zonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int cantidadTotalAnimales(){
        int total = 0;
        for(Zona zona: zonas) total += zona.getAnimales().size();
        return total;
    }

    public void agregarZonas(Zona z){
        zonas.add(z);
    }
}
