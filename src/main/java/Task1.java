import Utils.MyReader;
import java.util.ArrayList;

public class Task1 {
    public static int find2Numbers2020AndMultiply(ArrayList<Integer> list){
        int result = 0;
        for(int i = 0; i < list.size(); i++){
            for (int j = 0; j< list.size(); j++){
                if(list.get(i) + list.get(j) == 2020){
                    result = list.get(i) * list.get(j);
                }
            }
        }
        return result;
    }
    public static int find3Numbers2020andMultiply(ArrayList<Integer> list){
        int result = 0;
        for(Integer first: list){
            for(Integer second: list){
                int third = 2020 - first - second;
                if(list.contains(third)){
                    result = first * second * third;
                }
            }

        }
        return result;
    }
    public static void main(String[] args){
        ArrayList<Integer> list = MyReader.readToList("src/main/resources/input1.txt");

        System.out.println("Part 1: " + find2Numbers2020AndMultiply(list));
        System.out.println("Part 2: " + find3Numbers2020andMultiply(list));

    }
}
