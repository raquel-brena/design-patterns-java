import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaLazy {

    public static AgendaLazy agenda = null;
    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    private AgendaLazy(){
        diasDisponiveis.put("Doming", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sabado", Boolean.TRUE);
    }

    public static AgendaLazy getInstance() {
        if (Objects.isNull(agenda)) {
            agenda =  new AgendaLazy();
            return agenda;
        }
        return agenda;
    }

    public Map<String, Boolean> getDiasDisponiveis() {
        return diasDisponiveis;
    }

    public void ocupa (String dia) {
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "diasDisponiveis=" + diasDisponiveis +
                '}';
    }
}
