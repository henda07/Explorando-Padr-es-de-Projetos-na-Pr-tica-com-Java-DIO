package one.digitalinnovation.gof;

public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonEager();
    }

    private SingletonLazyHolder () {
        super();
    }

    public static SingletonLazyHolder getInstancia() {

        return instancia1
    }
}