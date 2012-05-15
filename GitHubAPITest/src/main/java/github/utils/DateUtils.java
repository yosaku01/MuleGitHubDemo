package github.utils;

import java.util.Date;

public class DateUtils 
{
	/**
	 * Clone date if non-null
	 *
	 * @param date
	 * @return copied date
	 */
	public static Date clone(final Date date) {
		if (date == null)
			return null;
		return new Date(date.getTime());
	}
}
