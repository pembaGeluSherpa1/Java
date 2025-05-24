package Exception;

public class Try {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        try{
            a[3]=5;
            System.out.println(a[3]);
        }catch(Exception e){
            System.out.println("array  overflow");
        }finally{
            System.out.println("Adding value in an array");
        }
    }
}
