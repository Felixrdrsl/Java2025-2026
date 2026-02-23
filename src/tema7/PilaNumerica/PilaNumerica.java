package tema7.PilaNumerica;


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

    public void apilar(T pilaNumerica){
        pilaNumerica.add()
    }
    public T desapilar(){

    }
}
