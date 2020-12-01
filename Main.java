package com.henrychris;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        int counter, courseCount;
        int topGPA, bottomGPA, GPA; // GPA Formula 

        System.out.print("How many courses this semester? ");
        courseCount = input.nextInt(); // Asks for number of courses

        String[] Courses = new String[courseCount]; // initialize the array
        int[] CourseUnits = new int[courseCount];
        String[] CourseGrades = new String[courseCount];
        // int[] CourseGrades2 = new int[courseCount];

        System.out.print("Input the courses: \n");
        for (counter = 0; counter < courseCount; counter++) {
            System.out.printf("%d. ", counter + 1);
            Courses[counter] = input.next(); // Gets course data and adds to array
        }

        System.out.println();

        System.out.print("Input the respective units: \n");
        for (counter = 0; counter < courseCount; counter++) {
            System.out.print(Courses[counter] + ": ");
            CourseUnits[counter] = input.nextInt(); // Gets course unit data and adds to array
        }
        System.out.println();

        System.out.print("Input the course grades: \n");
        for (counter = 0; counter < courseCount; counter++) {
            System.out.print(Courses[counter] + ": "); // this prints out nicely, so user can remember courses input
            CourseGrades[counter] = input.next(); // Gets grade data and adds to array

        }

        System.out.println("    YOUR INPUT"); // prints data in tabular format
        System.out.print("Course \t Unit \t Grade \n");
        for (counter = 0; counter < courseCount; counter++) {
            System.out.printf(" %s       %s       %s \n", Courses[counter], CourseUnits[counter], CourseGrades[counter]);
        }

        //sumArray(CourseUnits);
        topGPA = sumGradeArray(CourseUnits, CourseGrades);
        bottomGPA = sumArray(CourseUnits);
        GPA = topGPA/bottomGPA; // should calculate GPA

        System.out.printf("Your GPA is: %d", GPA);



    }

    static int sumArray(int[] x) {
        int counter, total = 0;
        // (sum of (unit*GP))/total units
        for (counter = 0; counter < x.length; counter++) {
            total += x[counter];
        }
        System.out.println(total);

        return 0;
    }
//
    static int sumGradeArray(int[] y, String[] x) { // should sum up the values of the unit and grades product
        int total = 0;
        for (int counter = 0; counter < x.length; counter++) {

            if (x[counter].equalsIgnoreCase("A")) { // if x variable equals that grade
                total += y[counter] * 5;
            } else if (x[counter].equalsIgnoreCase("B")) {
                total += y[counter] * 4;
            } else if (x[counter].equalsIgnoreCase("C")) {
                total += y[counter] * 3;
            } else if (x[counter].equalsIgnoreCase("D")) {
                total += y[counter] * 2;
            } else if (x[counter].equalsIgnoreCase("E")) {
                total += y[counter];
            } else if (x[counter].equalsIgnoreCase("F")) {
                total += 0;
            }
        }
        return total;
    } // SumStringArray
}
