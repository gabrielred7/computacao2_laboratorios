
package tuiterlite;

public class Principal {
    
    public static void main(String[] args) {
        TuiterLite tuiter = new TuiterLite();
        Usuario user1 = tuiter.cadastrarUsuario("Gabriel", "gabriel@gmail.com");
        Tuite tut1 = tuiter.tuitarAlgo(user1, "vou encher a #cara");
        Tuite tut2 = tuiter.tuitarAlgo(user1, "vamos #comer algo", "imagem");
        System.out.println(tut1.toString());
        System.out.println(tut2.toString());
        System.out.println(tuiter.getHashtagMaisComum());
    }
}
