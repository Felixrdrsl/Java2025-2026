package tema5.ejercicioClase.modelos;

public enum PrioridadTarea {
    BAJA(1),
    MEDIA(2),
    ALTA(2),
    URGENTE(4);

    private int prioridad;
        PrioridadTarea(int valor){
            this.prioridad = valor;
        }

        public int getValor(){
            return prioridad;
        }

}
