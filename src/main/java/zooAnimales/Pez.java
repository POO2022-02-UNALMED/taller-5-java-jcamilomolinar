package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal{
    private static List<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        Animal.sumarAnimal();
        super.mov = "nadar";
        listado.add(this);
    }

    public Pez(){
        Animal.sumarAnimal();
        super.mov = "nadar";
        listado.add(this);
    }

    public static List<Pez> getListado() {
        return listado;
    }

    public static void setListado(List<Pez> listado) {
        Pez.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public static int cantidadPeces(){
        return listado.size();
    }

    public static Pez crearSalmon(String nombre, int edad, String genero){
        Pez nuevoani = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        listado.add(nuevoani);
        salmones++;
        return nuevoani;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero){
        Pez nuevoani = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        listado.add(nuevoani);
        bacalaos++;
        return nuevoani;
    }
}
