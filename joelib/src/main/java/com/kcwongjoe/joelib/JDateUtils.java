package com.kcwongjoe.joelib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * A Utils for date
 */
public class JDateUtils {

	/**
	 * Check whether the date string is in the specific format
	 * 
	 * @param str    String to be checked
	 * @param format Date format
	 * @return Return true if format matched.
	 */
	public static boolean checkDateStrFormat(String str, SimpleDateFormat format) {
		try {
			format.parse(str);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}

	/**
	 * Add number of day to <code>time</code>
	 * 
	 * @param time Date time to be added
	 * @param day  Number of day to add
	 * @return Return the time which added <code>day</code>
	 */
	public static Date addDayToDate(Date time, int day) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(time);
		cal.add(Calendar.DAY_OF_MONTH, day);
		return cal.getTime();
	}

	/**
	 * Add number of second to <code>time</code>
	 * 
	 * @param time   Date time to be added
	 * @param second Number of second to add
	 * @return Return the time which added <code>second</code>
	 */
	public static Date addSecToDate(Date time, int second) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(time);
		cal.add(Calendar.SECOND, second);
		return cal.getTime();
	}

	/**
	 * Add number of millisecond to <code>time</code>
	 * 
	 * @param time        Date time to be added
	 * @param ms Number of millisecond to add
	 * @return Return the time which added <code>ms</code>
	 */
	public static Date addmSecToDate(Date time, int ms) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(time);
		cal.add(Calendar.MILLISECOND, ms);
		return cal.getTime();
	}

	/**
	 * Return the current time
	 * 
	 * @return Return the current time
	 */
	public static Date returnNow() {
		Calendar cal = Calendar.getInstance();
		return cal.getTime();
	}

	/**
	 * Return the current date. Time will set as 00:00:00.000s
	 * 
	 * @return Return the current date.
	 */
	public static Date returnNowDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		return cal.getTime();
	}

	/**
	 * Return a date string in the specific date format.
	 * 
	 * @param format Format
	 * @return Return a date string in the specific date format.
	 */
	public static String returnNowStr(String format) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(cal.getTime());
	}

	/**
	 * Return a date string in the specific date format. <code>""</code> return if
	 * time is <code>null</code>.
	 * 
	 * @param format Format
	 * @param time   Time
	 * @return Return a date string in the specific date format.
	 */
	public static String returnDateString(SimpleDateFormat format, Date time) {
		String result = "";
		if (time != null) {
			result = format.format(time);
		}
		return result;
	}

	/**
	 * Return number of days in specific year
	 * 
	 * @param year Year
	 * @return Return number of days in specific year
	 */
	public static int returnNumDaysInYear(Date year) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(year);
		return cal.getActualMaximum(Calendar.DAY_OF_YEAR);
	}

	/**
	 * Return number of days in specific month
	 * 
	 * @param month Month
	 * @return Return number of days in specific month
	 */
	public static int returnNumDaysInMonth(Date month) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(month);
		return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	// Return the number of month between two date, if floor == true, number of day
	// difference >= 20, month++

	/**
	 * Return the number of months between two times.
	 * 
	 * @param start Start time
	 * @param end   End time
	 * @param ceil  if ceil == true and number of day difference &gt;= 20, month++
	 * @return Return the number of months between two times.
	 */
	public static int numOfMonthDiff(Date start, Date end, boolean ceil) {
		Calendar startCalendar = Calendar.getInstance();
		startCalendar.setTime(start);
		Calendar endCalendar = Calendar.getInstance();
		endCalendar.setTime(end);
		int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
		int result = diffYear * 12 + endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
		if (ceil) {
			int diffDay = endCalendar.get(Calendar.DAY_OF_MONTH) - startCalendar.get(Calendar.DAY_OF_MONTH);
			if (diffDay >= 20) {
				result++;
			}
		}
		return result;
	}

	//

	/**
	 * Return the number of day between two times
	 * 
	 * @param start Start time
	 * @param end   End time
	 * @return Return the number of day between two times
	 */
	public static int numOfDayDiff(Date start, Date end) {
		long diff = end.getTime() - start.getTime();
		return (int) (diff / (1000.0 * 60.0 * 60.0 * 24.0));
	}

	/**
	 * Return the number of second between two time
	 * 
	 * @param start Start time
	 * @param end   End time
	 * @return Return the number of second between two time
	 */
	public static int numOfSecDiff(Date start, Date end) {
		long diff = end.getTime() - start.getTime();
		return (int) (diff / 1000.0);
	}

	/**
	 * Return the number of millisecond between two time
	 * 
	 * @param start Start time
	 * @param end   End time
	 * @return Return the number of millisecond between two time
	 */
	public static int numOfMillSecDiff(Date start, Date end) {
		long diff = end.getTime() - start.getTime();
		return (int) diff;
	}

	/**
	 * Generate Date Array second by second
	 * 
	 * @param start Start time
	 * @param end   End time
	 * @return Return null if something wrong.
	 */
	public static Date[] genDateArrSecBySec(Date start, Date end) {
		try {
			SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date startTime = formatDate.parse(formatDate.format(start));
			Date endTime = formatDate.parse(formatDate.format(end));

			// If end is 6.22s, endTime is 6s and the result size should be increase 1 s so
			// that result is 7s
			Date[] result;
			if (endTime.before(end)) {
				result = new Date[numOfSecDiff(startTime, endTime) + 2];
			} else {
				result = new Date[numOfSecDiff(startTime, endTime) + 1];
			}

			// Generate
			result[0] = startTime;
			for (int i = 1; i < result.length; i++) {
				result[i] = addSecToDate(result[i - 1], 1);
			}

			return result;
		} catch (Exception e) {
			return null;
		}
	}
}
