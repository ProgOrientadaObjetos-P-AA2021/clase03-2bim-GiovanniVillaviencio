
package herencias3;

import herencias2.Estudiante;
import java.util.ArrayList;

public class ReporteEstudiante extends Reporte{
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    
    public ReporteEstudiante(String r, ArrayList<Estudiante> l){
        super(r);
        lista = l;
    }

    public double getPromedioMatriculas() {
        return promedioMatriculas;
    }

    public void setPromedioMatriculas() {
        double suma = 0;
        for(int i =0; i < lista.size(); i++){
            suma = suma + getLista().get(i).getMatricula();
        }
        promedioMatriculas = suma/lista.size();
    }

    public ArrayList<Estudiante> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }
    @Override
    public String toString(){
        String cadena = "Estudiantes\n";
        cadena = String.format("%s%s",cadena,super.toString());
        for(int i = 0; i < getLista().size(); i++){
            Estudiante e = getLista().get(i);
            cadena = String.format("%s\nEstudiante(%d)\n"
                    + "Nombre: %s - Apellido: %s - Edad: %d - Matricula: %.2f",
                    cadena , i+1,
                    e.getNombre(),
                    e.getApellido(),
                    e.getEdad(),
                    e.getMatricula());
        }
        cadena = String.format("%s\nPromedio de matriculas: %.2f\n", cadena,
                getPromedioMatriculas());
        return cadena;
    }
    
}
