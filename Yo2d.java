public class Yo2d {
    public static void main(String[] args) {
        int[] array = {2,3,4,1,5,6};
        for(int i=0;i<array.length;i++){
             for(int j=0;j<array.length;j++){ 
                System.out.print(yo2D(array)[i][j]+" ");
             }
             System.out.println();
            }
    }

    static int[][] yo2D(int[] a){
        int[][] array = new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                array[i][j]= a[i]*(j+1);
            }
        }
        return array;
    }

}
