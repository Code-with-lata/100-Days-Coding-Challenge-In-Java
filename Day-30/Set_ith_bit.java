public class Set_ith_bit {
    public static int setIthBit(int num, int i){
        int bitmask = (1<<i);
        return (num | bitmask);
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }
}
