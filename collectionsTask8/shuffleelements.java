import java.util.ArrayList;
import java.util.Collections;

public class shuffleelements 
{
    public static void main(String[] args) 
    {
    ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        Collections.shuffle(list);
        System.out.println("Shuffled ArrayList: " + list);
    }
},