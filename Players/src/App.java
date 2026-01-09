public class App {
    public static void main(String[] args) throws Exception {
        Player p1 = new Player("eheh");
        p1.load();
        p1.save();
        System.out.println(p1);
    }
}
