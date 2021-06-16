
package herencias3;
import herencias2.Policia;
import java.util.ArrayList;

public class ReportePolicia extends Reporte {
    double promedioEdades;
    ArrayList<Policia> lista;
    
    public ReportePolicia(String r, ArrayList<Policia> l){
        super(r);
        lista = l;
    }

    public double getPromedioEdades() {
        return promedioEdades;
    }

    public void setPromedioEdades() {
        double suma = 0;
        for(int i =0; i < lista.size(); i++){
            suma = suma + getLista().get(i).getEdad();
        }
        promedioEdades = suma/lista.size();
    }

    public ArrayList<Policia> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Policia> lista) {
        this.lista = lista;
    }
    @Override
    public String toString(){
        String cadena = "Policias\n";
        cadena = String.format("%s%s",cadena,super.toString());
        for(int i = 0; i < getLista().size(); i++){
            Policia p = getLista().get(i);
            cadena = String.format("%s\nPolicia(%d)\n"
                    + "Nombre: %s - Apellido: %s - Edad: %d - Rango: %s",
                    cadena , i+1,
                    p.getNombre(),
                    p.getApellido(),
                    p.getEdad(),
                    p.getRango());
        }
        cadena = String.format("%s\nPromedio de edades: %.2f\n", cadena,
                getPromedioEdades());
        return cadena;
    }
    
}
