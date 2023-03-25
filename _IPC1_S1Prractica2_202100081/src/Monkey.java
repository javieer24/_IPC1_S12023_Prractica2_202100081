import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Monkey {
    static Sector enEspera=new Sector(1,"espera",0,0,30,new Rectangle2D.Double(650,200,300,150));
    static Sector inventario=new Sector(1,"inventario",0,0,0,new Rectangle2D.Double(350,375,300,150));
    static Sector produccion=new Sector(2,"produccion",0,0,0,new Rectangle2D.Double(350,10,300,150));
    static Sector empaquetado=new Sector(3,"empaquetado",0,0,0,new Rectangle2D.Double(30,10,300,150));
    static Sector salida=new Sector(4,"salida",0,0,0,new Rectangle2D.Double(30,375,300,150));
    static MateriaPrima materia1=new MateriaPrima(1,1,false,new Ellipse2D.Double(680,230,15,15));
    static MateriaPrima materia2=new MateriaPrima(2,1,false,new Ellipse2D.Double(720,230,15,15));
    static MateriaPrima materia3=new MateriaPrima(3,1,false,new Ellipse2D.Double(740,230,15,15));
    static MateriaPrima materia4=new MateriaPrima(4,1,false,new Ellipse2D.Double(760,230,15,15));
    static MateriaPrima materia5=new MateriaPrima(5,1,false,new Ellipse2D.Double(780,230,15,15));
    static MateriaPrima materia6=new MateriaPrima(6,1,false,new Ellipse2D.Double(800,230,15,15));
    static MateriaPrima materia7=new MateriaPrima(7,1,false,new Ellipse2D.Double(820,230,15,15));
    static MateriaPrima materia8=new MateriaPrima(8,1,false,new Ellipse2D.Double(840,230,15,15));
    static MateriaPrima materia9=new MateriaPrima(9,1,false,new Ellipse2D.Double(860,230,15,15));
    static MateriaPrima materia10=new MateriaPrima(10,1,false,new Ellipse2D.Double(880,230,15,15));

    static MateriaPrima materia11=new MateriaPrima(11,1,false,new Ellipse2D.Double(680,260,15,15));
    static MateriaPrima materia12=new MateriaPrima(12,1,false,new Ellipse2D.Double(720,260,15,15));
    static MateriaPrima materia13=new MateriaPrima(13,1,false,new Ellipse2D.Double(740,260,15,15));
    static MateriaPrima materia14=new MateriaPrima(14,1,false,new Ellipse2D.Double(760,260,15,15));
    static MateriaPrima materia15=new MateriaPrima(15,1,false,new Ellipse2D.Double(780,260,15,15));
    static MateriaPrima materia16=new MateriaPrima(16,1,false,new Ellipse2D.Double(800,260,15,15));
    static MateriaPrima materia17=new MateriaPrima(17,1,false,new Ellipse2D.Double(820,260,15,15));
    static MateriaPrima materia18=new MateriaPrima(18,1,false,new Ellipse2D.Double(840,260,15,15));
    static MateriaPrima materia19=new MateriaPrima(19,1,false,new Ellipse2D.Double(860,260,15,15));
    static MateriaPrima materia20=new MateriaPrima(20,1,false,new Ellipse2D.Double(880,260,15,15));

    static MateriaPrima materia21=new MateriaPrima(21,1,false,new Ellipse2D.Double(680,290,15,15));
    static MateriaPrima materia22=new MateriaPrima(22,1,false,new Ellipse2D.Double(720,290,15,15));
    static MateriaPrima materia23=new MateriaPrima(23,1,false,new Ellipse2D.Double(740,290,15,15));
    static MateriaPrima materia24=new MateriaPrima(24,1,false,new Ellipse2D.Double(760,290,15,15));
    static MateriaPrima materia25=new MateriaPrima(25,1,false,new Ellipse2D.Double(780,290,15,15));
    static MateriaPrima materia26=new MateriaPrima(26,1,false,new Ellipse2D.Double(800,290,15,15));
    static MateriaPrima materia27=new MateriaPrima(27,1,false,new Ellipse2D.Double(820,290,15,15));
    static MateriaPrima materia28=new MateriaPrima(28,1,false,new Ellipse2D.Double(840,290,15,15));
    static MateriaPrima materia29=new MateriaPrima(29,1,false,new Ellipse2D.Double(860,290,15,15));
    static MateriaPrima materia30=new MateriaPrima(30,1,false,new Ellipse2D.Double(880,290,15,15));
    static int[][] matrizCoordenadas = new int[30][8];

    static ArrayList<MateriaPrima> materias=new ArrayList<MateriaPrima>();
    static JFrame marcoProceso=new marcoSimulacion();
    static JFrame marcoConfig=new marcoConfiguracion();


















}
