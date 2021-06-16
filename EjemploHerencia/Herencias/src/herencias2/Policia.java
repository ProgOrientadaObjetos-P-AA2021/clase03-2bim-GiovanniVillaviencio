
package herencias2;

public class Policia extends Persona{
    private String rango;
    public Policia(String n, String a, int e, String r){
        super(n, a, e);
        rango = r;
    }
    
    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    @Override
    public String toString(){
        return String.format("%s - %s", super.toString(), getRango());
    }
}
