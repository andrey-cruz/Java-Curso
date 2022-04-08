package br.com.senai.model;

public class Aula {
    private int id;
    private String link;
    private String conteudo;
    private String titulo;

    public Aula(int id, String link, String conteudo, String titulo) {
        this.id = id;
        this.link = link;
        this.conteudo = conteudo;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id=" + id +
                ", link='" + link + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
