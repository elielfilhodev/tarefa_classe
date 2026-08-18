/*
    @Autor Eliel Filho
    Criação da classe Notebook
*/

public class Notebook {

    private String modelo;
    private int gigas;

    // Getters: apenas leem, não têm lógica
    public String getModelo() {
        return modelo;
    }

    public int getGigas() {
        return gigas;
    }

    // Setters: são o "porteiro" do objeto
    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio.");
        }
        this.modelo = modelo;
    }

    public void setGigas(int gigas) {
        if (gigas <= 0) {
            throw new IllegalArgumentException("Armazenamento deve ser positivo.");
        }
        this.gigas = gigas;
    }
}