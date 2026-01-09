import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Player{
    private String nome;
    private int valore;

    public Player(String nome){
        this.nome=nome;
        this.valore=0;
    }

    public void load(){
        File f = new File("data/" + nome + ".txt");
        try{
            Scanner sc = new Scanner(f);
            valore = sc.nextInt();
            sc.close();;
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }

    public void setValore(int valore){
        this.valore=valore;
    }

    public void save(){
        File f = new File("data/" + nome + ".txt");

        try(PrintWriter pw =new PrintWriter(f)){
            pw.println(this.valore);
            pw.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("ho creato un file e ci ho messo un valore controlla nella cartella dati");

    }
    @Override
    public String toString() {
        return "Player [name=" + nome + ", valore=" + valore + "]";
    }
}