import java.util.Scanner;

public class AlarmTime {
    int hour, minuite;
    boolean[] repeat;
    boolean active;

    public AlarmTime(int hour, int minuite) {
        this.hour = hour;
        this.minuite = minuite;
    }

    public AlarmTime(int hour, int minuite, boolean[] repeat, boolean active) {
        this(hour, minuite);
        this.repeat = new boolean[7];
        this.repeat = repeat;
        this.active = active;
    }

    public boolean isActive(){
        if(this.active == true)
            return true;
        else
            return false;
    }

    public int getHour(){

    }

    public int getMinute(){

    }

    public boolean[] getRepeat(){

    }

    public void setAlarmTime(int h, int m, boolean[] repeat, boolean active) {
        AlarmTime(h, m, repeat, active);
        int a;
    }

    public static void main(String[] args) {
        int i;
        int hour, min;
        String[] inputday = new String[7];
        String[] day = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.print("pleas enter alarm repeat: ");//enter alarm repeat
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        AlarmTime[] alarm;//set alarm[]
        alarm = new AlarmTime[i];
        System.out.print("enter hour, minuite pleas: ");//set time
        hour = input.nextInt();
        min = input.nextInt();

        System.out.print("enter day of week Ex: Mon, Tue, Wed, Thu, Fri, Sat, Sun (end:");
        inputday[] = input.nextLine();

    }
}
