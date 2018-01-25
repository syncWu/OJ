public class FindPrime{
    public static boolean isPrime(int num){
        if(num > 2 && num % 2 == 0){
            System.out.println(num + "is not prime");
            return false;
        }
        //just should to manipulte  (int)Math.sqrt(num) + 1
        int top = (int)Math.sqrt(num) + 1;
        for (int i = 3; i < top; i++) {
            if(num % i == 0){
                System.out.println(num + "is not prime");
                return false;
            }
        }
        System.out.println(num + "is prime");
        return true;
    }
}