import java.util.ArrayList;

public class Assento {

    private ArrayList<ArrayList<Boolean>> disponivel;

    /* Construtor da Classe */
    public Assento() {
        this.disponivel = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            ArrayList<Boolean> linha = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                linha.add(true); 
            }
            this.disponivel.add(linha);
        }
    }

    /* Método que vai imprimir "O" caso disponível o lugar (true) e "X" para lugar indisponível (false) */
    public String mostraLugares() {
        String resultado = "";
        for (ArrayList<Boolean> linha : disponivel) {
            for (Boolean assento : linha) {
                if (assento) {
                    resultado += "O";
                } else {
                    resultado += "X";
                }
            }
            resultado += "\n";
        }
        return resultado;
    }

    /*Espaco para get e set */

}
