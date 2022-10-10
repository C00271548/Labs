import java.util.Calendar;

public class Clock
{
	public static void main(String[] args)
	{
		// 1
		// makes new Calendar
		Calendar cal = Calendar.getInstance();
		// sets the new Time object
		Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		// prints out variables
		System.out.println(t.toString());
		
		long startMin;
		for (int index = 0; index < 60; index++)
		{
			startMin = System.currentTimeMillis();
			while (System.currentTimeMillis() - startMin < 1000)
			{
				try
				{
					Thread.sleep(50);
				}
				catch (InterruptedException e)
				{
					Thread.currentThread().interrupt();
				}
			}
			t.tick();
		}
		System.out.println(t.toString());
	}
}