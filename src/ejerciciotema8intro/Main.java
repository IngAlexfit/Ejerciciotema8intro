/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotema8intro;

/**
 *
 * @author Ing_Puello
 */
public class Main {

    /*
     Para practicar la encapsulación:

        Crear clase Persona.

        Crear variables las privadas edad, nombre y telefono de la clase Persona.

        Crear gets y sets de cada propiedad.

        Crear un objeto persona en el main.

        Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
    
     */
    public static void main(String[] args) {
        Persona objeto1=new Persona();
        objeto1.setEdad(19);
        objeto1.setNombre("Carlos");
        objeto1.setTelefono(3159684);
        System.out.println("\nNombre: "+objeto1.getNombre()+"\nEdad: "+objeto1.getEdad()+"\nTelefono: "+objeto1.getTelefono());
    }

}
