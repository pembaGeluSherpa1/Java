public class StudentMarks {
// static int numberOfStudent = 3;
static int i;
static int j;
public static void main(String[] args) {
        int Subjects[][] = {{91,80,81},
        {71,82,74},
        {71,82,74},
        {71,82,74},
        {71,82,74},
    };

    int[] total = new int[3];
    int[] average = new int[3];
    while(j<3){
    while(i<5){
        total[j]+=Subjects[i][j];
        i++;
    }
    j++;
    i=0;
    i++;
}

    for(int i=0;i<3;i++){
        average[i] = total[i]/3;
        System.out.println("Total marks of Student "+(i+1)+" = "+total[i]);

        System.out.println("Average Marks of Student "+(i+1)+" = "+average[i]);

        if(average[i]<80){
            System.out.println("Student " +(i+1)+ "is fail");
        }else{
            System.out.println("Student "+(i+1)+ "is pass");
        }
    }

    }
}
