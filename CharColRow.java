package ThirtyMinutes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharColRow {
    static ArrayList<Integer> spielerPos = new ArrayList<>();
    static ArrayList<Integer> comPos = new ArrayList<>();
    static ArrayList<Integer> trackPos = new ArrayList<>();

    static String trackPositions(){ //check winners
       // char[][] topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List diagonal1 = Arrays.asList(1,5,9);
        List diagonal2 = Arrays.asList(7,5,3);

        //winOrLose(topRow, midRow, botRow, leftCol, midCol, rightCol, diagonal1, diagonal2);

        return "have you seen me";
    }
}
