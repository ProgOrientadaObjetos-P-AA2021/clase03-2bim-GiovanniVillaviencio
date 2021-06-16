
package herencias2;

public class Docente extends Persona{
    private double sueldo;
    public Docente(String n, String a, int e){
        super(n, a, e);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double s) {
        sueldo = s;
        if(sueldo <= 1000){
            sueldo = 1000;
        } else {
            sueldo = s;
        }
    }
    @Override
    public String toString(){
        return String.format("%s - %.2f", super.toString(), getSueldo());
    }
}
