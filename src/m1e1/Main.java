package m1e1;


import java.util.ArrayList;
import java.util.List;

public class Main <T extends Human> {

    public T findFirst(final List<T> humans, final String namePrefix, final Sex sex) {

        for (T human : humans) {
            if (human.getName().startsWith(namePrefix) && human.getSex().equals(sex)) {
                int index = humans.indexOf(human);
                return humans.get(index);
            }
        }
        return null;
    }

    class Woman extends Human {

        public Woman(String name, Sex sex) {
            super(name, sex);
        }
    }
}


