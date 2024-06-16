import java.util.HashMap;
import java.util.Map;

public enum AgendaEnum {

    AGENDA;
    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    private AgendaEnum(){
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sabado", Boolean.TRUE);
    }

    public static AgendaEnum getInstance() {
        return AGENDA;
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
