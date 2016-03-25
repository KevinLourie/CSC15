class test2 {
   public static void main(String[] args){
   // dash values are 1 to 40
// print 40 times: -
for(int dash =1; dash <=40; dash++)
{
System.out.print("-");
}
System.out.println();

// i values are 1 to 10
// print 10 times: _-^-; 
for(int i = 1; i <=10; i++)
{
System.out.print("_-^-");
}
System.out.println();

// i values are 1 to 2
// print 2 times: 1 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9
for(int i =1; i<=2; i++)
{
System.out.print("00");
// j values are 1 to 9
// print 9 times: print: j j
// print: 1 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9 
for(int j =1; j<=9; j++)
{
// k values are 1 to 2
// print 2 times: j
// print: j j
for(int k =1; k<=2;k++)
{
System.out.print(j);
}

}

System.out.print("00");
}

System.out.println();
for(int dash =1; dash <=40; dash++)
{
System.out.print("-");
}
}
}