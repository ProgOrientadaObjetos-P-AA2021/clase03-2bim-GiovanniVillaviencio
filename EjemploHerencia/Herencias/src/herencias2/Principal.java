/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;
import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("Menu\n"
                + "Que desea ingrear?\n"
                + "1. Un estudiante\n"
                + "2. Un docente\n"
                + "3. Un policia\n");
        option = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el nombre: ");
        String name = sc.nextLine();
        System.out.print("Ingrese el apellido: ");
        String ape = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        switch (option) {
            case 1:
                System.out.print("Ingrese el valor de la matricula: ");
                double matricula = sc.nextInt();
                Estudiante e = new Estudiante(name,ape,edad,matricula);
                System.out.println(e);
                break;
            case 2:
                System.out.print("Ingrese el sueldo: ");
                double suel = sc.nextDouble();
                Docente d = new Docente(name , ape, edad ,suel);
                System.out.println(d);
                break;
            default:
                System.out.print("Ingrese el rango: ");
                String rango = sc.nextLine();
                Policia p = new Policia(name, ape, edad, rango);
                System.out.println(p);
                break;
        }
        // TODO code application logic here
        /*Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);
        // Un docente hereda de una Persona y adicionalmente tiene 
        // la característia sueldo
        Docente d = new Docente("Luis", "Alvarez", 40, 950.00); // falta implementar
        System.out.println(d);
        // Un policia hereda de una Persona y adicionalmente tiene 
        // la característia rango
        Policia p = new Policia("ALEX", "MENDOZA", 35, "Cabo"); // falta implementar
        System.out.println(p);
         */
        
    }
    
}
