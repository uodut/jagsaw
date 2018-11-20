package linklist;

import java.util.*;

/**
 * @author gl
 * @create 2018-08-23 14:34
 **/
public class SortedMapByValue {
    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();
        map.put("2018-10-11", 63.09);
        map.put("2018-10-12", 63.83);
        map.put("2018-10-13", 63.05);
        map.put("2018-10-14", 63.86);
        map.put("2018-10-15", 65.67);
        map.put("2018-10-16", 65.81);
        map.put("2018-10-17", 67.24);

        List<Map.Entry<String, Double>> list = new ArrayList<Map.Entry<String, Double>>();
        list.addAll(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String, Double> m : list) {
            System.out.println(m.getKey() + " " + m.getValue() + "%");
        }
        double total = 0;
        for(Map.Entry<String, Double> m : list){
            total += m.getValue();
        }
        System.out.println("avg:"+ total/7);
    }
}
