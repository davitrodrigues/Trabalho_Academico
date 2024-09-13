import java.util.ArrayList;

public class Assento {

    private ArrayList<ArrayList<Boolean>> disponivel;

    /* Construtor da Classe */
    public Assento() {
        this.disponivel = new ArrayList<>();

        // Inicializa a estrutura com 5 linhas e 4 assentos por linha
        for (int i = 0; i < 5; i++) {
            ArrayList<Boolean> linha = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                linha.add(true); // Assentos disponíveis inicialmente
            }
            this.disponivel.add(linha);
        }
    }

    /* Método que vai imprimir "O" caso disponível o lugar (true) e "X" para lugar indisponível (false) */
    public String mostraLugares() {
        String resultado = "";
        for (ArrayList<Boolean> linha : disponivel) {
            for (Boolean assento : linha) {
                resultado += (assento ? "O" : "X");
            }
            resultado += "\n"; // Nova linha após cada fila
        }
        return resultado;
    }

    // Método para obter o status de um assento específico
    public boolean getAssento(int linha, int assento) {
        return disponivel.get(linha).get(assento);
    }

    // Método para definir o status de um assento específico
    public void setAssento(int linha, int assento, boolean status) {
        this.disponivel.get(linha).set(assento, status);
    }
}
