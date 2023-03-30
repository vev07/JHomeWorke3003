package Array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] station = {0, 200, 375, 550, 750, 950};
        System.out.println(Arrays.toString(station));
        System.out.println(minStop(station, 400));
    }

    public static int minStop(int[] station, int capaSity){
        int result = 0;
        int carrentStop = 0;
        while (carrentStop < station.length - 1) {
            int nexStop = carrentStop;
            while (nexStop < station.length - 1 && station[nexStop + 1] - station[carrentStop] <= capaSity)
                nexStop++;
            if (carrentStop == nexStop)
                return -1;
            if (nexStop < station.length - 1)
                result++;

            carrentStop = nexStop;

        }

        return result;


    }

}
