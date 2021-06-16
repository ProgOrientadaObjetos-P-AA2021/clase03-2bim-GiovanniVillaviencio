
package herencias3;

public class Reporte {
    protected String codigoReporte;
    public Reporte(String cr){
        codigoReporte = cr;
    }

    public String getCodigoReporte() {
        return codigoReporte;
    }

    public void setCodigoReporte(String cr) {
        this.codigoReporte = cr;
    }
    @Override
    public String toString(){
        return String.format("Codigo: %s", getCodigoReporte());
    }
}
