public class UpdateIthBit {
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }
    public static int updateIthBit(int n,int i,int newBit){
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
