public class Main {
    public static void main(String[] args) {


        AgendaLazy agenda = AgendaLazy.getInstance();

        agenda.ocupa("Sexta");
        agenda.ocupa("Sabado");

        System.out.println(agenda);

        AgendaEnum agenda1 = AgendaEnum.getInstance();
        AgendaEnum agenda2 = AgendaEnum.getInstance();

        System.out.println(agenda1.hashCode());
        System.out.println(agenda2.hashCode());



    }
}