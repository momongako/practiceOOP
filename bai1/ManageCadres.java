package bai1;

import java.util.ArrayList;
import java.util.List;

public class ManageCadres {
    private List<Cadres> cadress;
    public ManageCadres(){
        this.cadress = new ArrayList<>();
    }

    public void addCadres(Cadres cadres){
        this.cadress.add(cadres);
    }

    public List SearchByName(String name){

        List CadresByName = new ArrayList<>();

        for(Cadres cadres : this.cadress){

            if(cadres.getName().contains(name)){

                CadresByName.add(cadres);
            }

            
        }
        return CadresByName;
      
    }
    public void showListCaders(){
        for (Cadres cadres : cadress) {
            System.out.println(cadres.toString());
        }
    }
    
    
}
