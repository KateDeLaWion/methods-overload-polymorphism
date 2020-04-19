class Polymorphism {
    public static void main(String args[]) {
        Multiply m = new Multiply();
        m.mul(6, 10);
        m.mul(10, 6, 5);
    }
}



class Multiply {
    void mul(int a, int b) {
        System.out.println("Multiply of two=" + (a * b));
    }

    void mul(int a, int b, int c) {
        System.out.println("Multiply of three=" + (a * b * c));
    }
}



