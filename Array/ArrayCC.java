

public class ArrayCC {

    // public static void main(String[] args) {
    //     System.out.println("Hiii");
    //     int marks[] = new int[50];
    //     int numbers[] = {1,2,3};
    //     String fruits[] = {"apple","mango"};
    // }
public static void update(int marks[],int nonchangable) {
    nonchangable = 19;
    for (int i = 0; i < marks.length; i++) {
        marks[i] = marks[i]+1;
    }
}
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int nonchangable = 5;
        update(marks,nonchangable);
System.out.println(nonchangable);
        // print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}