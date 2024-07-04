public class ClearLast_ithBit {
    public static int clearLastIthBit(int n, int i){
        int BitMask = (~0)<<i;
        return n & BitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIthBit(15, 2));
    }
}
