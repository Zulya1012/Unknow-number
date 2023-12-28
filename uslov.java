import java.util.Scanner;
public class uslov {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Input number: ");
int a = sc.nextInt();
if(a > 2 && a < 9){
System.out.println("Number more 2 and less 9");
}
else{
System.out.println("Unknow number");
}
    
}
}