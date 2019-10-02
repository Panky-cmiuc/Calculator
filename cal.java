import java.util.Scanner;
class cal{
public static void main(String ar[]){
functions ob=new functions(); 
Scanner sc=new Scanner(System.in);
System.out.println("1->add\n2->sub\n3->mul\n4->div");
int x=sc.nextInt();
System.out.println("Enter value 1:");
int a=sc.nextInt();
System.out.println("Enter value 2:");
int b=sc.nextInt();
if(x==1){
    ob.add(a, b);
}
else if(x==2){
    ob.sub(a, b);
}
else if(x==3){
    ob.mul(a, b);
}
sc.close();
}
}
class functions{
    void add(int x, int y){
        System.out.println("addition = "+(x+y));
    }
    void sub(int x, int y){
        System.out.println("subtraction = "+(x-y));
    }
    void mul(int x, int y){
        System.out.println("multiplication = "+(x*y));
    }
}