package br.edu.ifpr.model;

public class FilmeAssistido {
     private int id;
    private int usuarioId;
    private int filmeId;
    private String dataAssistido;

    public FilmeAssistido() {
    }

    public FilmeAssistido(int usuarioId, int filmeId, String dataAssistido) {
        this.usuarioId = usuarioId;
        this.filmeId = filmeId;
        this.dataAssistido = dataAssistido;
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

    public String getDataAssistido() {
        return dataAssistido;
    }

    public void setDataAssistido(String dataAssistido) {
        this.dataAssistido = dataAssistido;
    }

}
