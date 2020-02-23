
import java.util.Scanner;

public class deleteValueInArray {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int[] Array = {1,2,4,5,6,7,8,9,10};
        System.out.println("Nhap phan tu can xoa: ");
        int x = input.nextInt();
        for (int i = 0; i < Array.length; i++){
            if (x == Array[i]){
                Array[i] = Array[i + 1];
                i++;
            }
            System.out.println(Array[i]);
        }
    }
}
