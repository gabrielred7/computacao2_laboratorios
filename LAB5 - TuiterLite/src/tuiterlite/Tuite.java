
package tuiterlite;

import java.util.ArrayList;

public class Tuite<T> {
    
    private final Usuario autor;
    private final String texto;

    public Tuite(Usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }
    
    public void anexarAlgo(Object anexo){
    
    }
    
    public Object getAnexo(){
        return null;
    }
    
    public ArrayList<String> getHashtags(){
        return null;
    }
    
    public Usuario getAutor() {
        return this.autor;
    }

    public String getTexto() {
        return this.texto;
    }
}