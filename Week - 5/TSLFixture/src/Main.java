import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");

        Random rnd = new Random();
        int cekilis = rnd.nextInt(6);
        System.out.println(cekilis);

        String evSahibi = teams.get(cekilis);
        String deplasman = teams.get(cekilis);
        HashMap<String, String> fixture = new HashMap<>();
        if (!evSahibi.equals(deplasman) && fixture.containsKey(evSahibi)){

            fixture.put(evSahibi,deplasman);
        }



    }
}