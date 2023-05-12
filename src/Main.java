import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> numbers=new LinkedList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        
        
        int[] res= new int[10];
        for (int i = 0; i < res.length; i++) {
            res[i]=random.nextInt(2);
            
        }
        

        for (int i = 0; i < 10; i++) {
           integers.add(random.nextInt(0,2));}

        for (int j = 0; j < 10; j++) {
                numbers.add(random.nextInt(0,2));
            }
        System.out.println(sort(integers));
        System.out.println(sort(numbers));
        System.out.println(Arrays.toString(sort(res)));


    }

    public static ArrayList<Integer> sort(ArrayList<Integer>integers){
        Collections.sort(integers);
        return integers;
    }
    public static LinkedList<Integer> sort(LinkedList<Integer>sor){
        Collections.sort(sor);
       return sor ;
    }
    public static int[]sort(int[] arr){
        int k = 0;
        for (int i = 1; i <arr.length ; i++) {
            int swap = arr[i];
            for (int j = i; j>0&&swap<arr[j-1]  ; j--) {
                arr[j]=arr[j-1];
            }
            arr[k]=swap;
            
        }
        return arr;
    }


}