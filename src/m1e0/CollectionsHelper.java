package m1e0;


import java.util.ArrayList;
import java.util.List;

public class CollectionsHelper {

    public static int findIndex(final List list, final Object target) {
        // BEGIN (write your solution here)
return list.indexOf(target);
        // END
    }

    public static void main(String[] args) {

        List<Integer> arrList =new ArrayList<>();
        arrList.add(1);
        arrList.add(5);
        arrList.add(5);
        int res = CollectionsHelper.findIndex(arrList,5);
        System.out.println(res);
    }

}
