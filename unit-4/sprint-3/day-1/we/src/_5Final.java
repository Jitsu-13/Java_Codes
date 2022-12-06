public class _5Final {

    public static void main(String[] args) {
        final int x=10;

    }
}
class Abc{
    final void hi(){
        System.out.println("hi");
    }
}
class Bcd extends Abc{
//    @Override
//    void hi(){  // if a method is final it cannot be overwritten

}
abstract class X{
    // illegal combination of modifiers ; abstract and final
    //    final abstract void hello();
    //final:can't override;
    // abstract - must override
}
