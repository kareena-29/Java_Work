package Assignments.Assign1;

import java.util.ArrayList;
import java.util.List;

public class FinalData {
    public List<DataStorage> datalist = new ArrayList<>();

    public void addBook(DataStorage bookx) {
        datalist.add(bookx);
    }
}
