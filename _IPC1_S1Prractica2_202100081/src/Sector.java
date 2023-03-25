import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Sector {
    private int id;
    private String nombre;
    private int tiempo;
    private int costo;
    private int cantidadMateria;
    private Rectangle2D rectangulo;
    public Sector(int id, String nombre, int tiempo, int costo, int cantidadMateria,Rectangle2D rectangulo){
        this.id=id;
        this.nombre=nombre;
        this.tiempo=tiempo;
        this.costo=costo;
        this.cantidadMateria=cantidadMateria;
        this.rectangulo=rectangulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCantidadMateria() {
        return cantidadMateria;
    }

    public void setCantidadMateria(int cantidadMateria) {
        this.cantidadMateria = cantidadMateria;
    }

    public Rectangle2D getRectangulo() {
        return rectangulo;
    }

    public void setRectangulo(Rectangle2D rectangulo) {
        this.rectangulo = rectangulo;
    }
}