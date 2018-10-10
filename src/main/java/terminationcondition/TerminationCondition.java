package terminationcondition;


public class TerminationCondition {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank(3);
        Tank tank3 = new Tank(5);
        // Proper cleanup: empty tank before going home
        tank2.empty();
        // Drop the reference, forget to cleanup:
        new Tank(6);
        System.out.println("Check tanks:");
        System.out.println("tank1: ");
        tank1.sayHowFull();
        System.out.println("tank2: ");
        tank2.sayHowFull();
        System.out.println("tank3: ");
        tank3.sayHowFull();
        System.out.println("first forced gc():");
        System.gc();
        // Force finalization on exit but using method
        // deprecated since JDK 1.1:
        System.out.println("try deprecated runFinalizersOnExit(true):");
        System.runFinalizersOnExit(true);
        System.out.println("last forced gc():");
        System.gc();
    }
}

