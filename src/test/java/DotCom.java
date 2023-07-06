import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String status = "miss";
        int idx = locationCells.indexOf(userInput);

        if (idx >= 0) {
            locationCells.remove(idx);

            if (locationCells.isEmpty()) {
                status = "kill";
                System.out.println("Ouch! you sunk " + name + "    :( ");
            } else {
                status = "hit";
            }
        }

        return status;
    }
}
