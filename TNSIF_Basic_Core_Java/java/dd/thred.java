class Thred { 
    static class A extends Thread { 
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.println("Hello");
            }
        }
    }
    static class B extends Thread { 
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.println("Bye");
            }
        }
    }
    public static void main(String args[]) {
        A st = new A(); // Create object of A
        B dt = new B(); // Create object of B

        st.start(); // Start thread A
        dt.start(); // Start thread B
    }
}
