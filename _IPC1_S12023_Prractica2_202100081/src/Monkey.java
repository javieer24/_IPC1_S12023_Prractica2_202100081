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

public class Monkey   {
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

    static int conteo =-1;
    static int cronometro=0;
    static int cantidadTerminadas=0;
    static boolean terminoProceso=false;
    public static void main(String[] args) {
        llenarMatrizCoordenadas();
        marcoProceso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoProceso.setResizable(false);
        //marcoProceso.setVisible(true);
        marcoConfig.setResizable(false);
        marcoConfig.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoConfig.setVisible(true);

    }


    public static void llenarMatrizCoordenadas(){
        matrizCoordenadas[0][0]=380;
        matrizCoordenadas[0][1]=405;
        matrizCoordenadas[0][2]=380;
        matrizCoordenadas[0][3]=40;
        matrizCoordenadas[0][4]=60;
        matrizCoordenadas[0][5]=40;
        matrizCoordenadas[0][6]=60;
        matrizCoordenadas[0][7]=405;

        matrizCoordenadas[1][0]=400;
        matrizCoordenadas[1][1]=405;
        matrizCoordenadas[1][2]=400;
        matrizCoordenadas[1][3]=40;
        matrizCoordenadas[1][4]=80;
        matrizCoordenadas[1][5]=40;
        matrizCoordenadas[1][6]=80;
        matrizCoordenadas[1][7]=405;

        matrizCoordenadas[2][0]=420;
        matrizCoordenadas[2][1]=405;
        matrizCoordenadas[2][2]=420;
        matrizCoordenadas[2][3]=40;
        matrizCoordenadas[2][4]=100;
        matrizCoordenadas[2][5]=40;
        matrizCoordenadas[2][6]=100;
        matrizCoordenadas[2][7]=405;

        matrizCoordenadas[3][0]=440;
        matrizCoordenadas[3][1]=405;
        matrizCoordenadas[3][2]=440;
        matrizCoordenadas[3][3]=40;
        matrizCoordenadas[3][4]=120;
        matrizCoordenadas[3][5]=40;
        matrizCoordenadas[3][6]=120;
        matrizCoordenadas[3][7]=405;

        matrizCoordenadas[4][0]=440;
        matrizCoordenadas[4][1]=405;
        matrizCoordenadas[4][2]=440;
        matrizCoordenadas[4][3]=40;
        matrizCoordenadas[4][4]=120;
        matrizCoordenadas[4][5]=40;
        matrizCoordenadas[4][6]=120;
        matrizCoordenadas[4][7]=405;

        matrizCoordenadas[5][0]=460;
        matrizCoordenadas[5][1]=405;
        matrizCoordenadas[5][2]=460;
        matrizCoordenadas[5][3]=40;
        matrizCoordenadas[5][4]=140;
        matrizCoordenadas[5][5]=40;
        matrizCoordenadas[5][6]=140;
        matrizCoordenadas[5][7]=405;

        matrizCoordenadas[6][0]=480;
        matrizCoordenadas[6][1]=405;
        matrizCoordenadas[6][2]=480;
        matrizCoordenadas[6][3]=40;
        matrizCoordenadas[6][4]=160;
        matrizCoordenadas[6][5]=40;
        matrizCoordenadas[6][6]=160;
        matrizCoordenadas[6][7]=405;

        matrizCoordenadas[7][0]=500;
        matrizCoordenadas[7][1]=405;
        matrizCoordenadas[7][2]=500;
        matrizCoordenadas[7][3]=40;
        matrizCoordenadas[7][4]=180;
        matrizCoordenadas[7][5]=40;
        matrizCoordenadas[7][6]=180;
        matrizCoordenadas[7][7]=405;

        matrizCoordenadas[8][0]=520;
        matrizCoordenadas[8][1]=405;
        matrizCoordenadas[8][2]=520;
        matrizCoordenadas[8][3]=40;
        matrizCoordenadas[8][4]=200;
        matrizCoordenadas[8][5]=40;
        matrizCoordenadas[8][6]=200;
        matrizCoordenadas[8][7]=405;

        matrizCoordenadas[9][0]=540;
        matrizCoordenadas[9][1]=405;
        matrizCoordenadas[9][2]=540;
        matrizCoordenadas[9][3]=40;
        matrizCoordenadas[9][4]=220;
        matrizCoordenadas[9][5]=40;
        matrizCoordenadas[9][6]=220;
        matrizCoordenadas[9][7]=405;

        matrizCoordenadas[10][0]=380;
        matrizCoordenadas[10][1]=425;
        matrizCoordenadas[10][2]=380;
        matrizCoordenadas[10][3]=60;
        matrizCoordenadas[10][4]=60;
        matrizCoordenadas[10][5]=60;
        matrizCoordenadas[10][6]=60;
        matrizCoordenadas[10][7]=425;

        matrizCoordenadas[11][0]=400;
        matrizCoordenadas[11][1]=425;
        matrizCoordenadas[11][2]=400;
        matrizCoordenadas[11][3]=60;
        matrizCoordenadas[11][4]=80;
        matrizCoordenadas[11][5]=60;
        matrizCoordenadas[11][6]=80;
        matrizCoordenadas[11][7]=425;

        matrizCoordenadas[12][0]=420;
        matrizCoordenadas[12][1]=425;
        matrizCoordenadas[12][2]=420;
        matrizCoordenadas[12][3]=60;
        matrizCoordenadas[12][4]=100;
        matrizCoordenadas[12][5]=60;
        matrizCoordenadas[12][6]=100;
        matrizCoordenadas[12][7]=425;

        matrizCoordenadas[13][0]=440;
        matrizCoordenadas[13][1]=425;
        matrizCoordenadas[13][2]=440;
        matrizCoordenadas[13][3]=60;
        matrizCoordenadas[13][4]=120;
        matrizCoordenadas[13][5]=60;
        matrizCoordenadas[13][6]=120;
        matrizCoordenadas[13][7]=425;

        matrizCoordenadas[14][0]=440;
        matrizCoordenadas[14][1]=425;
        matrizCoordenadas[14][2]=440;
        matrizCoordenadas[14][3]=60;
        matrizCoordenadas[14][4]=120;
        matrizCoordenadas[14][5]=60;
        matrizCoordenadas[14][6]=120;
        matrizCoordenadas[14][7]=425;

        matrizCoordenadas[15][0]=460;
        matrizCoordenadas[15][1]=425;
        matrizCoordenadas[15][2]=460;
        matrizCoordenadas[15][3]=60;
        matrizCoordenadas[15][4]=140;
        matrizCoordenadas[15][5]=60;
        matrizCoordenadas[15][6]=140;
        matrizCoordenadas[15][7]=425;

        matrizCoordenadas[16][0]=480;
        matrizCoordenadas[16][1]=425;
        matrizCoordenadas[16][2]=480;
        matrizCoordenadas[16][3]=60;
        matrizCoordenadas[16][4]=160;
        matrizCoordenadas[16][5]=60;
        matrizCoordenadas[16][6]=160;
        matrizCoordenadas[16][7]=425;

        matrizCoordenadas[17][0]=500;
        matrizCoordenadas[17][1]=425;
        matrizCoordenadas[17][2]=500;
        matrizCoordenadas[17][3]=60;
        matrizCoordenadas[17][4]=180;
        matrizCoordenadas[17][5]=60;
        matrizCoordenadas[17][6]=180;
        matrizCoordenadas[17][7]=425;

        matrizCoordenadas[18][0]=520;
        matrizCoordenadas[18][1]=425;
        matrizCoordenadas[18][2]=520;
        matrizCoordenadas[18][3]=60;
        matrizCoordenadas[18][4]=200;
        matrizCoordenadas[18][5]=60;
        matrizCoordenadas[18][6]=200;
        matrizCoordenadas[18][7]=425;

        matrizCoordenadas[19][0]=540;
        matrizCoordenadas[19][1]=425;
        matrizCoordenadas[19][2]=540;
        matrizCoordenadas[19][3]=60;
        matrizCoordenadas[19][4]=220;
        matrizCoordenadas[19][5]=60;
        matrizCoordenadas[19][6]=220;
        matrizCoordenadas[19][7]=425;

        matrizCoordenadas[20][0]=380;
        matrizCoordenadas[20][1]=445;
        matrizCoordenadas[20][2]=380;
        matrizCoordenadas[20][3]=80;
        matrizCoordenadas[20][4]=60;
        matrizCoordenadas[20][5]=80;
        matrizCoordenadas[20][6]=60;
        matrizCoordenadas[20][7]=445;

        matrizCoordenadas[21][0]=400;
        matrizCoordenadas[21][1]=445;
        matrizCoordenadas[21][2]=400;
        matrizCoordenadas[21][3]=80;
        matrizCoordenadas[21][4]=80;
        matrizCoordenadas[21][5]=80;
        matrizCoordenadas[21][6]=80;
        matrizCoordenadas[21][7]=445;

        matrizCoordenadas[22][0]=420;
        matrizCoordenadas[22][1]=445;
        matrizCoordenadas[22][2]=420;
        matrizCoordenadas[22][3]=80;
        matrizCoordenadas[22][4]=100;
        matrizCoordenadas[22][5]=80;
        matrizCoordenadas[22][6]=100;
        matrizCoordenadas[22][7]=445;

        matrizCoordenadas[23][0]=440;
        matrizCoordenadas[23][1]=445;
        matrizCoordenadas[23][2]=440;
        matrizCoordenadas[23][3]=80;
        matrizCoordenadas[23][4]=120;
        matrizCoordenadas[23][5]=80;
        matrizCoordenadas[23][6]=120;
        matrizCoordenadas[23][7]=445;

        matrizCoordenadas[24][0]=440;
        matrizCoordenadas[24][1]=445;
        matrizCoordenadas[24][2]=440;
        matrizCoordenadas[24][3]=80;
        matrizCoordenadas[24][4]=120;
        matrizCoordenadas[24][5]=80;
        matrizCoordenadas[24][6]=120;
        matrizCoordenadas[24][7]=445;

        matrizCoordenadas[25][0]=460;
        matrizCoordenadas[25][1]=445;
        matrizCoordenadas[25][2]=460;
        matrizCoordenadas[25][3]=80;
        matrizCoordenadas[25][4]=140;
        matrizCoordenadas[25][5]=80;
        matrizCoordenadas[25][6]=140;
        matrizCoordenadas[25][7]=445;

        matrizCoordenadas[26][0]=480;
        matrizCoordenadas[26][1]=445;
        matrizCoordenadas[26][2]=480;
        matrizCoordenadas[26][3]=80;
        matrizCoordenadas[26][4]=160;
        matrizCoordenadas[26][5]=80;
        matrizCoordenadas[26][6]=160;
        matrizCoordenadas[26][7]=445;

        matrizCoordenadas[27][0]=500;
        matrizCoordenadas[27][1]=445;
        matrizCoordenadas[27][2]=500;
        matrizCoordenadas[27][3]=80;
        matrizCoordenadas[27][4]=180;
        matrizCoordenadas[27][5]=80;
        matrizCoordenadas[27][6]=180;
        matrizCoordenadas[27][7]=445;

        matrizCoordenadas[28][0]=520;
        matrizCoordenadas[28][1]=445;
        matrizCoordenadas[28][2]=520;
        matrizCoordenadas[28][3]=80;
        matrizCoordenadas[28][4]=200;
        matrizCoordenadas[28][5]=80;
        matrizCoordenadas[28][6]=200;
        matrizCoordenadas[28][7]=445;

        matrizCoordenadas[29][0]=540;
        matrizCoordenadas[29][1]=445;
        matrizCoordenadas[29][2]=540;
        matrizCoordenadas[29][3]=80;
        matrizCoordenadas[29][4]=220;
        matrizCoordenadas[29][5]=80;
        matrizCoordenadas[29][6]=220;
        matrizCoordenadas[29][7]=445;
    }

    public static void generarReporteHtml(){
        java.io.FileWriter htmlArchivo = null;
        java.io.PrintWriter escritor = null;


        try {
            htmlArchivo = new java.io.FileWriter("ReporteSimulacion.html");
            escritor = new java.io.PrintWriter(htmlArchivo);
            escritor.println("<!DOCTYPE html>\n"
                    + "<html>\n"
                    + "\n"
                    + "<head>\n"
                    + "<meta charset=\"UTF-8\">\n"
                    + "\n"
                    + "\n"
                    + "<title>Simulacion</title>\n"
                    + "</head>\n"
                    + "\n"
                    + "<body bgcolor=”#6CFC07”>\n"
                    + "\n"
                    + "<center>");
            escritor.println("<h1>" + "Datos De La Simulación</h1></center>\n");
            escritor.println("<h2>Curso:  IPC1 Sección E, Práctica 2</h2>\n");
            escritor.println("<h2>Nombre Del Estudiante: Javier Andrés Monjes Solórzano</h2>\n");
            escritor.println("<h2>Carnet: 202100081</h2>\n");

            escritor.println("<center> <table> <tr> <th>Sector</th> <th>Tiempo (s)</th> <th> Costo (Q/s)</th><th> Total Sector</th></tr>");
            escritor.println("<tr> <td>"+inventario.getNombre()+"</td> <td>"+inventario.getTiempo()+"</td> <td>"+ inventario.getCosto() +"</td><td>"+ (inventario.getTiempo()* inventario.getCosto()*30) +"</tr> ");
            escritor.println("<tr> <td>"+produccion.getNombre()+"</td> <td>"+produccion.getTiempo()+"</td> <td>"+ produccion.getCosto() +"</td><td>"+ (produccion.getTiempo()* produccion.getCosto()*30) +"</tr> ");
            escritor.println("<tr> <td>"+empaquetado.getNombre()+"</td> <td>"+empaquetado.getTiempo()+"</td> <td>"+ empaquetado.getCosto() +"</td><td>"+ (empaquetado.getTiempo()* empaquetado.getCosto()*30) +"</tr> ");
            escritor.println("<tr> <td>"+salida.getNombre()+"</td> <td>"+salida.getTiempo()+"</td> <td>"+ salida.getCosto() +"</td><td>"+ (salida.getTiempo()* salida.getCosto()*30) +"</tr> ");
            escritor.println("</table>  </center> ");
            escritor.println("\n"
                    + "\n"
                    +"<h3>Costo total Simulación: Q. "+((inventario.getTiempo()* inventario.getCosto()*30)+(produccion.getTiempo()* produccion.getCosto()*30)+(empaquetado.getTiempo()* empaquetado.getCosto()*30)+(salida.getTiempo()* salida.getCosto()*30))+"</h3>"
                    + "</body>\n"
                    + "</html>");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != htmlArchivo) {
                    htmlArchivo.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}

class Hilos implements  Runnable{
    private Component elComponente;
    private MateriaPrima materia;
    public Hilos(Component elComponente,MateriaPrima materia){
        this.elComponente=elComponente;
        this.materia=materia;
    }
    public void run(){
        if(Monkey.conteo<30){
            if(Monkey.conteo>=0){
                System.out.println(Monkey.conteo);
                // Restamos 1 al contador de materias en espera:
                Monkey.enEspera.setCantidadMateria(Monkey.enEspera.getCantidadMateria()-1);
                //elComponente.paint(elComponente.getGraphics());
                elComponente.repaint();
                // ==============================================Zona Invetario==============================================
                // Agregamos 1 al contador del sector inventario
                Monkey.inventario.setCantidadMateria(Monkey.inventario.getCantidadMateria()+1);
                // Cambiamos las coordenadas de la materia para que entre a inventario
                materia.setCirculo(new Ellipse2D.Double(Monkey.matrizCoordenadas[materia.getId()-1][0],Monkey.matrizCoordenadas[Monkey.conteo][1],15,15));
                // Repintamos
                //elComponente.paint(elComponente.getGraphics());
                elComponente.repaint();
                // Espera la materia al tiempo indicado
                try {
                    Thread.sleep(Monkey.inventario.getTiempo()* 1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                // Repintamos
                //elComponente.paint(elComponente.getGraphics());
                elComponente.repaint();
                // restamos 1 al contador del sector inventario
                Monkey.inventario.setCantidadMateria(Monkey.inventario.getCantidadMateria()-1);
                // ==============================================Zona Producción==============================================
                // Agregamos 1 al contador del sector producción
                Monkey.produccion.setCantidadMateria(Monkey.produccion.getCantidadMateria()+1);
                // Cambiamos las coordenadas de la materia para que entre a producción
                materia.setCirculo(new Ellipse2D.Double(Monkey.matrizCoordenadas[materia.getId()-1][2],Monkey.matrizCoordenadas[Monkey.conteo][3],15,15));
                // Repintamos
                //elComponente.paint(elComponente.getGraphics());
                elComponente.repaint();
                // Espera la materia al tiempo indicado
                try {
                    Thread.sleep(Monkey.produccion.getTiempo()* 1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                // Repintamos
                //elComponente.paint(elComponente.getGraphics());
                elComponente.repaint();
                // restamos 1 al contador del sector produccion
                Monkey.produccion.setCantidadMateria(Monkey.produccion.getCantidadMateria()-1);

                // ==============================================Zona Empaquetado==============================================
                // Agregamos 1 al contador del sector empaquetado
                Monkey.empaquetado.setCantidadMateria(Monkey.empaquetado.getCantidadMateria()+1);
                // Cambiamos las coordenadas de la materia para que entre a empaquetado
                materia.setCirculo(new Ellipse2D.Double(Monkey.matrizCoordenadas[materia.getId()-1][4],Monkey.matrizCoordenadas[Monkey.conteo][5],15,15));
                // Repintamos
                //elComponente.paint(elComponente.getGraphics());
                elComponente.repaint();
                // Espera la materia al tiempo indicado
                try {
                    Thread.sleep(Monkey.empaquetado.getTiempo()* 1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                // Repintamos
                //elComponente.paint(elComponente.getGraphics());
                elComponente.repaint();
                // restamos 1 al contador del sector empaquetado
                Monkey.empaquetado.setCantidadMateria(Monkey.empaquetado.getCantidadMateria()-1);

                // ==============================================Zona Salida==============================================
                // Agregamos 1 al contador del sector salida
                Monkey.salida.setCantidadMateria(Monkey.salida.getCantidadMateria()+1);
                // Cambiamos las coordenadas de la materia para que entre a salida
                materia.setCirculo(new Ellipse2D.Double(Monkey.matrizCoordenadas[materia.getId()-1][6],Monkey.matrizCoordenadas[Monkey.conteo][7],15,15));
                // Repintamos
                //elComponente.paint(elComponente.getGraphics());
                elComponente.repaint();
                // Espera la materia al tiempo indicado
                try {
                    Thread.sleep(Monkey.salida.getTiempo()* 1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                // Repintamos
                //elComponente.paint(elComponente.getGraphics());
                elComponente.repaint();

                // restamos 1 al contador del sector salida
                Monkey.salida.setCantidadMateria(Monkey.salida.getCantidadMateria()-1);

                // Repintamos
                //elComponente.paint(elComponente.getGraphics());
                elComponente.repaint();
                // Se elimina la materia que terminó el proceso
                materia.setSector(-1);
                // Repintamos
                //elComponente.paint(elComponente.getGraphics());
                elComponente.repaint();
                Monkey.cantidadTerminadas++;


            }


        }
    }

}

class Hilos2 implements  Runnable{
    private Component elComponente;
    public Hilos2(Component elComponente){
        this.elComponente=elComponente;

    }

    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Runnable runCronometro=new Hilos3(elComponente);
        Thread hiloCronometro=new Thread(runCronometro);
        hiloCronometro.start();
        for (int i=0;i<30;i++){
            if(Monkey.conteo<30){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Monkey.conteo++;
                Runnable r=new Hilos(elComponente,Monkey.materias.get(Monkey.conteo));
                Thread t=new Thread(r);
                t.start();
            }

        }
        boolean yaTermino=false;
        while(!yaTermino){
            System.out.println(Monkey.cantidadTerminadas);
            if (Monkey.cantidadTerminadas==30) {
                yaTermino=true;
            }
        }
        Monkey.terminoProceso=true;
        JOptionPane.showMessageDialog(null,"<html><p style=\"color:blue; font:10px;\">Simulación Completada con éxito, puedes salir de la aplicación o generar el reporte Html!!</p></html>" );


    }

}

class Hilos3 implements  Runnable{
    private Component elComponente;
    public Hilos3(Component elComponente){
        this.elComponente=elComponente;

    }

    public void run(){
        while(!Monkey.terminoProceso){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Monkey.cronometro++;
            elComponente.repaint();
        }

    }

}

class marcoSimulacion extends JFrame{
    static Lamina laminaSectores=new Lamina();

    public marcoSimulacion(){
        setBounds(0,0,1000,600);
        setTitle ("Monkey");
        laminaSectores.crarLabels();
        laminaSectores.crearSectores();
        add(laminaSectores, BorderLayout.CENTER);

        JPanel laminaBotones=new JPanel();

        ponerBoton(laminaBotones, "Iniciar Simulación!", new ActionListener(){

            public void actionPerformed(ActionEvent evento){
                if(Monkey.conteo<30){
                    iniciarSimulacion();
                }

            }

        });
        ponerBoton(laminaBotones, "Reporte Html", new ActionListener(){

            public void actionPerformed(ActionEvent evento){
                Monkey.generarReporteHtml();
                JOptionPane.showMessageDialog(null,"<html><p style=\"color:blue; font:10px;\">Reporte Html generado con éxito, puedes encotrarlo en la carpeta del proyecto!!</p></html>" );
            }

        });
        ponerBoton(laminaBotones, "Salir", new ActionListener(){

            public void actionPerformed(ActionEvent evento){
                JOptionPane.showMessageDialog(null,"<html><p style=\"color:blue; font:10px;\">Saliendo de la app, vuelve pronto!!!</p></html>" );
                System.exit(0);

            }

        });
        add(laminaBotones, BorderLayout.SOUTH);

    }

    public void ponerBoton(Container c, String titulo, ActionListener oyente){

        JButton boton=new JButton(titulo);

        c.add(boton);

        boton.addActionListener(oyente);

    }

    public void iniciarSimulacion(){
        Runnable r=new Hilos2(laminaSectores);
        Thread t=new Thread(r);
        t.start();
    }
}


class marcoConfiguracion extends JFrame{

    public  marcoConfiguracion(){
        setBounds(0,0,600,600);
        setTitle ("Monkey");
        setLayout(null);


        JLabel tituloEmpresa = new JLabel("MONKEY");
        tituloEmpresa.setLayout(null);
        tituloEmpresa.setVisible(true);
        tituloEmpresa.setForeground(Color.BLACK);
        tituloEmpresa.setBounds(250,10,400,60);
        add(tituloEmpresa);

        JLabel labelTiempo = new JLabel("Tiempo (s): ");
        labelTiempo.setLayout(null);
        labelTiempo.setVisible(true);
        labelTiempo.setForeground(Color.BLACK);
        labelTiempo.setBounds(175,110,250,30);
        add(labelTiempo);

        JLabel labelCosto = new JLabel("Costo (Q/s): ");
        labelCosto.setLayout(null);
        labelCosto.setVisible(true);
        labelCosto.setForeground(Color.BLACK);
        labelCosto.setBounds(335,110,250,30);
        add(labelCosto);

        JLabel labelInventario = new JLabel("Inventario: ");
        labelInventario.setLayout(null);
        labelInventario.setVisible(true);
        labelInventario.setForeground(Color.BLACK);
        labelInventario.setBounds(10,150,250,30);
        add(labelInventario);


        JLabel labelProduccion = new JLabel("Producción: ");
        labelProduccion.setLayout(null);
        labelProduccion.setVisible(true);
        labelProduccion.setForeground(Color.BLACK);
        labelProduccion.setBounds(10,250,300,30);
        add(labelProduccion);

        JLabel labelEmpaquetado = new JLabel("Empaquetado: ");
        labelEmpaquetado.setLayout(null);
        labelEmpaquetado.setVisible(true);
        labelEmpaquetado.setForeground(Color.BLACK);
        labelEmpaquetado.setBounds(10,350,300,30);
        add(labelEmpaquetado);

        JLabel labelSalida = new JLabel("Salida: ");
        labelSalida.setLayout(null);
        labelSalida.setVisible(true);
        labelSalida.setForeground(Color.BLACK);
        labelSalida.setBounds(10,450,300,30);
        add(labelSalida);



        JTextField tiempoInventario = new JTextField();
        tiempoInventario.setLayout(null);
        tiempoInventario.setVisible(true);
        tiempoInventario.setBounds(140,145,150,40);
        add(tiempoInventario);

        JTextField costoInventario = new JTextField();
        costoInventario.setLayout(null);
        costoInventario.setVisible(true);
        costoInventario.setBounds(300,145,150,40);
        add(costoInventario);

        JTextField tiempoProduccion = new JTextField();
        tiempoProduccion.setBounds(140,245,150,40);
        tiempoProduccion.setVisible(true);
        tiempoProduccion.setLayout(null);
        add(tiempoProduccion);

        JTextField costoProduccion = new JTextField();
        costoProduccion.setLayout(null);
        costoProduccion.setVisible(true);
        costoProduccion.setBounds(300,245,150,40);
        add(costoProduccion);

        JTextField tiempoEmpaquetado = new JTextField();
        tiempoEmpaquetado.setBounds(140,345,150,40);
        tiempoEmpaquetado.setVisible(true);
        tiempoEmpaquetado.setLayout(null);
        add(tiempoEmpaquetado);

        JTextField costoEmpaquetado = new JTextField();
        costoEmpaquetado.setLayout(null);
        costoEmpaquetado.setVisible(true);
        costoEmpaquetado.setBounds(300,345,150,40);
        add(costoEmpaquetado);

        JTextField tiempoSalida = new JTextField();
        tiempoSalida.setBounds(140,445,150,40);
        tiempoSalida.setVisible(true);
        tiempoSalida.setLayout(null);
        add(tiempoSalida);

        JTextField costoSalida = new JTextField();
        costoSalida.setLayout(null);
        costoSalida.setVisible(true);
        costoSalida.setBounds(300,445,150,40);
        add(costoSalida);

        JButton botonIniciarSimulacion = new JButton("Iniciar Simulación");
        botonIniciarSimulacion.setLayout(null);
        botonIniciarSimulacion.setVisible(true);
        botonIniciarSimulacion.setBounds(150, 500, 300, 30);
        botonIniciarSimulacion.setBackground(Color.WHITE);
        botonIniciarSimulacion.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                // Se valida que todos los campos estén llenos
                if(!Objects.equals(tiempoInventario.getText(), "") && !Objects.equals(costoInventario.getText(), "")
                        && !Objects.equals(tiempoProduccion.getText(), "")&& !Objects.equals(costoProduccion.getText(), "")
                        && !Objects.equals(tiempoEmpaquetado.getText(), "")&& !Objects.equals(costoEmpaquetado.getText(), "")
                        && !Objects.equals(tiempoSalida.getText(), "")&& !Objects.equals(costoSalida.getText(), "")) {
                    // Se valida que todos los campos sean números enteros
                    if(esNumero(tiempoInventario.getText()) && esNumero(costoInventario.getText())
                            && esNumero(tiempoProduccion.getText())&& esNumero(costoProduccion.getText())
                            && esNumero(tiempoEmpaquetado.getText())&& esNumero(costoEmpaquetado.getText())
                            && esNumero(tiempoSalida.getText())&& esNumero(costoSalida.getText())){
                        // Asignar los valores de configuración
                        Monkey.inventario.setTiempo(Integer.parseInt(tiempoInventario.getText()));
                        Monkey.inventario.setCosto(Integer.parseInt(costoInventario.getText()));
                        Monkey.produccion.setTiempo(Integer.parseInt(tiempoProduccion.getText()));
                        Monkey.produccion.setCosto(Integer.parseInt(costoProduccion.getText()));
                        Monkey.empaquetado.setTiempo(Integer.parseInt(tiempoEmpaquetado.getText()));
                        Monkey.empaquetado.setCosto(Integer.parseInt(costoEmpaquetado.getText()));
                        Monkey.salida.setTiempo(Integer.parseInt(tiempoSalida.getText()));
                        Monkey.salida.setCosto(Integer.parseInt(costoSalida.getText()));
                        JOptionPane.showMessageDialog(null,"<html><p style=\"color:blue; font:10px;\">Configuración completada con éxito, dirigiendote a la simulación ....</p></html>" );
                        dispose();
                        Monkey.marcoProceso.setVisible(true);

                    }else{
                        JOptionPane.showMessageDialog(null,"<html><p style=\"color:red; font:10px;\">Todos los valores deben ser números enteros!!</p></html>" );
                    }

                }else{
                    JOptionPane.showMessageDialog(null,"<html><p style=\"color:red; font:10px;\">Debes llenar todos los campos para continuar!!</p></html>" );
                }

            }
        });
        add(botonIniciarSimulacion);

        repaint();





    }
    public  boolean esNumero(String str) {
        try (Scanner scanner = new Scanner(str)) {
            if (scanner.hasNextInt()) {
                return true;
            }
            return false;
        }
    }


}

class Lamina extends JPanel{
    ArrayList<Sector> sectores=new ArrayList<Sector>();

    JLabel tituloInventario = new JLabel("Inventario: " + Monkey.inventario.getCantidadMateria());
    JLabel tituloProduccion = new JLabel("Produccion: " + Monkey.produccion.getCantidadMateria());
    JLabel tituloEmpaquetado = new JLabel("Empaquetado: " + Monkey.empaquetado.getCantidadMateria());
    JLabel tituloSalida = new JLabel("Salida: " + Monkey.salida.getCantidadMateria());
    JLabel tituloEspera = new JLabel("En Espera: " + Monkey.enEspera.getCantidadMateria());
    JLabel labelTiempo = new JLabel("Segundos: " + Monkey.cronometro);
    Line2D baseLine = new Line2D.Double(50, 100, 250, 100);
    public void add(Sector sector){
        sectores.add(sector);
    }
    public void crarLabels(){
        tituloInventario.setForeground(Color.BLACK);
        tituloProduccion.setForeground(Color.BLACK);
        tituloEmpaquetado.setForeground(Color.BLACK);
        tituloSalida.setForeground(Color.BLACK);
        tituloEspera.setForeground(Color.BLACK);
        labelTiempo.setForeground(Color.BLACK);

    }

    public void crearSectores(){
        add(Monkey.inventario);
        add(Monkey.produccion);
        add(Monkey.empaquetado);
        add(Monkey.salida);
        add(Monkey.enEspera);
        Monkey.materias.add(Monkey.materia1);
        Monkey.materias.add(Monkey.materia2);
        Monkey.materias.add(Monkey.materia3);
        Monkey.materias.add(Monkey.materia4);
        Monkey.materias.add(Monkey.materia5);
        Monkey.materias.add(Monkey.materia6);
        Monkey.materias.add(Monkey.materia7);
        Monkey.materias.add(Monkey.materia8);
        Monkey.materias.add(Monkey.materia9);
        Monkey.materias.add(Monkey.materia10);
        Monkey.materias.add(Monkey.materia11);
        Monkey.materias.add(Monkey.materia12);
        Monkey.materias.add(Monkey.materia13);
        Monkey.materias.add(Monkey.materia14);
        Monkey.materias.add(Monkey.materia15);
        Monkey.materias.add(Monkey.materia16);
        Monkey.materias.add(Monkey.materia17);
        Monkey.materias.add(Monkey.materia18);
        Monkey.materias.add(Monkey.materia19);
        Monkey.materias.add(Monkey.materia20);
        Monkey.materias.add(Monkey.materia21);
        Monkey.materias.add(Monkey.materia22);
        Monkey.materias.add(Monkey.materia23);
        Monkey.materias.add(Monkey.materia24);
        Monkey.materias.add(Monkey.materia25);
        Monkey.materias.add(Monkey.materia26);
        Monkey.materias.add(Monkey.materia27);
        Monkey.materias.add(Monkey.materia28);
        Monkey.materias.add(Monkey.materia29);
        Monkey.materias.add(Monkey.materia30);
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2=(Graphics2D)g;

        for(Sector sector: sectores){
            if (Objects.equals(sector.getNombre(), "inventario")){
                g2.setColor(Color.CYAN);
                tituloInventario.setBounds(350, 375, 200, 30);
                tituloInventario.setText("Inventario: "+Monkey.inventario.getCantidadMateria());
                add(tituloInventario);
                g2.fill(sector.getRectangulo());

            }else if(Objects.equals(sector.getNombre(), "produccion")){
                g2.setColor(Color.GREEN);
                tituloProduccion.setBounds(350, 10, 200, 30);
                tituloProduccion.setText("Produccion: "+Monkey.produccion.getCantidadMateria());
                add(tituloProduccion);
                g2.fill(sector.getRectangulo());
            }else if(Objects.equals(sector.getNombre(), "empaquetado")){
                g2.setColor(Color.PINK);
                tituloEmpaquetado.setBounds(30, 10, 200, 30);
                tituloEmpaquetado.setText("Empaquetado: "+Monkey.empaquetado.getCantidadMateria());
                add(tituloEmpaquetado);
                g2.fill(sector.getRectangulo());
            }else if(Objects.equals(sector.getNombre(), "salida")){
                g2.setColor(Color.ORANGE);
                tituloSalida.setBounds(30, 375, 200, 30);
                tituloSalida.setText("Salida: "+Monkey.salida.getCantidadMateria());
                add(tituloSalida);
                g2.fill(sector.getRectangulo());
            }else if(Objects.equals(sector.getNombre(), "espera")){
                g2.setColor(Color.YELLOW);
                tituloEspera.setBounds(650, 200, 200, 30);
                tituloEspera.setText("En Espera: "+Monkey.enEspera.getCantidadMateria());
                add(tituloEspera);
                g2.fill(sector.getRectangulo());

            }

        }
        labelTiempo.setBounds(680, 10, 200, 30);
        labelTiempo.setText("Segundos: "+Monkey.cronometro);
        add(labelTiempo);

        for (MateriaPrima materia: Monkey.materias){
            if (materia.getSector()==1){
                if(materia.getId()==30){
                    g2.setColor(Color.WHITE);
                    g2.fill(materia.getCirculo());
                    break;
                }
                g2.setColor(Color.BLACK);
                g2.fill(materia.getCirculo());
            }
        }

        g2.setColor(Color.BLACK);
        // Flecha de inventario a producción
        g2.setStroke(new BasicStroke(8)); // Establecer el grosor de la línea de la flecha
        // Dibujar la flecha
        Path2D arrow = new Path2D.Double();
        arrow.moveTo(500, 370); // Punto inicial de la flecha
        arrow.lineTo(500, 170); // Punto final de la flecha
        arrow.lineTo(520, 190); // Punto de la cabeza de la flecha
        arrow.moveTo(500, 170); // Punto final de la flecha
        arrow.lineTo(480, 190); // Punto de la cabeza de la flecha
        g2.draw(arrow);

        // Flecha de empaquetado a salida
        Path2D arrow2 = new Path2D.Double();
        arrow2.moveTo(200, 170); // Punto inicial de la flecha
        arrow2.lineTo(200, 370); // Punto final de la flecha
        arrow2.lineTo(220, 350); // Punto de la cabeza de la flecha
        arrow2.moveTo(200, 370); // Punto final de la flecha
        arrow2.lineTo(180, 350); // Punto de la cabeza de la flecha
        g2.draw(arrow2);

        // Flecha de producción a empaquetado
        Path2D arrow3 = new Path2D.Double();
        arrow3.moveTo(460, 200); // Punto inicial de la flecha
        arrow3.lineTo(240, 200); // Punto final de la flecha
        arrow3.lineTo(270, 180); // Punto de la cabeza de la flecha
        arrow3.moveTo(240, 200); // Punto final de la flecha
        arrow3.lineTo(270, 220); // Punto de la cabeza de la flecha
        g2.draw(arrow3);


    }
}