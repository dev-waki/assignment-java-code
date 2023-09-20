import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter student number:");
        int empNo=scanner.nextInt();
        System.out.print("enter your name:");
        String studentName=scanner.next();
        System.out.print("enter your marks for sub 1 :");
        int sub1=scanner.nextInt();

        System.out.print("enter your marks for sub 2:");
        int sub2=scanner.nextInt();
        System.out.print("enter your marks for sub 3 :");
        int sub3=scanner.nextInt();
        System.out.print("enter your marks for sub 4:");
        int sub4=scanner.nextInt();
        System.out.print("enter your marks for sub 5:");
        int sub5=scanner.nextInt();

        int total=sub1+sub2+sub3+sub4+sub5;





        System.out.println("\t \t \t\twelcome to student marks list application");

        System.out.print("sn.NO :\t\tSTUDENT NAME:\t\tSUB1:\t\tSUB2:\t\tSUB3:\t\tSUB4:\t\tSUB5:\t\tTOTAL : ");
        System.out.println();
        System.out.print("\t"+empNo+"\t\t\t"+studentName+"\t\t\t"+sub1+"\t\t\t"+sub2+"\t\t\t"+sub3 +"\t\t\t"+sub4+"\t\t\t"+sub5+"\t\t\t"+total +" ");
        System.out.println();

        System.out.println("--------------------------------------------------------------------------------------------------------------");

    }
}