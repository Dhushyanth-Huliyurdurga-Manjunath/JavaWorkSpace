import java.util.Calendar;
import java.util.Date;
class CurrentCalendar{
    public void getCalendarDetails(){
        String calendarType = Calendar.getInstance().getCalendarType();
        System.out.println("Current Calendar type: "+calendarType);
    }
}
class CurrentTime extends CurrentCalendar{
    public void getCalendarDetails(){
        final Date time = Calendar.getInstance().getTime();
        System.out.println("Current time: "+time);
    }
}
class CurrentHashCode extends CurrentCalendar{
    public void getCalendarDetails(){
        final int hashCode = Calendar.getInstance().hashCode();
        System.out.println("HashCode for the current calendar: "+hashCode);
    }
}
public class Polymorphism {
    public static void main(String[] args){
        CurrentCalendar calendar = new CurrentCalendar();
        CurrentTime time = new CurrentTime();
        CurrentHashCode hash = new CurrentHashCode();

        calendar.getCalendarDetails();
        time.getCalendarDetails();
        hash.getCalendarDetails();
    }
}
