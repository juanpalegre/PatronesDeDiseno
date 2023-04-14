public class Main {

    public static void main(String[] args) {

        EventLogger eventLogger = EventLogger.getInstance();

        eventLogger.logEvent("Primer log");
        eventLogger.logEvent("Segundo log");
        eventLogger.logEvent("Tercer log");
        eventLogger.logEvent("Cuarto log");

        System.out.println(eventLogger.getLogEvents());

    }

}
