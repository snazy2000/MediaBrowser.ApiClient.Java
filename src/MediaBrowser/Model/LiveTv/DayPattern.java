package MediaBrowser.Model.LiveTv;

public enum DayPattern
{
	Daily,
	Weekdays,
	Weekends;

	public int getValue()
	{
		return this.ordinal();
	}

	public static DayPattern forValue(int value)
	{
		return values()[value];
	}
}