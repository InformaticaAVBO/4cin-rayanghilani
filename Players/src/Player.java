import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;

public class Player{
    String nome;
    int valore;

    public Player(String nome, int valore){
        this.nome=nome;
        this.valore=valore;
    }

    public void scrivifile(){
        File f = new File("data/" + nome + ".txt");

        try(PrintWriter scrivi =new PrintWriter(f)){
            scrivi.println(this.valore);
            scrivi.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("ho creato un file e ci ho messo un valore controlla nella cartella dati");

    }
}