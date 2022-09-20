package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal{
    private static List<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        Animal.sumarAnimal();
        super.mov = "volar";
        listado.add(this);
    }

    public Ave(){
        Animal.sumarAnimal();
        super.mov = "volar";
        listado.add(this);
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public static List<Ave> getListado() {
        return listado;
    }

    public static void setListado(List<Ave> listado) {
        Ave.listado = listado;
    }

    public static int cantidadAves(){
        return listado.size();
    }

    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave nuevoani = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        listado.add(nuevoani);
        halcones++;
        return nuevoani;
    }

    public static Ave crearAguila(String nombre, int edad, String genero){
        Ave nuevoani = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        listado.add(nuevoani);
        aguilas++;
        return nuevoani;
    }
}
