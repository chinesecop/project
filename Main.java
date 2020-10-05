public class Main {
    public static void main(String[] args) {
        OutputChar t = OutputChar.getInstance();
        new Thread(t::outputA).start();
        new Thread(t::outputB).start(); 
        new Thread(t::outputC).start();
    }
}
