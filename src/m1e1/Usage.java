package m1e1;

import java.util.ArrayList;
import java.util.List;

public class Usage {
    public static void main(String[] args) {
        Sex w=new Sex("w");
            Woman anna=new Woman("Anna",w);
            Woman lena=new Woman("Lena",w);
            Woman nasta=new Woman("Anastasia",w);
            List<Woman> list=new ArrayList<>();
            list.add(anna);
            list.add(lena);
            list.add(nasta);

            Main ex=new Main();
        System.out.println( ex.findFirst(list,"Ana",w).getName());

    }
}


