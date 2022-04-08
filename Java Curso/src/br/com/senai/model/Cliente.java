package br.com.senai.model;

import br.com.senai.model.Endereço;

public class Cliente {
    private String nome;
    private int telefone;
    private String email;
    private Endereço endereço;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Endereço getEndereço() {
        return endereço;
    }
    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "Cliente:" + nome + ", telefone: " + telefone + ", email: " + email + ", endereço: " + endereço;
    }
}
