package Documento;

import java.util.List;

public class Documento {

    private String id;
    private String url;
    private String contenido;
    private List<String> usuariosAutorizados;

    public Documento(String id, String url, String contenido, List<String> usuariosAutorizados) {
        this.id = id;
        this.url = url;
        this.contenido = contenido;
        this.usuariosAutorizados = usuariosAutorizados;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getContenido() {
        return contenido;
    }

    public List<String> getUsuariosAutorizados() {
        return usuariosAutorizados;
    }
}
