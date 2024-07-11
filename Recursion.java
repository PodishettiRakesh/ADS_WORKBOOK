public class Recursion {

    public int FibanacciNumber(int n){
        int first=0;
        int second=1;

        if(n==0){
            return first;
        }else if(n==1){
            return second;
        }else{
            while(n>2){
                int next=first+second;
                first=second;
                second=next;
                n--;
            }
            return second;
        }
    }

    public static void main(String[] args) {
        Recursion obj=new Recursion();
        int number=obj.FibanacciNumber(7);
        System.out.println(number);
    }
    
}
