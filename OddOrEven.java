//find even or odd//
import java.util.Scanner;
public class OddOrEven{
public static void main(String args[]){
int x;
System.out.println("Enter an integer to check if its odd or even");
Scanner in=new Scanner(System.in);
x=in.nextint();
if(x%2==0){
System.out.println("the number is even.");
}
else{
System.out.println("the number is odd.");
}}