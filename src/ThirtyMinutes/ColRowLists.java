package ThirtyMinutes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ColRowLists {
    static ArrayList<Integer> spielerPos = new ArrayList<>();
    static ArrayList<Integer> comPos = new ArrayList<>();
    static ArrayList<Integer> trackPos = new ArrayList<>();

    static String trackPositions(){ //check winners
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List diagonal1 = Arrays.asList(1,5,9);
        List diagonal2 = Arrays.asList(7,5,3);

        winOrLose(topRow, midRow, botRow, leftCol, midCol, rightCol, diagonal1, diagonal2);

        return "have you seen me";
    }

    static String winOrLose(List topRow, List midRow, List botRow, List leftCol, List midCol, List rightCol, List diagonal1, List diagonal2){
        trackPositions();

        List iWon = new ArrayList<>();
        iWon.add(topRow);
        iWon.add(midRow);
        iWon.add(botRow);
        iWon.add(leftCol);
        iWon.add(midCol);
        iWon.add(rightCol);
        iWon.add(diagonal1);
        iWon.add(diagonal2);

        for(var l: iWon){
            if(spielerPos.containsAll((Collection<?>) l)){
                return "you won!";
            } else if (comPos.contains(l)){
                return "com won, try again";
            } else if (spielerPos.size() + comPos.size() == 9) { //board is full
                return "we're all tied";
            }
        }
        return "have you seen me";
    }
}
