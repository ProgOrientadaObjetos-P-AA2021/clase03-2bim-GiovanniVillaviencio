
package herencias3;
import herencias2.Docente;
import java.util.ArrayList;

public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;
    public ReporteDocente(String c, ArrayList<Docente> l){
        super(c);
        lista = l;
    }

    public double getPromedioSueldos() {
        return promedioSueldos;
    }

    public void setPromedioSueldos() {
        double suma =0;
        for(int i =0; i < lista.size();i++){
            suma = suma + lista.get(i).getSueldo();
        }
        promedioSueldos = suma/lista.size();
    }

    public ArrayList<Docente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Docente> lista) {
        this.lista = lista;
    }
    @Override
    public String toString(){
        String cadena = "Docentes\n";
        cadena = String.format("%s%s",cadena,super.toString());
        for(int i = 0; i < getLista().size(); i++){
            Docente d = getLista().get(i);
            cadena = String.format("%s\nDocente(%d)\n"
                    + "Nombre: %s - Apellido: %s - Edad: %d - Sueldo: %.2f",
                    cadena , i+1,
                    d.getNombre(),
                    d.getApellido(),
                    d.getEdad(),
                    d.getSueldo());
        }
        cadena = String.format("%s\nPromedio de sueldos: %.2f\n", cadena,
                getPromedioSueldos());
        return cadena;
    }
}
