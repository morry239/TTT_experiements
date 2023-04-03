package practice;

import java.awt.*;
import java.io.IOException;
import java.util.IllegalFormatException;

public class StringLoader {

    static String imgX, imgO;

    public StringLoader(){
        try{
            imgX = "X";
            imgO = "O";
        } catch (IllegalFormatException exp){ //Überleg mal welche Exception geeignet ist
            exp.printStackTrace();
        }
    }
}
