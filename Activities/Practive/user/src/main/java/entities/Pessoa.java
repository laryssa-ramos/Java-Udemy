/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Laryssa
 */
public class Pessoa {
    
    private String nome;
    private int anoNascimento;
    private double altura;

    public Pessoa(String nome, int anoNascimento, double altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return anoNascimento;
    }

    public void setAno(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public int idade(int anoAtual){
       return anoAtual - this.anoNascimento;
    }
    
    public String toString(){
    
        return "Nome: "
                + nome
                +", Data de nascimento: "
                + anoNascimento
                +", Altura: "
                + altura;
        
    
    }
    
    
}
