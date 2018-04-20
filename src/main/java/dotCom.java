import java.util.ArrayList;

public class dotCom {
    private ArrayList<String> positions = new ArrayList<>();

    dotCom() {
        positions.add("1");
        positions.add("2");
        positions.add("3");
    }

    public String check(String location) {
        int index = positions.indexOf(location);
        if (index == -1) {
            return "missed";
        }

        positions.remove(location);
        if (positions.isEmpty()) {
            return "killed";
        } else {
            return "hit";
        }
    }
}
