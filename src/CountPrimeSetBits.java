//Given two integers L and R, find the count of numbers in the range
// [L, R] (inclusive) having a prime number of set bits in their binary representatio
public class CountPrimeSetBits {
    public int countPrimeSetBits(int L,int R){
        int ans = 0;
        for (int x = L;x <= R; ++x){
            if (isSmallPrime(Integer.bitCount(x))){
                ans++;
            }
        }
        return ans;
    }
    public boolean isSmallPrime(int x){
        return ( x == 2 || x == 3 || x == 5 || x == 7 || x == 11 || x == 13
                || x == 17 || x == 19 );
    }
    public static void main(String[] args) {

    }
}
