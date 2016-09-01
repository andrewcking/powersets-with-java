import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.stream.Collectors;

public class PowerSet {

    public ArrayList<Object> powerset(List<Character> list) {
        List<Character> noDupList = list.stream().distinct().collect(Collectors.toList());
        ArrayList powerSetList = new ArrayList(new ArrayList());
        powerSetList.add(new ArrayList());
        for (char c : noDupList) {
            for (Object set : new ArrayList(powerSetList)) {
                ArrayList sub = new ArrayList((Collection) set);
                sub.add(c);
                powerSetList.add(sub);
            }
        }

        return powerSetList;
    }


    public JavaRefresh() {
        List<Character> powerList = new ArrayList<>();
        powerList.add('a');
        powerList.add('b');
        powerList.add('c');
        System.out.println("List: " + powerList);
        System.out.print("Powerset: ");
        System.out.println(powerset(powerList));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaRefresh javaRefresh = new JavaRefresh();
    }

}
