
package pilares_poo;

public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "numeroLados=" + numeroLados;
    }
    //declaramos el area como adstracto 
 public abstract double area();
 
}
