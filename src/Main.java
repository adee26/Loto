import service.Service;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] userNo = new int[6];
        Service service = new Service();
        Service.giveValues(userNo);
        int[] randomNo = new int[6];
        Service.randomValues(randomNo);
        Service.compareNumbers(userNo, randomNo);
    }

}
