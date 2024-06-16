import java.time.LocalDate;

public class Person {
    private String name;
    private String lastName;
    private String document;
    private String email;
    private String nickname;
    private LocalDate birthdate;

    public Person(String name, String lastName, String document, String email, String nickname, LocalDate birthdate) {
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.email = email;
        this.nickname = nickname;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", document='" + document + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }


    static class PersonBuilder {
        private String name;
        private String lastName;
        private String document;
        private String email;
        private String nickname;
        private LocalDate birthdate;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder lastname(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder document(String document) {
            this.document = document;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public PersonBuilder birthdate(LocalDate birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public Person build () {
            return new Person(name, lastName, document, email, nickname, birthdate);
        }
    }

}
