package tema7.PilaNumerica;


import java.lang.classfile.constantpool.DoubleEntry;
import java.util.ArrayList;
import java.util.List;

public class PilaNumerica<T extends Number>{

    private List<T> pilaNumerica = new ArrayList<>();

    public void setPilaNumerica(List<T> pilaNumerica) {
        this.pilaNumerica = pilaNumerica;
    }

    public List<T> getPilaNumerica() {
        return pilaNumerica;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PilaNumerica{");
        sb.append("pilaNumerica=").append('\n');
        for (T pilanumerica: pilaNumerica)
            sb.append(pilanumerica).append('\n');
        sb.append('}');
        return sb.toString();
    }

    public void apilar(T numero){

        pilaNumerica.addLast(numero);
    }
    public T desapilar(){
        return pilaNumerica.remove(pilaNumerica.size()-1);
    }
    public Double suma(){
        Double total = 0.0;
        for (T numero : pilaNumerica){
            total += numero.doubleValue();
        }
        return total;
    }
    public void pintar(){
        for (T numero: pilaNumerica){
            IO.println(numero);
        }
    }

}
