import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;

public class Player{
    private String nome;
    private int valore;

    public Player(String nome){
        this.nome=nome;
        this.valore=0;
    }

    public void setValore(int valore){
        this.valore=valore;
    }

    public void save(){
        File f = new File("data/" + nome + ".txt");

        try(PrintWriter pw =new PrintWriter(f)){
            pw.println(this.valore);
            pw.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("ho creato un file e ci ho messo un valore controlla nella cartella dati");

    }
}