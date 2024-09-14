import java.util.ArrayList;
import java.util.Scanner;
public class Cinema {
    
    Scanner teclado= new Scanner(System.in);
    ArrayList<String> nomesfilmes=new ArrayList<>();
    ArrayList<Float> horario=new ArrayList<>();

    public void cadastro(){
        for (int i =0;i<5;i++){
            System.out.println("NOME DO FILME: ");
            String filme=teclado.nextLine();
            nomesfilmes.add(filme);

            System.out.println("HORÁRIO DO FILME: ");
            float hora=teclado.nextFloat();
            horario.add(hora);
        }
    }
    public void informar(){
        System.out.println("FILMES CADASTRADOS: ");
        for (int i=0;i<nomesfilmes.size();i++){
            System.out.println("FILME CADASTRADO: "+nomesfilmes.get(i) + " NO HORÁRIO: "+horario.get(i));
        }
    }

}
