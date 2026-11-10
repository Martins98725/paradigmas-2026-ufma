import java.time.LocalDateTime;

public interface Agendavel {
    void agendarPara(int h);

    int horarioAgendado();

   default String resumoAgendamento(){
       return "Agendado para as: " + horarioAgendado() + "h";
   }
}
