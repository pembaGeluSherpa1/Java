import java.util.Scanner;
public class ClassManagement {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        input();
    }

    static void input(){
        System.out.println("Enter Marks of a student:");
        System.out.println("Math:");
        float Math = x.nextFloat();
        System.out.println("Social:");
        float Social = x.nextFloat();
        System.out.println("Science:");
        float Science = x.nextFloat();
        System.out.println("English:");
        float English = x.nextFloat();
        totalMarks(Math, Social, Science, English);
        percentage(Math, Social, Science, English);
        passFail(Math, Social, Science, English);
    }
    static void totalMarks(float a,float b,float c,float d){
        System.out.println("Total Marks: "+(a+b+c+d));
    }


    static void percentage(float a,float b,float c,float d){
        float percentage = ((a+b+c+d)/400)*100;
        System.out.println("Percentage: "+ percentage + "%");
        if(percentage>90 && percentage<100){
            System.out.println("Distinction");
        }else if(percentage>80 && percentage<90){
            System.out.println("1st Division");
        }else if(percentage>70 && percentage<80){
            System.out.println("2nd Division");
        }else if(percentage>60 && percentage<70){
            System.out.println("3rd Division");
        }else if (percentage>40 && percentage<60){
            System.out.println("4th Division");
        }
        else{
            System.out.println("failed");
        }
    }


    static void passFail(float a,float b,float c,float d){
        // System.out.println("Total Marks: "+(a+b+c+d));
        if(a<=100 && a>=40 && b<=100 && b>=40 && c<=100 && c>=40 && d<=100 && d>=40 ){
            System.out.println("Student passed the Exam");
        }else{
            System.out.println("Student failed the exam");
        }
        }
}