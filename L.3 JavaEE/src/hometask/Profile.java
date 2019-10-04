package hometask;

public class Profile {
    private String name;
    private String surname;
    private String email;
    private Integer age;

    public Profile(String name, String surname, String email, Integer age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users profile: " +
                "First Name: " + name +
                ", Last Name: " + surname +
                ", E-mail: " + email +
                ", Age: " + age;
    }
}