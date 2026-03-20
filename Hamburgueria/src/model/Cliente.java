package model;

public class Cliente {

    private String Nome;
    private String Sobrenome;


    public Cliente(String nome, String sobrenome) {
        Sobrenome = sobrenome;
        Nome = nome;


    }

    public String getNomeInteiro(){
        return Nome + " " + Sobrenome;

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }
}