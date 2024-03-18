package constructordemo;

class first {
    int x = 90;

    public first() {
        System.out.println("default constructor");

    }

    public first(int jk) {
        this.x = jk;
        System.out.println(x);
    }
}
class second{}
class third{}
public class ConstructorDemo
{
    public static void main(String[] args) {

    first firstobj=new first();
    first secondobj=new first(45);



}}
