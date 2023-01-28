/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Result result;
    
    public UserInterface(Scanner scanner, Result result){
        this.scanner= scanner;
        this.result = result;
    }
    
    public void start(){
        readPoint();
        System.out.println("");
        printAverage();
        printAveragePassing();
        printPassingPercentage();
        printGradeDistribution();
    }
    
    public void readPoint(){
        System.out.println("Enter points totals.-1 stops: ");
        while(true){
            String input= scanner.nextLine();
            int points = Integer.valueOf(input);
            
            if(points == -1){
                break;
            }
            if(points<0 || points>100 ){
                continue;
            }
            this.result.addPoints(points);
        }
    }
    public void printAverage() {
        System.out.println("Point average (all): " + result.averageOfPointsAll());
    }
    
    public void printAveragePassing() {
        String nonePassing = "-";
        if (result.averageOfPassingPoints() == 0.00) {
            System.out.println("Point average (passing): " + nonePassing);
        } else {
            System.out.println("Point average (passing): " + result.averageOfPassingPoints());
        }
    }
    
    public void printPassingPercentage() {
        System.out.println("Pass percentage: " + result.passPercentage());    
    }
    
    public void printGradeDistribution() {

        System.out.println("Grade distribution:");
        int grade = 5;
        while (grade >= 0) {
            int stars = result.totalGradesFromPoints(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade--;
        }
    }
    
    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }    
}
