package Exception;

public class Main {
    public static void main(String[] args) {
        try{
        ageCalculate(101);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void ageCalculate(int a) throws AlreadyDied, NotYetBorn{
        if(a<0){
            throw new NotYetBorn();
        }

        if(a>100){
            throw new AlreadyDied();
        }
    }
}
