import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Map<String, Double> finalMap = new HashMap<>();
        addCities(cities);
        takeTemp(cities, finalMap);
        printMap(finalMap);
    }
    static void addCities(ArrayList a){
        System.out.println("type in city names. type END to end.");
        String city = "";
        while(!(city.equals("END"))){
            city = input.nextLine();
            if(!(city.equals("END"))) {
                a.add(city);
            }
        }
    }
    static void takeTemp(ArrayList a, Map b){
        for (Object i : a) {
            System.out.println("list five temperatures for each city.");
            System.out.println(a.get(a.indexOf(i))+":");
            int temp1 = input.nextInt();
            int temp2 = input.nextInt();
            int temp3 = input.nextInt();
            int temp4 = input.nextInt();
            int temp5 = input.nextInt();
            double avg = (temp1+temp2+temp3+temp4+temp5)/5;
            b.put(i,avg);
        }

    }
    static void printMap(Map a){
        System.out.println(a);
    }
}