import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SherlockMovingTiles {

    public static void main(String args[]){

        List<Long> queries = List.of(258385599125L);
        List<Double> results = movingTiles(1000000, 1000004 , 1000003, queries);
        System.out.println(results.get(0));
    }

    public static List<Double> movingTiles(int l, int s1, int s2, List<Long> queries) {
        List<Double> results = new ArrayList<>();
        for(long q : queries){
            double t;
            if(s1!=s2) {
                int diff = s2 > s1 ? s2 - s1 : s1 - s2;
                t = (Math.sqrt(2) * (l - Math.sqrt(q))) / diff;
            }else{
                t=0;
            }
            results.add(t);
        }
        return results;

    }
}
