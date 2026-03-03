package tema6.repaso2.entidades;

import tema6.Practica3.Clases.Plan;

import java.time.LocalDate;

public class Voto {

    private static Long contadorId= 0L;

    protected Long id;
    protected Participante participante;
    protected Plan plan;
    protected TipoVoto tipo;
    protected LocalDate fechaVoto;
    protected String comentario; //opcional, puede ser null




}
