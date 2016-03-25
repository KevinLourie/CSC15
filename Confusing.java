public class Confusing {

// prints out this twice: <tab>This is CSC 15.<newline> 
// prints out this twice: “\<tab>Hello World”<tab>/”<tab><newline>
public static void main(String[] args) {

// prints this twice: <tab>This is CSC 15.<newline>
method3();

// prints this twice: “\<tab>Hello World”<tab>/”<tab><newline>
method2();

}

// prints out this twice: “\<tab>Hello World”<tab>/”<tab><newline>
public static void method2() {
// i values are 1, 2
for(int i = 1; i <=2; i++) {
 System.out.print("\"\\\tHello World\"\t/\"\t\n");
 method1();
}
}

// prints out this twice: <tab>This is CSC 15.<newline>
public static void method3() {
// j values are 2, 1
for(int j =2; j > 0; j--) {
 System.out.println("\tThis is CSC 15.");
 method2();
}
}

// does nothing
public static void method1() {
// loop never executes
for(int i =0; i > 0; i--) {
System.out.println("Spring 2016.");
}
}
}
