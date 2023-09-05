
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
        
        //Read Assignment
        System.out.println ("Enter your assignment name: ");
        String assignmentName = sc.nextLine();
        
        //Display assignment name
        System.out.println ("Your assignment name is "+assignmentName);
        
    }
}
