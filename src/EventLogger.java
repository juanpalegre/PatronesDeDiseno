import java.util.ArrayList;
import java.util.List;

public class EventLogger {

    private static EventLogger instance; // Instancia única de la clase
    private List<String> logEvents; // Lista para almacenar los eventos

    private EventLogger() {
        logEvents = new ArrayList<>();
    }

    // Método estático para obtener la instancia única de la clase
    public static EventLogger getInstance() {
        if (instance == null) {
            instance = new EventLogger();
        }
        return instance;
    }

    // Método para agregar un evento al registro
    public void logEvent(String event) {
        logEvents.add(event);
    }

    // Método para obtener todos los eventos registrados
    public List<String> getLogEvents() {
        return logEvents;
    }
}
