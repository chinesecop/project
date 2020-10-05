public class OutputChar {
    private static OutputChar instance;

    private OutputChar() {
    }

    public static OutputChar getInstance() {
        if (instance == null) {        //если объект еще не создан
            instance = new OutputChar();    //создать новый объект
        }
        return instance;        // вернуть ранее созданный объект
    }

    private volatile char ch = 'A'; // volatile, чтобы не помещать в кэш (всегда будет читаться)

    public void outputA() {
        synchronized (OutputChar.getInstance()) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (ch != 'A') {
                        OutputChar.getInstance().wait(); // переводит вызывающий поток в состояние ожидания, пока не вызовут notify()
                    }
                    System.out.print("A");
                    ch = 'B';
                    OutputChar.getInstance().notifyAll(); // возобновляет работу всех потоков, у которых ранее был вызван метод wait()
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void outputB() {
        synchronized (OutputChar.getInstance()) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (ch != 'B') {
                        OutputChar.getInstance().wait();
                    }
                    System.out.print("B");
                    ch = 'C';
                    OutputChar.getInstance().notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void outputC() {
        synchronized (OutputChar.getInstance()) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (ch != 'C') {
                        OutputChar.getInstance().wait();
                    }
                    System.out.print("C");
                    ch = 'A';
                    OutputChar.getInstance().notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}