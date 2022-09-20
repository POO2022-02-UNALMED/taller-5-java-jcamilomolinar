package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal{
    private static List<Reptil> listado = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        Animal.sumarAnimal();
        super.mov = "reptar";
        listado.add(this);
    }

    public Reptil(){
        Animal.sumarAnimal();
        super.mov = "reptar";
        listado.add(this);
    }

    public static List<Reptil> getListado() {
        return listado;
    }

    public static void setListado(List<Reptil> listado) {
        Reptil.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    public static int cantidadReptiles(){
        return listado.size();
    }

    public static Reptil crearIguana(String nombre, int edad, String genero){
        Reptil nuevoani = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        listado.add(nuevoani);
        iguanas++;
        return nuevoani;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil nuevoani = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        listado.add(nuevoani);
        serpientes++;
        return nuevoani;
    }

}
