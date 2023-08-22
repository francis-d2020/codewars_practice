import java.util.ArrayList;

public class peopleInBus {

    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        int get = 0, out = 0;
        for (int i = 0; i < stops.size(); i++) {
            get += stops.get(i)[0];
            out += stops.get(i)[1];
        }
        return get - out;

    }

}
