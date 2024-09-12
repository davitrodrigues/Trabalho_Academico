public class Assento {

    private boolean[][] disponivel;

    public Assento() {
        this.disponivel = new boolean[5][4];

        for(int i = 0; i < disponivel.length; i++){
            for(int j = 0; j < disponivel[i].length; j++){
                this.disponivel[i][j] = true;
            }
        }
    }

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

}