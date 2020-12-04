package com.kcwongjoe.joelib;

import java.util.List;

public class JMathUtils {

	// region Max

	/**
	 * Max
	 * 
	 * @param array Array
	 * @return Return max
	 */
	public static int max(int[] array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.length == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		// Find max
		int result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > result) {
				result = array[i];
			}
		}

		return result;
	}

	/**
	 * Max
	 * 
	 * @param array Array
	 * @return Return max
	 */
	public static long max(long[] array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.length == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		// Find max
		long result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > result) {
				result = array[i];
			}
		}

		return result;
	}

	/**
	 * Max
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static float max(float[] array) {

		if (array == null)
			return Float.NaN;
		if (array.length == 0)
			return Float.NaN;

		// Find max
		float result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > result) {
				result = array[i];
			}
		}

		return result;
	}

	/**
	 * Max
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double max(double[] array) {

		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		// Find max
		double result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > result) {
				result = array[i];
			}
		}

		return result;
	}

	/**
	 * Max
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double max(double[][] array) {

		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		double result = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > result) {
					result = array[i][j];
				}
			}
		}
		return result;
	}

	/**
	 * Max
	 * 
	 * @param <T> Numerical
	 * @param array Array
	 * @return Return the max
	 */
	public static <T extends Number> T max(List<T> array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.size() == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		T result = array.get(0);
		double resultDouble = result.doubleValue();
		for (int i = 1; i < array.size(); i++) {
			if (array.get(i).doubleValue() > resultDouble) {
				result = array.get(i);
				resultDouble = result.doubleValue();
			}
		}
		return result;
	}

	// endregion Max

	// region maxIndex

	/**
	 * Return the index of the maximum value
	 * 
	 * @param array Array
	 * @return Return the index of the maximum value
	 */
	public static int maxIndex(int[] array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.length == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		int result = array[0];
		int resultIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > result) {
				result = array[i];
				resultIndex = i;
			}
		}
		return resultIndex;
	}

	/**
	 * Return the index of the maximum value
	 * 
	 * @param array Array
	 * @return Return the index of the maximum value
	 */
	public static int maxIndex(long[] array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.length == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		long result = array[0];
		int resultIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > result) {
				result = array[i];
				resultIndex = i;
			}
		}
		return resultIndex;
	}

	/**
	 * Return the index of the maximum value
	 * 
	 * @param array Array
	 * @return Return the index of the maximum value
	 */
	public static int maxIndex(float[] array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.length == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		float result = array[0];
		int resultIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > result) {
				result = array[i];
				resultIndex = i;
			}
		}
		return resultIndex;
	}

	/**
	 * Return the index of the maximum value
	 * 
	 * @param array Array
	 * @return Return the index of the maximum value
	 */
	public static int maxIndex(double[] array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.length == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		double result = array[0];
		int resultIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > result) {
				result = array[i];
				resultIndex = i;
			}
		}
		return resultIndex;
	}

	/**
	 * Return the index of the maximum value
	 * 
	 * @param <T> Numerical
	 * @param array Array
	 * @return Return the index of the maximum value
	 */
	public static <T extends Number> int maxIndex(List<T> array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.size() == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		T result = array.get(0);
		double resultDouble = result.doubleValue();
		int resultIndex = 0;
		for (int i = 1; i < array.size(); i++) {
			if (array.get(i).doubleValue() > resultDouble) {
				result = array.get(i);
				resultDouble = result.doubleValue();
			}
		}
		return resultIndex;
	}

	// endregion maxIndex

	// region Min

	/**
	 * Min
	 * 
	 * @param array Array
	 * @return Return the min
	 */
	public static int min(int[] array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.length == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		// Find min
		int result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < result) {
				result = array[i];
			}
		}

		return result;
	}

	/**
	 * Min
	 * 
	 * @param array Array
	 * @return Return the min
	 */
	public static long min(long[] array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.length == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		// Find max
		long result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < result) {
				result = array[i];
			}
		}

		return result;
	}

	/**
	 * Min
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static float min(float[] array) {

		if (array == null)
			return Float.NaN;
		if (array.length == 0)
			return Float.NaN;

		// Find min
		float result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < result) {
				result = array[i];
			}
		}

		return result;
	}

	/**
	 * Min
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double min(double[] array) {

		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		// Find min
		double result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < result) {
				result = array[i];
			}
		}

		return result;
	}

	/**
	 * Min
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double min(double[][] array) {

		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		double result = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < result) {
					result = array[i][j];
				}
			}
		}
		return result;
	}

	/**
	 * Min
	 * 
	 * @param <T> Numerical
	 * @param array Array
	 * @return Return min
	 */
	public static <T extends Number> T min(List<T> array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.size() == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		T result = array.get(0);
		double resultDouble = result.doubleValue();
		for (int i = 1; i < array.size(); i++) {
			if (array.get(i).doubleValue() < resultDouble) {
				result = array.get(i);
				resultDouble = result.doubleValue();
			}
		}
		return result;
	}

	// endregion Min

	// region minIndex

	/**
	 * Return the index of the minimum value
	 * 
	 * @param array Array
	 * @return Return the index of the minimum value
	 */
	public static int minIndex(int[] array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.length == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		int result = array[0];
		int resultIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < result) {
				result = array[i];
				resultIndex = i;
			}
		}
		return resultIndex;
	}

	/**
	 * Return the index of the minimum value
	 * 
	 * @param array Array
	 * @return Return the index of the minimum value
	 */
	public static int minIndex(long[] array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.length == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		long result = array[0];
		int resultIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < result) {
				result = array[i];
				resultIndex = i;
			}
		}
		return resultIndex;
	}

	/**
	 * Return the index of the minimum value
	 * 
	 * @param array Array
	 * @return Return the index of the minimum value
	 */
	public static int minIndex(float[] array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.length == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		float result = array[0];
		int resultIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < result) {
				result = array[i];
				resultIndex = i;
			}
		}
		return resultIndex;
	}

	/**
	 * Return the index of the minimum value
	 * 
	 * @param array Array
	 * @return Return the index of the minimum value
	 */
	public static int minIndex(double[] array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.length == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		double result = array[0];
		int resultIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < result) {
				result = array[i];
				resultIndex = i;
			}
		}
		return resultIndex;
	}

	/**
	 * Return the index of the minimum value
	 * 
	 * @param <T> Numerical
	 * @param array Array
	 * @return Return the index of the minimum value
	 */
	public static <T extends Number> int minIndex(List<T> array) {

		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.size() == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		T result = array.get(0);
		double resultDouble = result.doubleValue();
		int resultIndex = 0;
		for (int i = 1; i < array.size(); i++) {
			if (array.get(i).doubleValue() < resultDouble) {
				result = array.get(i);
				resultDouble = result.doubleValue();
			}
		}
		return resultIndex;
	}

	// endregion minIndex

	// region Mean

	/**
	 * Mean
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double mean(int[] array) {

		// Exception
		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		double result = 0;
		for (int i = 0; i < array.length; i++) {
			result += (double) array[i];
		}
		return (result / (double) array.length);
	}

	/**
	 * Mean
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double mean(long[] array) {

		// Exception
		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		double result = 0;
		for (int i = 0; i < array.length; i++) {
			result += (double) array[i];
		}
		return (result / (double) array.length);
	}

	/**
	 * Mean
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double mean(float[] array) {

		// Exception
		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		int n = 0;
		double result = 0;
		for (int i = 0; i < array.length; i++) {
			if (Double.isFinite(array[i])) {
				result += array[i];
				n++;
			}
		}
		if (n != 0) {
			return (result / (double) n);
		} else {
			return Double.NaN;
		}
	}

	/**
	 * Mean
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double mean(double[] array) {

		// Exception
		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		int n = 0;
		double result = 0;
		for (int i = 0; i < array.length; i++) {
			if (Double.isFinite(array[i])) {
				result += array[i];
				n++;
			}
		}
		if (n != 0) {
			return (result / (double) n);
		} else {
			return Double.NaN;
		}
	}

	/**
	 * Mean
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double mean(double[][] array) {

		// Exception
		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		long n = 0;
		double result = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (Double.isFinite(array[i][j])) {
					result += array[i][j];
					n++;
				}
			}
		}
		if (n != 0) {
			return (result / (double) n);
		} else {
			return Double.NaN;
		}
	}

	/**
	 * Mean
	 * 
	 * @param <T> Numerical
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static <T extends Number> double mean(List<T> array) {

		// Exception
		if (array == null)
			return Double.NaN;
		if (array.size() == 0)
			return Double.NaN;

		int n = 0;
		double result = 0;
		for (int i = 0; i < array.size(); i++) {
			double value = array.get(i).doubleValue();
			if (Double.isFinite(value)) {
				result += value;
				n++;
			}
		}
		if (n != 0) {
			return (result / (double) n);
		} else {
			return Double.NaN;
		}
	}

	// endregion Mean

	// region Stdev

	/**
	 * Standard Deviation
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double stdev(int[] array) {
		return stdev(array, mean(array));
	}

	/**
	 * Standard Deviation
	 * 
	 * @param array Array
	 * @param mean  Mean of array.
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double stdev(int[] array, double mean) {

		// Exception
		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		double result = 0;
		for (int i = 0; i < array.length; i++) {
			double value = (double) array[i] - mean;
			result += value * value;
		}
		return (Math.sqrt(result / (double) array.length));
	}

	/**
	 * Standard Deviation
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double stdev(long[] array) {
		return stdev(array, mean(array));
	}

	/**
	 * Standard Deviation
	 * 
	 * @param array Array
	 * @param mean Mean of array.
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double stdev(long[] array, double mean) {

		// Exception
		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		double result = 0;
		for (int i = 0; i < array.length; i++) {
			double value = (double) array[i] - mean;
			result += value * value;
		}
		return (Math.sqrt(result / (double) array.length));
	}

	/**
	 * Standard Deviation
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double stdev(float[] array) {
		return stdev(array, mean(array));
	}

	/**
	 * Standard Deviation
	 * 
	 * @param array Array
	 * @param mean Mean of array.
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double stdev(float[] array, double mean) {

		// Exception
		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		double result = 0;
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			if (Double.isFinite(array[i])) {
				double value = array[i] - mean;
				result += value * value;
				n++;
			}

		}

		if (n != 0) {
			return (Math.sqrt(result / (double) n));
		} else {
			return Double.NaN;
		}
	}

	/**
	 * Standard Deviation
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double stdev(double[] array) {
		return stdev(array, mean(array));
	}

	/**
	 * Standard Deviation
	 * 
	 * @param array Array
	 * @param mean Mean of array.
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double stdev(double[] array, double mean) {

		// Exception
		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		double result = 0;
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			if (Double.isFinite(array[i])) {
				double value = array[i] - mean;
				result += value * value;
				n++;
			}
		}

		if (n != 0) {
			return (Math.sqrt(result / (double) n));
		} else {
			return Double.NaN;
		}
	}

	/**
	 * Standard Deviation
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double stdev(double[][] array) {
		return stdev(array, mean(array));
	}

	/**
	 * Standard Deviation
	 * 
	 * @param array Array
	 * @param mean Mean of array.
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double stdev(double[][] array, double mean) {

		// Exception
		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		double result = 0;
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (Double.isFinite(array[i][j])) {
					double value = array[i][j] - mean;
					result += value * value;
					n++;
				}
			}
		}

		if (n != 0) {
			return (Math.sqrt(result / (double) n));
		} else {
			return Double.NaN;
		}
	}

	/**
	 * Standard Deviation
	 * 
	 * @param <T> Numerical
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static <T extends Number> double stdev(List<T> array) {
		return stdev(array, mean(array));
	}

	/**
	 * Standard Deviation
	 * 
	 * @param <T> Numerical
	 * @param array Array
	 * @param mean  Mean of array.
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static <T extends Number> double stdev(List<T> array, double mean) {

		// Exception
		if (array == null)
			return Double.NaN;
		if (array.size() == 0)
			return Double.NaN;

		double result = 0;
		int n = 0;
		for (int i = 0; i < array.size(); i++) {
			double value = array.get(i).doubleValue();
			if (Double.isFinite(value)) {
				double powerValue = value - mean;
				result += powerValue * powerValue;
				n++;
			}
		}

		if (n != 0) {
			return (Math.sqrt(result / (double) n));
		} else {
			return Double.NaN;
		}
	}

	// endregion stdev

	// region sum

	/**
	 * Sum
	 * 
	 * @param array Array
	 * @return Return sum
	 */
	public static long sum(int[] array) {
		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.length == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		long result = 0;
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return result;
	}

	/**
	 * Sum
	 * 
	 * @param array Array
	 * @return Return sum
	 */
	public static long sum(long[] array) {
		// Exception
		if (array == null)
			throw new NullPointerException("arry can't be null.");
		if (array.length == 0)
			throw new IllegalArgumentException("Lenght of array == 0.");

		long result = 0;
		for (int i = 0; i < array.length; i++) {
			result += array[i];
		}
		return result;
	}

	/**
	 * Sum
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double sum(float[] array) {
		// Exception
		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		double result = 0;
		for (int i = 0; i < array.length; i++) {
			if (Float.isFinite(array[i])) {
				result += array[i];
			}
		}
		return result;
	}

	/**
	 * Sum
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double sum(double[] array) {
		// Exception
		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		double result = 0;
		for (int i = 0; i < array.length; i++) {
			if (Double.isFinite(array[i])) {
				result += array[i];
			}
		}
		return result;
	}

	/**
	 * Sum
	 * 
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static double sum(double[][] array) {
		// Exception
		if (array == null)
			return Double.NaN;
		if (array.length == 0)
			return Double.NaN;

		double result = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (Double.isFinite(array[i][j])) {
					result += array[i][j];
				}
			}

		}
		return result;
	}

	/**
	 * Sum
	 * @param <T> Numerical
	 * @param array Array
	 * @return Return NaN if <code>array == null || array.length == 0</code>
	 */
	public static <T extends Number> double sum(List<T> array) {

		// Exception
		if (array == null)
			return Double.NaN;
		if (array.size() == 0)
			return Double.NaN;

		double result = 0;
		for (int i = 0; i < array.size(); i++) {
			double value = array.get(i).doubleValue();
			if (Double.isFinite(value)) {
				result += value;
			}
		}
		return result;
	}

	// endregion sum

	// region plus

	/**
	 * <code>array + value</code>. If <code>array[i] == NaN</code>,
	 * <code>result[i] = value</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>array + value</code>
	 */
	public static double[] plus(double[] array, double value) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0];
		if (!Double.isFinite(value))
			return (double[]) array.clone();

		double[] result = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			if (Double.isNaN(array[i])) {
				result[i] = value;
			} else {
				result[i] = array[i] + value;
			}
		}
		return result;
	}

	/**
	 * <code>array1 + array2</code>. If <code>array1[i] == NaN</code>,
	 * <code>result[i] = array2[i]</code> vice versa
	 * 
	 * @param array1 Array 1
	 * @param array2 Array 2, Length of <code>array2</code> must be equal to the
	 *               length of <code>array2</code>
	 * @return Return <code>array1 + array2</code>
	 */
	public static double[] plus(double[] array1, double[] array2) {
		if (array1 == null)
			throw new IllegalArgumentException("array1 is null.");
		if (array2 == null)
			throw new IllegalArgumentException("array2 is null.");
		if (array1.length != array2.length)
			throw new IllegalArgumentException(
					"Length of array1(" + array1.length + ") != Length of array2(" + array2.length + ").");

		double[] result = new double[array1.length];
		for (int i = 0; i < array1.length; i++) {
			if (Double.isNaN(array1[i])) {
				result[i] = array2[i];
			} else if (Double.isNaN(array2[i])) {
				result[i] = array1[i];
			} else {
				result[i] = array1[i] + array2[i];
			}
		}
		return result;
	}

	/**
	 * <code>array + value</code>. If <code>array[i][j] == NaN</code>,
	 * <code>result[i][j] = value</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>array + value</code>
	 */
	public static double[][] plus(double[][] array, double value) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0][0];
		if (!Double.isFinite(value))
			return (double[][]) array.clone();

		double[][] result = new double[array.length][];
		for (int i = 0; i < array.length; i++) {
			result[i] = new double[array[i].length];
			for (int j = 0; j < array[i].length; j++) {
				if (Double.isNaN(array[i][j])) {
					result[i][j] = value;
				} else {
					result[i][j] = array[i][j] + value;
				}
			}
		}
		return result;
	}

	// endregion plus

	// region minus

	/**
	 * <code>array - value</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>array - value</code>
	 */
	public static double[] minus(double[] array, double value) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0];
		if (!Double.isFinite(value))
			return (double[]) array.clone();

		double[] result = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i] - value;
		}
		return result;
	}

	/**
	 * <code>value - array</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>value - array</code>
	 */
	public static double[] minus(double value, double[] array) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0];
		if (!Double.isFinite(value))
			return (double[]) array.clone();

		double[] result = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = value - array[i];
		}
		return result;
	}

	/**
	 * <code>array1 - array2</code>
	 * 
	 * @param array1 Array 1
	 * @param array2 Array 2, Length of <code>array2</code> must be equal to the
	 *               length of <code>array2</code>
	 * @return Return <code>array1 - array2</code>
	 */
	public static double[] minus(double[] array1, double[] array2) {
		if (array1 == null)
			throw new IllegalArgumentException("array1 is null.");
		if (array2 == null)
			throw new IllegalArgumentException("array2 is null.");
		if (array1.length != array2.length)
			throw new IllegalArgumentException(
					"Length of array1(" + array1.length + ") != Length of array2(" + array2.length + ").");

		double[] result = new double[array1.length];
		for (int i = 0; i < array1.length; i++) {
			result[i] = array1[i] - array2[i];
		}
		return result;
	}

	/**
	 * <code>array - value</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>array - value</code>
	 */
	public static double[][] minus(double[][] array, double value) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0][0];
		if (!Double.isFinite(value))
			return (double[][]) array.clone();

		double[][] result = new double[array.length][];
		for (int i = 0; i < array.length; i++) {
			result[i] = new double[array[i].length];
			for (int j = 0; j < array[i].length; j++) {
				result[i][j] = array[i][j] - value;
			}
		}
		return result;
	}

	/**
	 * <code>value - array</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>value - array</code>
	 */
	public static double[][] minus(double value, double[][] array) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0][0];
		if (!Double.isFinite(value))
			return (double[][]) array.clone();

		double[][] result = new double[array.length][];
		for (int i = 0; i < array.length; i++) {
			result[i] = new double[array[i].length];
			for (int j = 0; j < array[i].length; j++) {
				result[i][j] = value - array[i][j];
			}
		}
		return result;
	}

	// endregion minus

	// region multiple

	/**
	 * <code>array * value</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>array * value</code>
	 */
	public static double[] multiple(double[] array, double value) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0];
		if (!Double.isFinite(value))
			return (double[]) array.clone();

		double[] result = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i] * value;
		}
		return result;
	}

	/**
	 * <code>array1 * array2</code>
	 * 
	 * @param array1 Array 1
	 * @param array2 Array 2, Length of <code>array2</code> must be equal to the
	 *               length of <code>array2</code>
	 * @return Return <code>array1 * array2</code>
	 */
	public static double[] multiple(double[] array1, double[] array2) {
		if (array1 == null)
			throw new IllegalArgumentException("array1 is null.");
		if (array2 == null)
			throw new IllegalArgumentException("array2 is null.");
		if (array1.length != array2.length)
			throw new IllegalArgumentException(
					"Length of array1(" + array1.length + ") != Length of array2(" + array2.length + ").");

		double[] result = new double[array1.length];
		for (int i = 0; i < array1.length; i++) {
			result[i] = array1[i] * array2[i];
		}
		return result;
	}

	/**
	 * <code>array * value</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>array * value</code>
	 */
	public static double[][] multiple(double[][] array, double value) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0][0];
		if (!Double.isFinite(value))
			return (double[][]) array.clone();

		double[][] result = new double[array.length][];
		for (int i = 0; i < array.length; i++) {
			result[i] = new double[array[i].length];
			for (int j = 0; j < array[i].length; j++) {
				result[i][j] = array[i][j] * value;
			}
		}
		return result;
	}

	// endregion multiple

	// region divide

	/**
	 * <code>array / value</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>array / value</code>
	 */
	public static double[] divide(double[] array, double value) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0];
		if (!Double.isFinite(value))
			return (double[]) array.clone();

		double[] result = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i] / value;
		}
		return result;
	}

	/**
	 * <code>value / array</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>value / array</code>
	 */
	public static double[] divide(double value, double[] array) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0];
		if (!Double.isFinite(value))
			return (double[]) array.clone();

		double[] result = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = value / array[i];
		}
		return result;
	}

	/**
	 * <code>array1 / array2</code>
	 * 
	 * @param array1 Array 1
	 * @param array2 Array 2, Length of <code>array2</code> must be equal to the
	 *               length of <code>array2</code>
	 * @return Return <code>array1 / array2</code>
	 */
	public static double[] divide(double[] array1, double[] array2) {
		if (array1 == null)
			throw new IllegalArgumentException("array1 is null.");
		if (array2 == null)
			throw new IllegalArgumentException("array2 is null.");
		if (array1.length != array2.length)
			throw new IllegalArgumentException(
					"Length of array1(" + array1.length + ") != Length of array2(" + array2.length + ").");

		double[] result = new double[array1.length];
		for (int i = 0; i < array1.length; i++) {
			result[i] = array1[i] / array2[i];
		}
		return result;
	}

	/**
	 * <code>array / value</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>array / value</code>
	 */
	public static double[][] divide(double[][] array, double value) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0][0];
		if (!Double.isFinite(value))
			return (double[][]) array.clone();

		double[][] result = new double[array.length][];
		for (int i = 0; i < array.length; i++) {
			result[i] = new double[array[i].length];
			for (int j = 0; j < array[i].length; j++) {
				result[i][j] = array[i][j] / value;
			}
		}
		return result;
	}

	/**
	 * <code>value / array</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>value / array</code>
	 */
	public static double[][] divide(double value, double[][] array) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0][0];
		if (!Double.isFinite(value))
			return (double[][]) array.clone();

		double[][] result = new double[array.length][];
		for (int i = 0; i < array.length; i++) {
			result[i] = new double[array[i].length];
			for (int j = 0; j < array[i].length; j++) {
				result[i][j] = value / array[i][j];
			}
		}
		return result;
	}

	// endregion divide

	// region divide

	/**
	 * <code>array^value</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>array^value</code>
	 */
	public static double[] pow(double[] array, double value) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0];
		if (!Double.isFinite(value))
			return (double[]) array.clone();

		double[] result = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = Math.pow(array[i], value);
		}
		return result;
	}

	/**
	 * <code>value^array[i]</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>value^array[i]</code>
	 */
	public static double[] pow(double value, double[] array) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0];
		if (!Double.isFinite(value))
			return (double[]) array.clone();

		double[] result = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = Math.pow(value, array[i]);
		}
		return result;
	}

	/**
	 * <code>array1[i]^array2[i]</code>
	 * 
	 * @param array1 Array 1
	 * @param array2 Array 2, Length of <code>array2</code> must be equal to the
	 *               length of <code>array2</code>
	 * @return Return <code>array1[i]^array2[i]</code>
	 */
	public static double[] pow(double[] array1, double[] array2) {
		if (array1 == null)
			throw new IllegalArgumentException("array1 is null.");
		if (array2 == null)
			throw new IllegalArgumentException("array2 is null.");
		if (array1.length != array2.length)
			throw new IllegalArgumentException(
					"Length of array1(" + array1.length + ") != Length of array2(" + array2.length + ").");

		double[] result = new double[array1.length];
		for (int i = 0; i < array1.length; i++) {
			result[i] = Math.pow(array1[i], array2[i]);
		}
		return result;
	}

	/**
	 * <code>array^value</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>array^value</code>
	 */
	public static double[][] pow(double[][] array, double value) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0][0];
		if (!Double.isFinite(value))
			return (double[][]) array.clone();

		double[][] result = new double[array.length][];
		for (int i = 0; i < array.length; i++) {
			result[i] = new double[array[i].length];
			for (int j = 0; j < array[i].length; j++) {
				result[i][j] = Math.pow(array[i][j], value);
			}
		}
		return result;
	}

	/**
	 * <code>value^array[i]</code>
	 * 
	 * @param array Array
	 * @param value Value
	 * @return Return <code>value^array[i]</code>
	 */
	public static double[][] pow(double value, double[][] array) {
		if (array == null)
			return null;
		if (array.length == 0)
			return new double[0][0];
		if (!Double.isFinite(value))
			return (double[][]) array.clone();

		double[][] result = new double[array.length][];
		for (int i = 0; i < array.length; i++) {
			result[i] = new double[array[i].length];
			for (int j = 0; j < array[i].length; j++) {
				result[i][j] = Math.pow(value, array[i][j]);
			}
		}
		return result;
	}

	// endregion pow

	/**
     * Get the range of data
     *
     * @param x data
     * @return Return new double[]{min, max}
     */
    public static double[] getRange(double[] x) {
        // Throw Exception
        if (x == null)
            return null;
        if (x.length == 0)
            return new double[0];

        // Calculate
        double min = x[0];
        double max = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min)
                min = x[i];
            if (x[i] > max)
                max = x[i];
        }

        return new double[]{min, max};
    }
}
