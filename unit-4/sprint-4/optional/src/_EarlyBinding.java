public class _EarlyBinding {
    static class Dog11{
        private void eat(){
            System.out.println("dog is eating...");
        }

        public static void main(String[] args) {
            Dog11 d1= new Dog11();
            d1.eat();
        }

    }
}
