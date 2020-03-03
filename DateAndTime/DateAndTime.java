/**
 * @author Rishit Patel
 * Date: Mar. 1, 2020
 * Description: Main class file for DateAndTime
 */
public class DateAndTime {
   private int hour; // 0 - 23
   private int minute; // 0 - 59
   private int second; // 0 - 59
   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year

   private static final int[] daysPerMonth = 
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
 
   // initializes each instance variable to zero  
   public DateAndTime() {                                             
      this(0, 0, 0, 1, 1,1970); // invoke constructor with three arguments
   } 

   // hour supplied, minute and second defaulted to 0
   public DateAndTime(int hour) {                                               
      this(hour, 0, 0, 1, 1,1970); // invoke constructor with three arguments 
   } 

   // hour and minute supplied, second defaulted to 0
   public DateAndTime(int hour, int minute) {
      this(hour, minute, 0, 1, 1,1970); // invoke constructor with three arguments 
   } 

   // Time2 constructor: hour, minute and second supplied   
   public DateAndTime(int hour, int minute, int second,
           int month, int day, int year) {                    
      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      } 

      if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      } 

      if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
      } 
      
      // confirm proper value for month and day given the year
      // check if month in range
      if (month <= 0 || month > 12) {
         throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");
      }

      // check if day in range for month
      if (day <= 0 || 
         (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
         throw new IllegalArgumentException("day (" + day + 
            ") out-of-range for the specified month and year");
      }

      // check for leap year if month is 2 and day is 29
      if (month == 2 && day == 29 && !(year % 400 == 0 || 
           (year % 4 == 0 && year % 100 != 0))) {
         throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");
      }
   
      this.month = month;
      this.day = day;
      this.year = year;
      this.hour = hour;
      this.minute = minute; 
      this.second = second; 
      
      System.out.printf("DateAndTime object constructor for date and time %s%n", this); 
   } 
          
   public DateAndTime(DateAndTime dateTime) {                                   
      // invoke constructor with three arguments
      this(dateTime.hour, dateTime.minute, dateTime.second, 
              dateTime.month, dateTime.day, dateTime.year);
   } 

   // Set Methods
   // set a new time value using universal time;  
   // validate the data
   public void setTime(int hour, int minute, int second) {
      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      } 

      if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      } 

      if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
      } 

      this.hour = hour;
      this.minute = minute; 
      this.second = second; 
   } 

   // validate and set hour 
   public void setHour(int hour) {
      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      }

      this.hour = hour;
   } 

   // validate and set minute 
   public void setMinute(int minute) {
      if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      }

      this.minute = minute; 
   } 

   // validate and set second 
   public void setSecond(int second) {
      if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
      }

      this.second = second;
   } 

   // Get Methods         
   // get hour value      
   public int getHour() {return hour;}

   // get minute value      
   public int getMinute() {return minute;} 

   // get second value      
   public int getSecond() {return second;}   
   
   /**
    * tick method to increment second
    */
   public void tick(){
       if(second == 59){
          second = 0;
          incrementMinute();
       } else{
          second++; 
       }
       
   }
   
   /**
    * incrementMinute method to increment minute
    */
   public void incrementMinute(){
       if(minute == 59){
           minute = 0;
          incrementHour();
          
       } else{
          minute++; 
       }
       
   }
   
   /**
    * incrementHour method to increment Hour
    */
   public void incrementHour(){
       if(hour == 23){
           hour = 0;
           nextDay();       
       } else{
           hour++;
       }
       
   }

   // convert to String in standard-time format (H:MM:SS AM or PM)
   @Override
   public String toString() {
      return String.format("%d/%d/%d %d:%02d:%02d %s", 
         month, day, year, ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
   }
   
   // convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString() {
      return String.format(
         "%02d/%02d/%4d %02d:%02d:%02d", month, day, year, getHour(), getMinute(), getSecond());
   } 
   
   /**
    * nextDay method to increase a day
    */
   public void nextDay(){
       /** For leap year */
       if(month == 2){
              if(year % 4 == 0){
                  if(day == 29){
                      day = 1;
                      nextMonth();
                  } else{
                     day++; 
                    }  
              }
              else{
                  if(day == 28){
                      day = 1;
                      nextMonth();
                  } else{
                     day++; 
                  }
              }
        } else{
                if(day == daysPerMonth[month]){
                     day = 1;
                     nextMonth();
                } else{
                     day++; 
                  }
          }
   }
   
   /**
    * nextMonth method to increase a month
    */
   public void nextMonth(){
       if(month == 12){
           month = 1;
           nextYear();
       } else{
           month++;
       }
       
   }
   
   /**
    * nextYear method to increase a year
    */
   public void nextYear(){
       year++;
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateAndTime dTest1 = new DateAndTime(23,59,54,3,2,2020);
        /** This for loop adds 11 seconds to the time so it changes 
         * seconds, minutes, hour, and day */
        for (int i = 0; i < 11; i++) {
            dTest1.tick();
        }
        System.out.println("After 11 seconds: " + dTest1);
        
        DateAndTime dTest2 = new DateAndTime(23,59,02,2,29,2020);
        /** This for loop adds 111 seconds to the time so it changes 
         * seconds, minutes, hour, day, and month */
        for (int i = 0; i < 111; i++) {
            dTest2.tick();
        }
        System.out.println("After 111 seconds: " + dTest2.toUniversalString());
        
        
        DateAndTime dTest3 = new DateAndTime(23,59,55,12,31,2020);
        /** This for loop adds 11 seconds to the time so it changes 
         * seconds, minutes, hour, day, month and year */
        for (int i = 0; i < 11; i++) {
            dTest3.tick();
        }
        System.out.println("After 11 seconds: " + dTest3.toString());
    }
   
}
