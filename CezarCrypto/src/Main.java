public class Main {

    public static void main(String args[]){
        String ss = descriptografar("");

        System.out.println(ss);

    }


    public static String criptografar(String texto) {
        if (texto.isEmpty()) {
            throw new UnsupportedOperationException("Texto vazio.");
        }

        String novoTexto = "";
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++){
            novoTexto += criptografar(texto.charAt(i), 3);
        }
        return novoTexto;
    }

    public static char criptografar(char letra, int chave){
        char novaLetra;

        if (letra >= 97 && letra <= 122) {
            novaLetra = (char) ((letra - 97 + chave) % 26 + 97);
        }
        else if (letra >= 65 && letra <= 90) {
            novaLetra = (char) ((letra - 65 + chave) % 26 + 65);
        }
        else {
            novaLetra = letra;
        }

        return novaLetra;
    }

    public static String descriptografar(String texto) {
        if (texto.isEmpty()) {
            throw new UnsupportedOperationException("Texto vazio.");
        }

        String novoTexto = "";
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            novoTexto += descriptografar(texto.charAt(i), 3);
        }

        return novoTexto;
    }


    public static char descriptografar(char letra, int chave) {
        char novaLetra;

        if (letra >= 97 && letra <= 122) {
            novaLetra = (char) ((letra - 97 - chave) % 26 + 97);
        } else if (letra >= 65 && letra <= 90) {
            novaLetra = (char) ((letra - 65 - chave) % 26 + 65);
        } else {
            novaLetra = letra;
        }

        return novaLetra;
    }
}
