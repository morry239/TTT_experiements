package ThirtyMinutes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tic_Tac_Toe{ //the correct naming of this class is TicTacToe
    /*in the gameboard method overwrite the board I pass in as a parameter with a brand new empty board,
    * then pring that brand new board*/
    static ArrayList<Integer> spielerPos = new ArrayList<>();
    static ArrayList<Integer> comPos = new ArrayList<>();
    static ArrayList<Integer> trackPos = new ArrayList<>();
    static ColRowLists crl = new ColRowLists();


    private static char[][] initBoard(){
        //initialise the board
            char[][] board = new char[][]{{' ', '|', ' ', '|', ' '},
                    {'-', '+', '-', '+', '-'},
                    {' ', '|', ' ', '|', ' '},
                    {'-', '+', '-', '+', '-'},
                    {' ', '|', ' ', '|', ' '}};
            System.out.println("initialised");
            return board;
    }

    private static void printBoard(char[][] board){
        //take the game board and print it
        initBoard();
            for(char[] zeile : board){
                for(char c : zeile){
                    System.out.print(c);
                }
                System.out.println();
            }
       System.out.println("printed");
    }

    private static void caseDecision(char board[][],int pos, String user){

        char ch = ' ';
        if(user.equals("human")){
            System.out.println("I am a human");
            ch = 'O';
            spielerPos.add(pos);
        } else if (user.equals("com")){
            System.out.println("I am a computer");
            ch = 'X';
            comPos.add(pos);

        }

        switch(pos){
            case 1:
                board[0][0] = ch;

                break;
            case 2:
                board[0][1] = ch;
                break;
            case 3:
                board[0][2] = ch;
                break;
            case 4:
                board[1][0] = ch;
                break;
            case 5:
                board[1][1] = ch;
                break;
            case 6:
                board[1][2] = ch;
                break;
            case 7:
                board[2][0] = ch;
                break;
            case 8:
                board[2][1] = ch;
                break;
            case 9:
                board[2][2] = ch;
                break;
            default:
                System.out.println("QA");
                break;
        }
        printBoard(board); //this will display the X

    }


    public static void main(String[] args) {
        char[][] board = new char[3][3];
        System.out.println("Welcome to Tic Tac Toe");
        userInput(board);
        System.out.println("the end is also the beginning");

    }

    private static void userInput(char[][] board){
        System.out.println("Select your pos 1-9");
        int roundCount = 0;
        while(board != null && roundCount < 10){

            int pos = new java.util.Scanner(System.in).nextInt();
            /*while(spielerPos.contains(pos) || comPos.contains(spielerPos)){
                System.out.println("Position besetzt. versuchen Sie bitte nochmal!");
                pos = new java.util.Scanner(System.in).nextInt();
            }*/
            Random rdm = new Random();
            int comPos = rdm.nextInt(9) + 1; //the AI can replace this line to inject pos
            /*while(spielerPos.contains(comPos) || spielerPos.contains(comPos)){
                comPos = rdm.nextInt(9) + 1;
            }*/
            caseDecision(board, pos, "human");
            caseDecision(board, comPos, "com");
            roundCount++;

        }
        crl.trackPositions();

    }

    /* evtl Vererbung/Polymorphie verwenden als Übungen!! */

}
