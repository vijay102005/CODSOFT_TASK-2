import java.util.Scanner;
public class grade_Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int numSubjects=sc.nextInt();
        int totalMarks=0;
        double averagePercentage;
        char grade;

        for(int i=1;i<=numSubjects;i++){
            System.out.println("Enter marks obtained in subject "+i+"(out of 100:) ");
            int marks=sc.nextInt();
            if(marks<0 || marks>100){
                System.out.println("Marks should be between 0 and 100. Please enter a valid mark.");
                i--;
            }
            else{
                totalMarks+=marks;
            }

        }
        averagePercentage=(double)totalMarks/numSubjects;
        if(averagePercentage>=90){
            grade='A';
        }
        else if(averagePercentage>=80){
            grade='B';
        }
        else if(averagePercentage>=70){
            grade='C';
        }
        else if (averagePercentage>=60){
            grade='D';
        }
        else{
            grade='F';
        }
        System.out.println("\nTotal Marks: "+totalMarks);
        System.out.println("Average Percentage: "+averagePercentage+"%");
        System.out.println("Grade: "+grade);
        
    }
}
