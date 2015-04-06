/**
 * Created by Валерия on 05.04.2015.
 */
public class AllActivities {
    private Main MAIN;

    @Override
    public String toString() {
        return " {" + MAIN + "} ";
    }

    public Main getMAIN() {
        return MAIN;
    }

    public void setMAIN(Main MAIN) {
        this.MAIN = MAIN;
    }
}
