// package Wrapper;

// public class Wrapper {
//     public static void main(String[] args) {
//         double num = 10.0901;
//         Double wrappedNum = Double.valueOf(num); // value of returns the object
//         Double autoWrappedNum = num;

//         double unwrappedNum = wrappedNum.intValue(); // convert the value to int 

//         System.out.println("Wrapped: " + wrappedNum);
//         System.out.println("Unwrapped: " + unwrappedNum);

//         String a= Double.toString(num); // converts the value to the string
//         System.out.println("String: "+a);

//         Double sTod = Double.parseDouble(a); // string to double
//         System.out.println("Double: "+sTod); 

//         Double d1 = 1221.21;
//         Double d2 = 1221.12;

//         if(d1.equals(d2)){
//             Boolean t= true;
//             System.out.println(t);
//         }else{
//             Boolean f= false;
//             System.out.println(t);
//         }

//     }
// }


package Wrapper;

public class Wrapper {
    public static void main(String[] args) {
        double num = 10.0901;
        Double wrappedNum = Double.valueOf(num); // valueOf returns the object
        Double autoWrappedNum = num; // Autoboxing

        int unwrappedNum = wrappedNum.intValue(); // convert the value to int 

        System.out.println("Wrapped: " + wrappedNum);
        System.out.println("Unwrapped: " + unwrappedNum);

        String a = wrappedNum.toString(); // Convert value to String
        System.out.println("String: " + a);

        double sTod = Double.parseDouble(a); // Convert String to double
        System.out.println("Double: " + sTod); 

        Double d2 = 1221.41;
        Double d1 = 1221.31;

        // if(d1.equals(d2)){
        //     Boolean t = true;
        //     System.out.println(t);
        // } else {
        //     Boolean f = false;
        //     System.out.println(f);
        // }

        System.out.println(d1.equals(d2)); // returns if it is equal true otherwise false

        // Compare to , if d1 is greater then the d2 it returns 1, if d2 is greater then it returns -1 and if they are equal it returns 0
        System.out.println(d1.compareTo(d2));

        Long lv = d1.longValue();
        System.out.println(lv);
        
        double dd=lv.doubleValue();
        System.out.println(dd);
    }
}