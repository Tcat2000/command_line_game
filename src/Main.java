import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Hashtable<String, space> map = spaces.init();

        String loc = "inside";

        while(true) {
            System.out.println(loc + ":");

            if(map.containsKey(loc)){
                for(int p = 0; p < map.get(loc).paths.length; p++){
                    System.out.println(p + ": " + map.get(loc).paths[p].text);
                }
            }

            String ln = scanner.nextLine();

            //System.out.println();

            if(ln.matches("exit")) return;
            else if(ln.matches("list \n")) System.out.println(map.keySet().toString());
            else if(ln.matches("gps \n")) System.out.println(loc);

            else if(locPaths(map, loc, ln)){
                loc = ln;
            }
            else if(!locPathsNum(map, loc, ln).matches("")) loc = locPathsNum(map, loc, ln);
            else System.out.println("Invalid, please inter the location you want to go to, e.g. \"0: go to road\" type \"road\", or, enter the number to the right of where you want to go.\n");

            //System.out.println("   " + locPathsNum(map, loc, ln));

            //else System.out.println(ln);
        }
    }

    public static boolean locPaths(Hashtable<String, space> map, String loc, String ln){
        for(int p = 0; p < map.get(loc).paths.length; p++){
            if(map.get(loc).paths[p].to.matches(ln)) return true;
        }
        return false;
    }
    public static String locPathsNum(Hashtable<String, space> map, String loc, String ln){
        for(int p = 0; p < map.get(loc).paths.length; p++){
            //System.out.println(p + " " + ln);
            if(("" + p).matches(ln)) return map.get(loc).paths[p].to;
        }
        return "";
    }
}

