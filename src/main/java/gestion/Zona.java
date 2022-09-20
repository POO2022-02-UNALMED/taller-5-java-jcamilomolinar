package gestion;

import zooAnimales.*;
import java.util.ArrayList;
import java.util.List;

public class Zona {
    private String nombre;
    private Zoologico zoo = new Zoologico();
    private List<Animal> animales = new ArrayList<>();

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zona(){}

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAnimales(Animal animal){
        animales.add(animal);
    }

    public int cantidadAnimales(){
        return animales.size();
    }
}
