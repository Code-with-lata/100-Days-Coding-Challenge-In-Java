public class FindLargestString {
    public static void findLargestString(String fruits[]){
        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        findLargestString(fruits);
    }
    
}
