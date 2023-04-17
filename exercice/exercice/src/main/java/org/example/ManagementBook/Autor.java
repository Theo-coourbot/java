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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
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
