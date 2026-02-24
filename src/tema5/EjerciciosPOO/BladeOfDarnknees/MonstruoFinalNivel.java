package tema5.EjerciciosPOO.BladeOfDarnknees;

public class MonstruoFinalNivel extends Monstruo{
    private Double golpeEspecial;
    private Integer usosGolpeEspecial;


    public MonstruoFinalNivel(String nombre, ClaseMonstruo tipoMonstruo) {
        super(nombre, tipoMonstruo);
        this.golpeEspecial = 100.0;
        this.usosGolpeEspecial = 2;
    }

    public Double getGolpeEspecial() {
        return golpeEspecial;
    }

    public void setGolpeEspecial(Double golpeEspecial) {
        this.golpeEspecial = golpeEspecial;
    }

    public Integer getUsosGolpeEspecial() {
        return usosGolpeEspecial;
    }

    public void setUsosGolpeEspecial(Integer usosGolpeEspecial) {
        this.usosGolpeEspecial = usosGolpeEspecial;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MonstruoFinalNivel{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", vida=").append(vida);
        sb.append(", nivel=").append(nivel);
        sb.append(", ataque=").append(ataque);
        sb.append(", golpeEspecial=").append(golpeEspecial);
        sb.append(", usosGolpeEspecial=").append(usosGolpeEspecial);
        sb.append('}');
        return sb.toString();
    }
     public Double golpear(){
        if (usosGolpeEspecial > 0){
            usosGolpeEspecial--;
            return golpeEspecial;
        }
        //Esto lo he buscado porque no se como se hace
        return super.golpear();
     }
}
