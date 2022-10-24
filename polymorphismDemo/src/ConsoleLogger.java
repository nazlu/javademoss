public class ConsoleLogger extends BaseLogger{
    public void log(String mesagge) {
        System.out.println("Logged to console : " + mesagge);
    }
}
