package org.example.orienterObjet.inner;

public class OuterClass {

    private static String message = "dans la classe interne";
    InnerClass innerClass = new InnerClass();

    public static class NewClass {
        public  void affiche() {
            System.out.println("dans le newClasse qui est static");
        }
    }


    public class InnerClass{


        public void  afficheMessage(){
            System.out.println("mon message dans affiche interne non statique");
        }
    }
}
