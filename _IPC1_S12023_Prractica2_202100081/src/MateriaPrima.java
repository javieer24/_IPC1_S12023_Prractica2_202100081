import java.awt.geom.Ellipse2D;

public class MateriaPrima {
    private int id;
    private int sector;
    private boolean procesoTerminado;
    private Ellipse2D circulo;
    public MateriaPrima (int id,int sector, boolean procesoTerminado, Ellipse2D circulo){
        this.id=id;
        this.sector=sector;
        this.procesoTerminado=procesoTerminado;
        this.circulo=circulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSector() {
        return sector;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    public boolean isProcesoTerminado() {
        return procesoTerminado;
    }

    public void setProcesoTerminado(boolean procesoTerminado) {
        this.procesoTerminado = procesoTerminado;
    }

    public Ellipse2D getCirculo() {
        return circulo;
    }

    public void setCirculo(Ellipse2D circulo) {
        this.circulo = circulo;
    }
}
