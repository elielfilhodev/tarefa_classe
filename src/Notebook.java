/*
    @Autor Eliel Filho
    Criação da classe Notebook
*/

public class Notebook {
    public static void main(String[] args) {
        Objeto meuNotebook = new Objeto();
        meuNotebook.modelo = "Lenovo";
        meuNotebook.gigas = 32;

        System.out.println(meuNotebook.modelo + " - " + meuNotebook.gigas);
    }
}