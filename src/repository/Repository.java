package repository;

import java.util.ArrayList;
import java.util.List;

public class Repository <T> {

    private List<T> items = new ArrayList<>();

    public void add(T data){

        items.add(data);
    }

    public List <T> getAll(){

        return items;
    }
}
