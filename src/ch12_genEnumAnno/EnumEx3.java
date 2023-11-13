package ch12_genEnumAnno;
enum Week  {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumEx3 {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();  //name() 메소드
		System.out.println(name);
		int ordinal = today.ordinal();
		System.out.println(ordinal);  // ordinal() 메소드
		//  compareTO() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		                //Week.MONDAY:0 - Week.WEDNESDAY:2
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		// valueOf() 메소드
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day.name() + "," + day);			
		}
		int wd = (int)  (Math.random() * days.length);
		System.out.println(wd);
		Week weekDay = Week.valueOf(days[wd].name());
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY)  {
			System.out.println(weekDay + ":주말 이군요");
	}   else  {
		    System.out.println(weekDay + ":평일 이군요");
	}
}
}
