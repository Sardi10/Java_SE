package JavaFundamentalsCoding19.Task19;

public class Author {
    private String surname;
    private String nationality;
    private String qyteti;
    private int mosha;

    public Author() {/* empty constructor */ }

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    public Author(String surname, String nationality, String qyteti, int mosha) {
        this.surname = surname;
        this.nationality = nationality;
        this.qyteti = qyteti;
        this.mosha = mosha;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getQyteti() {
        return qyteti;
    }

    public void setQyteti(String qyteti) {
        this.qyteti = qyteti;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                ", qyteti='" + qyteti + '\'' +
                ", mosha=" + mosha +
                '}';
    }
}
