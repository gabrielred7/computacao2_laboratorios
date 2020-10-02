
package tuiterlite;

import java.awt.Image;

public class Usuario {
    public static final int MIN_TUITES_SENIOR = 200;
    public static final int MIN_TUITES_NINJA = 1000;
    
    private NivelUsuario nivel;
    private String nome;
    private final String email;
    private Image foto;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.nivel = NivelUsuario.INICIANTE;
    }

    public NivelUsuario getNivel() {
        return nivel;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public Image getFoto() {
        return this.foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }
    
}