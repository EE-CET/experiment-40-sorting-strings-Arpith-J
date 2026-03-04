import java.util.Scanner;
import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read N
        // TODO: Handle the newline after N
        // TODO: Read N strings into an array
        // TODO: Sort the array (Arrays.sort uses lexicographical order by default)
        // TODO: Print the sorted strings, one per line
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
