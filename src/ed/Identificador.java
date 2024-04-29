package ed;

public class Identificador {

    public boolean validarIdentificador(String identificador) {
        // Longitud
        if (identificador.length() < 5 || identificador.length() > 15) {
            return false;
        }

        // Caracteres permitidos
        if (!identificador.matches("[a-zA-Z0-9]+(-[a-zA-Z0-9]+)*")) {
            return false;
        }

        // Carácter alfabético
        if (!identificador.matches(".*[a-zA-Z].*")) {
            return false;
        }

        // Palabras reservadas
        String[] palabrasReservadas = {"int", "double", "boolean", "String"
                , "if", "else", "while", "for", "class", "public", "private"
                , "static", "void", "return"};
        for (String palabra : palabrasReservadas) {
            if (identificador.equals(palabra)) {
                return false;
            }
        }

        return true;
    }
}
