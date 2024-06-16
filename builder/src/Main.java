import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person =
                new Person.PersonBuilder()
                        .name("name")
                        .nickname("nickname")
                        .document("document")
                        .email("email")
                        .lastname("lastname")
                        .birthdate(LocalDate.of(1985, 03,12))
                        .build();
    }
}