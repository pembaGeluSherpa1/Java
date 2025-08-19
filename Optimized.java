public class Optimized {
    public static void main(String[] args) {
        int[] salaries = {40000, 60000, 85000, 30000};
        int[] experience = {2, 5, 10, 0};
        int[] bonuses = new int[4];

        for(int i=0;i<salaries.length;i++){
            if(experience[i]>5) bonuses[i] = (int) (salaries[i]*0.10);
            else if(experience[i]>2) bonuses[i] = (int) (salaries[i]*0.05);
            else bonuses[i] = 1000;
            System.out.println("Employee " + (i + 1) + " Bonus: $" + bonuses[i]);
        }
    }
        
}
