package org.example.ExoEnum;

public enum Prio {
    HIGH("a"),
     MEDIUM("b"),
    LOW("c"),
    Low("d");

     private String priority;

    private  Prio(String letter) {
        this.priority = letter;
    }


    public String getPriority() {return this.priority; }
}
