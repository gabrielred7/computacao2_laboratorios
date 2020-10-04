
package tuiterlite;


public class Principal {
    
    public static void main(String[] args) {
        TuiterLite tuiter = new TuiterLite();
        Usuario user1 = tuiter.cadastrarUsuario("Gabriel", "gabriel@gmail.com");
        Tuite tut1 = tuiter.tuitarAlgo(user1, "Vou #comer um #sushi");
        Tuite tut2 = tuiter.tuitarAlgo(user1, "Vou transar");
        Tuite tut3 = tuiter.tuitarAlgo(user1, "vou #encher a #cara"); 
        System.out.println(user1.toString());
        tuiter.getHashtagMaisComum();
        /*
        String frase = "Testando algo,sdf com #hashtags no meio #teste vamos ver!fdfgf";
        String[] palavras = frase.split("[\\s,!]");
        for (String palavra : palavras) {
            if (palavra.startsWith("#")) {
                System.out.println(palavra);
            }
        }

        // Ilustrando o uso de um StringBuilder (ou StringBuffer)
        StringBuffer sb = new StringBuffer();
        sb.append("Oi,");
        sb.append(" tudo bem?");
        sb.append("0").append("1").append(2).append("3");
        String resultadoDasConcatenacoes = sb.toString();
        System.out.println(resultadoDasConcatenacoes);

        String minhaString;
        minhaString = "Oi,";
        minhaString += " tudo bem?";
        minhaString += "0";
        minhaString += "1";
        minhaString += "2";
        minhaString += "3";
        System.out.println(minhaString);
        */
    }
}
