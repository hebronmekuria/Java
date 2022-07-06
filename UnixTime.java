import java.util.Scanner;
/**
 * This program returns the corresponding unixtime when it is given time in hours, minutes, seconds, days, months, years
 *
 * @author Hebron Mekuria 
 * @version February 8 2021
 */
public class UnixTime {
   
    public static void main(String[] args) {
      
      Scanner year;
      Scanner month;
      Scanner day;
      Scanner hour;
      Scanner minute;
      Scanner second;
      
      System.out.print("Enter the year in numerical form. For example, 2013: ");
      year = new Scanner(System.in);
      int year1=(year.nextInt());
      
      System.out.print("Enter the month in numerical form. For example, 02 for February, 11 for November: ");
      month = new Scanner(System.in);
      int month1=(month.nextInt());
      
      System.out.print("Enter the day in numerical form. For example, 24: ");
      day = new Scanner(System.in);
      int day1=(day.nextInt());
      
     
      System.out.print("Enter the hour in numerical form, please use the 24 hour format. For example, 5, 17: ");
      hour = new Scanner(System.in);
      int hour1=(hour.nextInt());
      
      System.out.print("Enter the minute in numerical form. For example, 45: ");
      minute = new Scanner(System.in);
      int minute1=(minute.nextInt());
      
      System.out.print("Enter the second in numerical form. For example, 20: ");
      second = new Scanner(System.in);
      int second1=(second.nextInt());
      
      int Unixtimez=(hour1*3600)+(minute1*60)+second1+((day1-1)*86400)+((month1-1)*2592000)+((year1-1970)*31104000);
        
      System.out.println("Unixtime= ");
      System.out.print(Unixtimez);
      
    }
}