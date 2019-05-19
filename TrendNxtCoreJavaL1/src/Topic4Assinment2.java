import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Simple demo that uses java.util.Timer to schedule a task 
 * to execute once 5 seconds have passed.
 */
class SayHello extends TimerTask {
    public void run() {
    	Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println( sdf.format(cal.getTime()) );
    }
}
public class Topic4Assinment2 {
    Timer timer;

    public Topic4Assinment2(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
	}

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("Program quits!");            
            System.exit(0);
        }
    }
   


    public static void main(String args[]) {
    	Timer timer = new Timer();
    	timer.schedule(new SayHello(), 0, 2000);
        new Topic4Assinment2(20);
        
    }
}