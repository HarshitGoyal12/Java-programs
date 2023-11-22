/**
 * ShowCurrent_time
 */
public class ShowCurrent_time {

    public static void main(String[] args) {
        long totalMillisseconds = System.currentTimeMillis()+(5*60+30)*60*1000;
        long totalSeconds=totalMillisseconds/1000;
        long currentSecond=totalSeconds%60;
        long totalMinutes=totalSeconds/60;
        long currentMinute=totalMinutes%60;
        long totalHours=totalMinutes/60;
        long currentHour=totalHours%24;

        System.out.println(currentHour +"hr :"+currentMinute +"min"+currentSecond +"sec");
    

        
    }
}