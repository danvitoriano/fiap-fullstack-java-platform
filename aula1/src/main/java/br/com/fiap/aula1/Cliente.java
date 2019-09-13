package br.com.fiap.aula1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cliente {

    private String nome;
    private String endereco;
    private String numeroCPF;
    private String numeroRG;

    public Cliente(){
        System.out.println("chamei construtor default");
    }

    public Cliente(String numeroRG){
        this();
        this.numeroRG = numeroRG;
        System.out.println("chamei construtor 1 param");
    }

    public Cliente(String numeroRG, String numeroCPF, String endereco, String nome){
        this(numeroRG);
        this.nome = nome;
        this.endereco = endereco;
        this.numeroCPF = numeroCPF;
        System.out.println("chamei construtor 4 params");
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public String getNumeroRG() {
        return numeroRG;
    }

    public void setNumeroRG(String numeroRG) {
        this.numeroRG = numeroRG;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("288033516","25158897867","rua 1","danilo");
        System.out.println(cliente.getNumeroRG());
        cliente.setNumeroRG("000000");
        System.out.println(cliente.getNumeroRG());
        String retorno = cliente.getNome();
        System.out.println("meu nome é: " + retorno);
    }
}
