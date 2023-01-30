package OPP_projects.HW7.src.notes.loggers;

import java.util.Date;

public class ConsoleLogger implements Loggable {

    @Override
    public void saveLog(String message) {
        System.out.println(new Date() + ": " + message);
    }
}
