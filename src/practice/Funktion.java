package practice;

public class Funktion {
    public static void reset(){
       for(int i = 0; i < Gui.state.length; i++){
           Gui.state[i] = 0;
       }
       Gui.spieler = 0;
       Gui.winner = 0;
    }
}
