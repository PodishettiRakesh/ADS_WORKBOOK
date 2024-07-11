// public class Demo
//  {

//     public int FibanacciNumber(int n){
//         // int first=0;
//         // int second=1;

//         // if(n==0){
//         //     return first;
//         // }else if(n==1){
//         //     return second;
//         // }else{
//         //     while(n>2){
//         //         int next=first+second;
//         //         first=second;
//         //         second=next;
//         //         n--;
//         //     }
//         //     return second;
//         // }

//         if(n<=1){
//             return n;
//         }else{
//             return FibanacciNumber(n-1)+FibanacciNumber(n-2);
//         }
//     }
    

//     public static void main(String[] args) {
//         Demo
//          obj=new Demo
//         ();
//         int number=obj.FibanacciNumber(6);
//         System.out.println(number);
//     }
    
// }

// public class Demo{
//     public String reverseString(String name){
//         if(name.isEmpty()){
//             return name;
//         }else{
//             return reverseString(name.substring(1))+name.charAt(0);
//         }
//     }

//     public static void main(String[] args) {
//         Demo obj = new Demo();
//         System.out.println(obj.reverseString("rakesh"));
//     }
// }



// Task: Write a recursive Java function that determines if a string is a palindrome.
// public class Demo{
//     public String reverseString(String name){
//         if(name.isEmpty()){
//             return name;
//         }else{
//             return reverseString(name.substring(1))+name.charAt(0);
//         }
//     }

//     public Boolean isPalindrone(String s){
//         if(s.equalsIgnoreCase(reverseString(s))){
//             return true;
//         }else{
//             return false;
//         }
//     } 
//     public static void main(String[] args) {
//         Demo obj = new Demo();
//         System.out.println(obj.isPalindrone("rakesh"));
//         System.out.println(obj.isPalindrone("amma"));
//     }
// }