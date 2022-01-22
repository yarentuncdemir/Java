package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        Scanner inputs = new Scanner(System.in);
        System.out.println("How many gamer?");
        int gamer= inputs.nextInt();

        for(int i=0;i<gamer;i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Gamer Name");
            String name= input.next();
            System.out.println("Score");
            int score= input.nextInt();
            System.out.println("levelCompleted");
            int levelCompleted= input.nextInt();
            System.out.println("Bonus");
            int bonus= input.nextInt();

            int highScore= calculateScore(gameOver, score, levelCompleted, bonus);
            int calculatedScore=calculateHighScore(highScore);
            displayHighScore(name,calculatedScore);
        }

    }
    public static int calculateHighScore(int playerScore){
        if (playerScore>=10000){
            return 1;
        }
        else if (playerScore>=5000) {
            return 2;

        }
        else
            return 3;


    }

    public static void displayHighScore(String playerName,int highScorePos){
        System.out.println(playerName + " " + "managed to get into position" + highScorePos);

    }
    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;

    }
}
