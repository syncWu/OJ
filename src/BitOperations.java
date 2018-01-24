//summary some bit operation
public class BitOperations {
    //set Set nth bit to 1 or 0
    public int setNbit(int n,int x){
        return x | (1<<n);
    }
    //unset nth bit
    public int unSetNbit(int n,int x){
        return x & ~(1<<n);
    }
    //Toggle nth bit
    public int toggleNbit(int n,int x){
        return x ^ (1<<n);
    }
    //get the maximum integer
    public void maxInt(){
        int maxInt = ~(1<<31);
        //int maxInt = (1 << 31) - 1;
        //int maxInt = (1 << -1) - 1;
        //int maxInt = -1u >>1;
        System.out.println(maxInt);
    }
    //get the minimum integer
    public void minInt(){
        int minInt = 1 << 31;
        // int minInt = 1 << -1;
        System.out.println(minInt);
    }
    //get the maximum long
    public void maxLong(){
        System.out.println(((long)1<<127)-1);
    }
    //multi by 2
    public void multiByTwo(int n){
        System.out.println(n << 1);
    }
    //divide by 2
    public void divideByTwo(int n){
        System.out.println(n >> 1);
    }
    //multi by m^2
    public void multiByMTwo(int n,int m){
        System.out.println(n << m);
    }
    //divide by m^2
    public void divideByMTwo(int n,int m){
        System.out.println(n >> m);
    }
    //check equality
    public boolean isEqual(int a,int b){
        if((a^b) == 0)
            return true;
        return false;
    }
    //check a number is odd
    public boolean isOdd(int n){
        return (n & 1) == 1 ? true: false;
    }
    //swap two numbers
    public void swapTwo(int a,int b){
        a ^= b;
        b ^= a;
        a ^= b;
        //a = a ^ b ^(b = a)
        System.out.println(a);
    }
    //get the absolute value
    public int absoluteValue(int x){
        return x < 0 ? -x: x;
    }


    public static void main(String[] args) {
        BitOperations operation = new BitOperations();
        System.out.println(operation.isOdd(6));
        operation.swapTwo(2,3);
    }
}
