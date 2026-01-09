import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class Team {
    
    private String nome;
    ArrayList<Player> players;//le parentesi angolari si usano quando uno sta definiscono delle classi generiche che sono classi che hanno come parametri altre classi


    public Team(String nome){
        this.nome=nome;
        players = new ArrayList<>();
    }

    public void add(Player p){
        players.add(p);
    }
    public void salvaTeam(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/" + nome + ".txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
