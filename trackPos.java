package ThirtyMinutes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class trackPos implements TTTInterface {

    static ArrayList<TTTInterface> spielerPos = new ArrayList<>();
    static ArrayList<TTTInterface> comPos = new ArrayList<>();
    static ArrayList<TTTInterface> trackPos = new ArrayList<>();
    private Tic_Tac_Toe ttt;


    static String trackPositions(){ //check winners
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List diagonal1 = Arrays.asList(1,5,9);
        List diagonal2 = Arrays.asList(7,5,3);

        return "have you seen me";
    }


    protected static String winOrLose(){
        //trackPositions();


        List<TTTInterface> iWon = new ArrayList<>();
        iWon.add(new trackPos());
        iWon.add(new Tic_Tac_Toe()); //import the positionlist
        //iWon.add

        for(TTTInterface l: iWon){
            if(spielerPos.containsAll((Collection<TTTInterface>) l)){
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
