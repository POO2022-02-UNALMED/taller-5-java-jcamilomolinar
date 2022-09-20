package zooAnimales;

import gestion.Zona;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;
    public String mov = "desplazarse";

    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }

    public Animal(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public static void sumarAnimal(){
        totalAnimales++;
    }

    public static String totalPorTipo(){
        String  muestra = "Mamiferos: %d\n" + "Aves: %d\n" + "Reptiles: %d\n" + "Peces: %d\n" + "Anfibios: %d";
        return String.format(muestra, Mamifero.getListado().size(), Ave.getListado().size(),
                Reptil.getListado().size(), Pez.getListado().size(), Anfibio.getListado().size());
    }

    @Override
    public String toString(){
        if (this.zona == null){
            String  muestra = "Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s";
            return String.format(muestra, this.nombre, this.edad, this.habitat, this.genero);
        }
        else{
            String  muestra = "Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s" +
                    ", la zona en la que me ubico es %s, en el %s";
            return String.format(muestra, this.nombre, this.edad, this.habitat, this.genero, this.zona, this.zona.getZoo().getNombre());
        }
    }

    public String movimiento(){
        return mov;
    }

}
