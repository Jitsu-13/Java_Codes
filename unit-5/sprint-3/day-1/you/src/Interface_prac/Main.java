package Interface_prac;

public  class Main implements Intr {

    @Override
    public void funX() {

    }

    @Override
    public void funY() {

    }

    public static void main(String[] args) {

        IntrImpl i1=new IntrImpl();
        Intr.fun1();
        i1.funX();

    }


}
