package br.edu.ifpr.model;

public class Watchlist {
        private int id;
    private int usuarioId;
    private int filmeId;

    public Watchlist(int usuarioId, int filmeId) {
        this.usuarioId = usuarioId;
        this.filmeId = filmeId;
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

}
