public class Ascending {

    static int[] secondSmallLargest(int a[]){
        
        int temp = 0;
        for(int i = 0; i< a.length; i++){
            for(int j=0; j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        int arraySize = a.length-1; 
        int[] b = {a[1],a[arraySize-1]};
        return b;
    }

    static int[] smallestLargest(int[] a){

        int arraySize = a.length-1; 
        int max = a[0];
        int min = a[0];

        for(int i= 0;i<arraySize;i++){
            if(max<a[i])max=a[i];
            if(min>a[i])min=a[i];
        }

        System.out.println("largest number: "+max);
        System.out.println("Smallest number: "+min);
        int[] b = {min,max};
        return b;
    }
    
    public static void main(String[] args) {
        int[] a={4,11,5,13,23,1,7};
        int[] b = smallestLargest(a);
        int[] c = secondSmallLargest(a);


        int sum =0;
        for(int i=0;i<b.length;i++){
            sum+=b[i];
        }
        System.out.println("Sum of the smallest and the largest Number: "+sum);


        int secondSum = 0;
        for(int i=0;i<c.length;i++){
            secondSum+=c[i];
        }
        System.out.println("Sum of the second smallest and the second largest Number: "+secondSum);

    }
}