package org.example.ManagementBook;

public class Autor {

    int id;
    String firsName;
    String LastName;

    public Autor(int id, String firsName, String lastName) {
        this.id = id;
        this.firsName = firsName;
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", firsName='" + firsName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
