package seminar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       //Angajat a1 = new Angajat("robert",1,123,null);
       //Angajat a2 = new Angajat("robert",1,123,null);
       //Angajat a3 = new Angajat("robert",1,123,null);
       //List<Angajat> angList = new ArrayList<>();
       //angList.add(a1);
       //angList.add(a2);
       //angList.add(a3);
       //Angajat tm1 = new Angajat("tm1",2,1234,angList);
        CarOS o1 = new CarOS("a");
        CarOS o2 = new CarOS("a");
        List<OS> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);
        UpdateServer us = new UpdateServer("b",list);
        o1.printLastUpdate();
        o2.printLastUpdate();
        us.pushUpdates();
        o1.printLastUpdate();
        o2.printLastUpdate();
    }
}
