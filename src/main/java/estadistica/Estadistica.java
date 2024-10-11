package estadistica;

public class Estadistica {

    private int nElementos;
    private double sumaX;
    private double sumaX2;

    public Estadistica() {
        this.nElementos = 0;
        this.sumaX = 0;
        this.sumaX2 = 0;
    }
    /// Agrega el dato d a la seria
    ///
    /// @param d valor
    public void agrega(double d){
        nElementos+=1;
        sumaX=sumaX+d;
        sumaX2=sumaX2+(d*d);
    }
    // Agrega el dato d a la serie
    ///
    /// @param d valor
    /// @param n el numero de veces
    public void agrega(double d,int n){
        nElementos+=n;
        sumaX+=n*d;
        sumaX2+=n*(d*d);
    }

    /// Devuelve el valor de la media aritmética
    ///
    public double media(){
        return (sumaX/nElementos);
    }
    /// Devuelve el valor de la varianza
    ///
    public double varianza(){
        return ((sumaX2/nElementos)-(media()*media()));
    }
    /// Devuelve el valor de la desviación típica
    ///
    public  double desviacionTipica(){
        return Math.sqrt(varianza());
    }

}
