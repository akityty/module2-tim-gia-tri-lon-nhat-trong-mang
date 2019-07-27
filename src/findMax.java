import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter the size");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        int list[] = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Input value of list[" + i + "]");
            list[i] = scanner.nextInt();
        }
        System.out.println("the list:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
        int max = list[0];
        int positionMax = 0;
        for (int i = 1; i<list.length;i++){
            if(max < list[i]){
                max = list[i];
                positionMax = i;
            }
        }
        System.out.println("max is: "+max+" at position "+positionMax);
    }
}
