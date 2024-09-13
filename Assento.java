public class Assento {

    private boolean[][] disponivel;


    /*Construtor da Class */
    public Assento() {
        this.disponivel = new boolean[5][4];

        /*Aqui vai andar a matriz e iniciar tudo true (tudo disponivel) */
        for(int i = 0; i < disponivel.length; i++){
            for(int j = 0; j < disponivel[i].length; j++){
                this.disponivel[i][j] = true;
            }
        }
    }

    /* Thiago E Davi, aqui temos o metodo que vai imprimir "O" caso disponivel o lugar (true) e "X" para lugar indisponivel (false) */

    public String mostraLugares(){
        String resultado = "";
        for(int i = 0; i < disponivel.length; i++){
            for(int j = 0; j < disponivel[i].length; j++){
                if (disponivel[i][j]) {
                    resultado += "O";
                } else{
                    resultado += "X";
                }
            }
            resultado += "\n"; // Nova linha após cada fila
        }
        return resultado;
    }

    public boolean getAssento(int linha, int coluna) {
        return disponivel[linha][coluna];
    }

    
    public void setAssento(int linha, int coluna, boolean status) {
        this.disponivel[linha][coluna] = status;
    }

}