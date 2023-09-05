
/**
 * Write a description of class AssessmentStatistics here.
 *
 * @author (Roman Dulal)
 * @student Id (24227472)
 * @version (02/09/23)
 */

import java.util.*;
public class AssessmentStatistics
{
    
    public AssessmentStatistics()
    {
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float[] markList = new float [30];
        
        //Read Assignment
        System.out.println ("Enter your assignment name: ");
        String assignmentName = sc.nextLine();
        
        //Input 30 different marks
        for (int counter=0; counter<30; counter++){
            System.out.println ("Enter marks for student "+(counter+1));
            float mark = sc.nextFloat();
            
            if (isValidMark(mark)){
                markList[counter]=mark;
            }
            else {
                System.out.println ("Invalid mark. Please enter a valid mark between 0 and 30. ");
                counter--;
            }
        }
        
        //Display assignment name & Students' mark
        System.out.println ("Your assignment name is "+assignmentName);
        System.out.println ("Students' Mark: "+Arrays.toString(markList));
        
        //Find highest and lowest mark
        float highestMark = 0;
        float lowestMark = 30;

        for (float mark : markList) {
            if (mark > highestMark) {
                highestMark = mark;
            } 
            else if (mark < lowestMark) {
                lowestMark = mark;
            }
        }
        
        System.out.println ("The highest mark is "+ highestMark);
        System.out.println ("The lowest mark is "+ lowestMark);
        
        //Find Mean and Standard Deviation
        float totalMark = 0;
        float numberOfMarks = markList.length;
        
        for (float mark: markList) {
            totalMark = totalMark + mark;
        }
        
        float mean = totalMark / numberOfMarks;
        System.out.println ("Mean: "+ mean);
    }
    
    //Function to check the valid marks between 0 & 30.
    public static boolean isValidMark(float mark) {
        return mark >= 0 && mark <= 30;
    }
}
