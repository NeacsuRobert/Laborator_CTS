package seminar;

import java.util.ArrayList;
import java.util.List;

public class UpdateServer {
    String updatePackage;
    List<OS> listObservers;

    public UpdateServer(String updatePackage, List<OS> listObservers) {
        this.updatePackage = updatePackage;
        this.listObservers = new ArrayList<>();
        for(int i=0;i<listObservers.size();i++)
        {
            this.listObservers.add(listObservers.get(i));
        }
    }

    public void setUpdatePackage(String updatePackage) {
        this.updatePackage = updatePackage;
    }

    public void addObs(OS o){
        this.listObservers.add(o);
    }

    public void delObs(OS o){
        this.listObservers.remove(o);
    }

    public void pushUpdates(){
        for(int i=0;i<this.listObservers.size();i++)
        {
            listObservers.get(i).update(this.updatePackage);
        }
    }
}
