public class Scope {
public static void main(String[] rags) {
int num1 = 10;
int num2 = 50;
mystery();
num1++;
num1 = num1 *2;
System.out.println(num1 + " " + num2);
}
 
public static void mystery() {
int num1 = 12;
int num2 = 15;
num1 = num1 + num2;
num2 = num2* 4;
System.out.println(num2 + " " + num1);
}
} 
