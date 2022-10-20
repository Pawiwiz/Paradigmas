package Extras;

public class OrdenaGenerica <T extends Comparable>{
    T a[];
    public T getA(){
        T mayor;
        if (a.length== 0||a== null)
            return a [0];
        mayor =a [0];
        for (T e:a){
            if (e.compareTo(mayor)>0){
                mayor=e;
            }
        }
        return mayor;
    }
}
