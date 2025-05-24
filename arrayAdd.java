public class arrayAdd {
    public static void main(String[] args) {
        int[] a = { 1,2 };
        int[] b = { 3,4,0,3 };
        System.out.print("Sum of array: ");
        for(int i = 0; i < Max(a, b).length; i++)System.out.print(Add(a, b)[i]+" ");
    }

    static int[] Max(int[] a, int[] b){
        if(a.length > b.length)return a;
        else return b;
    }

    static int[] Min(int[] a, int[] b){
        if(a.length < b.length)return a;
        else return b;
    }

    static int[] Add(int[] a, int[] b) {
            int[] sum = Max(a, b);
            for (int i = 0; i < Min(a, b).length; i++) {
                sum[i] = a[i] + b[i];
            }
            return sum;
    }
}
