package QuiEstCe;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.HashMap;

public class Data {

    private String id;
    private HashMap<String,String> caracs;
    private boolean isUp = true;

    public Data(String id) {

        this.id = id;
        this.isUp = true;
        caracs = new HashMap<String,String>();

    }

    public String getId() {

        return this.id;

    }

    public boolean getIsUp() {

        return this.isUp;

    }

    public void setIsUp(boolean b) {

        this.isUp = b;

    }

    public HashMap<String, String> getCaracs() {
        return caracs;
    }

    public void setCaracs(HashMap<String, String> caracs) {
        this.caracs = caracs;
    }

    public ObservableList<String> getAttributs() {

        ObservableList<String> attributs = FXCollections.observableArrayList(this.caracs.keySet());
        return attributs;

    }

    @Override
    public String toString() {

        String res = "";

        for(String key : caracs.keySet()) {

            res += key + " : " + caracs.get(key) + ", ";

        }

        return "ID : " + this.getId() + "\n" + res + "\n" + this.getIsUp();

    }

}
