import java.io.*;
class base 
{
base() {
System.out.println("base class constructor called");
}}

class derived extends base{
derived(){
int a;
System.out.println("derived class constructor called");
}}
class constructor{
public static void main(String args[]) {
derived d = new derived(12);
}
}

