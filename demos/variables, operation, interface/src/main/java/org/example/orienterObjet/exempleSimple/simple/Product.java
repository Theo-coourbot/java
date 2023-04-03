package org.example.orienterObjet.exempleSimple;

public class Product {

    protected int id;
    protected String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  quiJeSuis(){
        System.out.println("je suis un product");
    }
    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
