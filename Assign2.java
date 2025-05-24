class Assign2 {
    static byte rollNo = 101;
    static short symbolNo = 1250;
    static int serialNo = 1234567890;
    static long mobileNo = 9808008971l;
    static float heightOfStudent = 5.6f;
    static double weightOfStudent = 65.21;
    static boolean studentPresent = true;
    static char section = 'A';

    public static void main() {
        System.out.println("Student data");
        printStatement();

        updatedAttendance();
        printStatement();

        updatedHeight();
        printStatement();

        updatedRollNo();
        printStatement();
        // updatedAttendance(studentPresent);
    }

    static void printStatement() {
        System.out.println("The 1st Roll no. = " + rollNo);
        // System.out.println("The Updated Roll no. =" + updatedRollNo(rollNo));

        System.out.println("The student symbol no. = " + symbolNo);

        System.out.println("The student serial no. = " + serialNo);

        System.out.println("The student mobile no. = " + mobileNo);

        System.out.println("The Height of student = " + heightOfStudent + " Feet");
        // System.out.println("The Updated Height = " + updatedHeight(heightOfStudent)
        // +"Feet");

        System.out.println("The weight of student = " + weightOfStudent + " Kg");

        System.out.println("Is student present = " + studentPresent);
        // System.out.println("Updated =" + updatedAttendance(studentPresent));

        System.out.println("The section = " + section);

    }

    static void updatedRollNo() {
        rollNo = 12;
    }

    static void updatedHeight() {
        heightOfStudent = 5.5f;
    }

    static void updatedAttendance() {
        studentPresent = false;
    }
}