public class Empresa {

    private String cif;
    private String nombre;
    private String sectorEmpresarial;

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSectorEmpresarial() {
        return sectorEmpresarial;
    }

    public void setSectorEmpresarial(String sectorEmpresarial) {
        this.sectorEmpresarial = sectorEmpresarial;
    }

    public Empresa (String cif, String nombre, String sectorEmpresarial){
        this.cif = cif;
        this.nombre = nombre;
        this.sectorEmpresarial = sectorEmpresarial;
    }

    @Override
    public String toString() {
        return "Empresa [" +
                "Cif = " + cif +
                ", Nombre ='" + nombre +
                ", Sector Empresarial = " + sectorEmpresarial + "]";
    }
}
