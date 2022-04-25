import java.io.*;
class Base 
{
Base() {
System.out.println("base class Constructor called");
}}
class Derived extends Base{
int a;
Derived(int a) {
this.a=a;
System.out.println("derived class Constructor called");
System.out.println("a="+a);
}}
class Constructor{
public static void main(String args[]) 
{
Derived d = new Derived(1);
}}
