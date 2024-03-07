package ejemplo4;

public interface In4 {
    // Here other comentary new

        final int a = 10;
        static void display() {
            System.out.println("hello");
        }
    }

    class TestClass implements In4 {
        public static void main (String[] args){
            In4.display();
        }
    }

