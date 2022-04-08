package br.com.senai.model;

public class Cursos {
    private String tipoCurso;
    private String titulos;
    private int qtdeAlunos;
    private String descricao;

    public Cursos(String tipoCurso, String titulos, int qtdeAlunos, String descricao) {
        this.tipoCurso = tipoCurso;
        this.titulos = titulos;
        this.qtdeAlunos = qtdeAlunos;
        this.descricao = descricao;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public int getQtdeAlunos() {
        return qtdeAlunos;
    }

    public void setQtdeAlunos(int qtdeAlunos) {
        this.qtdeAlunos = qtdeAlunos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "tipoCurso='" + tipoCurso + '\'' +
                ", titulos='" + titulos + '\'' +
                ", qtdeAlunos=" + qtdeAlunos +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
