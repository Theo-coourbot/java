package org.example.orienterObjet.exempleSimple;

public class Phone extends Product{


    int price;

    public Phone(int id, String name, int price) {
        super(id, name);
        this.price = price;
    }

    public Phone(int price) {
        this.price = price;
    }


    public void quiSuisJe(){
        super.quiJeSuis();
        System.out.println("je suis un telephone");
    }

    @Override
    public String toString() {
        return "phone{" +
                "price=" + price +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
