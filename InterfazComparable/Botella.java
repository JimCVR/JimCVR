package InterfazComparable;
import java.lang.Comparable;
public class Botella implements Comparable<Botella>{
    int capacidad;
    public Botella(int capacidad){
        this.capacidad=capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int compareTo(Botella other){
        if(this.capacidad < other.getCapacidad()){return -1;
        }
        if(this.capacidad > other.getCapacidad()){return 1;
        }
        return 0;
    }
}
