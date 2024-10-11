import estadistica.Estadistica;

import java.util.Random;

public class EjemploUso {
    public static void main(String[] argrs){
        Estadistica e=new Estadistica();
        Random ran=new Random();
        for (int i=0;i<1000;i++){
            e.agrega(ran.nextGaussian());
        }
        System.out.println("Media ="+e.media());
        System.out.println("Desviación Típica= "+e.desviacionTipica());
    }
}
