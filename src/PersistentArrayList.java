import java.util.ArrayList;

public class PersistentArrayList {

    private ArrayList<String> names;

    PersistentArrayList() {
    }

    public String get(int i){
        String name = names.get(i);

        return name;
    }

    public void add(String element){
        String name = element;
        names.add(name);
    }

    public void clear() {
        names.clear();
    }
    public int size(){
        int size = names.size();

        return size;
    }

    public boolean contains(String element){
        boolean doesContain;
        doesContain = false;

        for (int i = 0; i < names.size() ; i++) {

        }
    }

}
