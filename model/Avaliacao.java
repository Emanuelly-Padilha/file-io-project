package br.edu.ifpr.model;

public class Avaliacao {

    private int id;
    private int usuarioId;
    private int filmeId;
    private int nota;
    private String review;

    public Avaliacao(int usuarioId, int filmeId, int nota, String review) {
        this.usuarioId = usuarioId;
        this.filmeId = filmeId;
        this.nota = nota;
        this.review = review;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getFilmeId() {
        return filmeId;
    }

    public void setFilmeId(int filmeId) {
        this.filmeId = filmeId;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
