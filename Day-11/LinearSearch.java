public class LinearSearch {
    public static int linearSearch(int element[],int key){
        
        for(int i=0;i<element.length;i++){
            if(element[i] == key){
               return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int element[] = {2,4,6,8,10,12,14,16};
        int key =10;

        int index = linearSearch(element, key);
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("key is at index " +index);
        }
    }
    
}
