package com.kcwongjoe.joelib;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * A Util for general purpose
 */
public class JGeneralUtils {

    /**
     * A threshold to decide the value whether is zero.
     */
    private final static double DOUBLE_ZERO_THRESHOLD = 2 * Double.MIN_VALUE;

    // region toString

    /**
     * Convert int[] to string.
     * 
     * @param values Values
     * @return Return the string of int[].
     */
    public static String toString(int[] values) {

        // Return null
        if (values == null)
            return "int[]{null}";

        // Build string
        StringBuilder sb = new StringBuilder();
        sb.append("int[" + values.length + "]{");
        for (int i = 0; i < values.length; i++) {

            if (i != 0)
                sb.append("," + values[i]);
            else
                sb.append(values[i]);
        }
        sb.append("}");

        return sb.toString();
    }

    /**
     * Convert long[] to string.
     * 
     * @param values Values
     * @return Return the string of long[].
     */
    public static String toString(long[] values) {

        // Return null
        if (values == null)
            return "long[]{null}";

        // Build string
        StringBuilder sb = new StringBuilder();
        sb.append("long[" + values.length + "]{");
        for (int i = 0; i < values.length; i++) {

            if (i != 0)
                sb.append("," + values[i]);
            else
                sb.append(values[i]);
        }
        sb.append("}");

        return sb.toString();
    }

    /**
     * Convert float[] to string.
     * 
     * @param values Values
     * @return Return the string of float[].
     */
    public static String toString(float[] values) {

        // Return null
        if (values == null)
            return "float[]{null}";

        // Build string
        StringBuilder sb = new StringBuilder();
        sb.append("float[" + values.length + "]{");
        for (int i = 0; i < values.length; i++) {

            if (i != 0)
                sb.append("," + values[i]);
            else
                sb.append(values[i]);
        }
        sb.append("}");

        return sb.toString();
    }

    /**
     * Convert double[] to string.
     * 
     * @param values Values
     * @return Return the string of double[].
     */
    public static String toString(double[] values) {

        // Return null
        if (values == null)
            return "double[]{null}";

        // Build string
        StringBuilder sb = new StringBuilder();
        sb.append("double[" + values.length + "]{");
        for (int i = 0; i < values.length; i++) {

            if (i != 0)
                sb.append("," + values[i]);
            else
                sb.append(values[i]);
        }
        sb.append("}");

        return sb.toString();
    }

    /**
     * Convert boolean[] to string.
     * 
     * @param values Values
     * @return Return the string of boolean[].
     */
    public static String toString(boolean[] values) {

        // Return null
        if (values == null)
            return "boolean[]{null}";

        // Build string
        StringBuilder sb = new StringBuilder();
        sb.append("boolean[" + values.length + "]{");
        for (int i = 0; i < values.length; i++) {

            if (i != 0)
                sb.append("," + values[i]);
            else
                sb.append(values[i]);
        }
        sb.append("}");

        return sb.toString();
    }

    /**
     * Convert error to string.
     * 
     * @param throwable Error
     * @return Return the string of error.
     */
    public static String toString(Throwable throwable) {

        String result = "";

        StackTraceElement[] stackTraceElements = throwable.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            result = result + stackTraceElement.toString() + "\n";
        }

        return result;
    }

    // endregion

    // region String

    /**
     * Convert byte[] to hex string[]
     *
     * @param bytes Bytes
     * @return Return the hex string[] of bytes
     */
    public static String[] toHexString(byte[] bytes) {
        if (bytes == null)
            return null;

        String[] result = new String[bytes.length];

        for (int i = 0; i < bytes.length; i++) {
            result[i] = String.format("%02X", bytes[i]);
        }

        return result;
    }

    /**
     * Parse Double which will remove non-numerical char before parse.
     * 
     * @param str
     * @return Return <code>null</code> if not success. Otherwise return the Double.
     */
    public static Double parseDouble(String str) {

        Double result = null;

        if (isNullStr(str))
            return result;

        // Remove non-numerical char
        String removedStr = "";
        for (int i = 0; i < str.length(); i++) {
            char charbuf = str.charAt(i);
            int ascii = (int) charbuf;
            if ((ascii >= 48 && ascii <= 57) || (ascii == 46)) {
                removedStr = removedStr + charbuf;
            }
        }

        if (removedStr.length() > 0) {
            try {
                result = Double.parseDouble(removedStr);
            } catch (NumberFormatException e) {
            }
        }

        return result;
    }

    /**
     * Parse Integer which will remove non-numerical char before parse.
     * 
     * @param str
     * @return Return <code>null</code> if not success. Otherwise return the
     *         integer.
     */
    public static Integer parseInteger(String str) {

        Integer result = null;

        if (isNullStr(str))
            return result;

        // Remove non-numerical char
        String removedStr = "";
        for (int i = 0; i < str.length(); i++) {
            char charbuf = str.charAt(i);
            if ((int) charbuf >= 48 && (int) charbuf <= 57) {
                removedStr = removedStr + charbuf;
            }
        }

        if (removedStr.length() > 0) {
            try {
                result = Integer.parseInt(removedStr);
            } catch (NumberFormatException e) {
            }
        }

        return result;
    }

    /**
     * Check whether string is null or ""
     * 
     * @param str String to be checked
     * @return Return true if it is null or empty string.
     */
    public static boolean isNullStr(String str) {
        boolean result = false;
        if (str == null || str.equals("")) {
            result = true;
        }
        return result;
    }

    /**
     * Check the String whether contain Alphabet only
     * 
     * @param str String
     * @return Retrun true if <code>str</code> only contains alphabet only
     */
    public static boolean containAlphabetOnly(String str) {

        if (isNullStr(str))
            return false;

        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            char charbuf = str.charAt(i);
            if (!(((int) charbuf >= 65 && (int) charbuf <= 90) || ((int) charbuf >= 97 && (int) charbuf <= 122))) {
                result = false;
            }
        }
        return result;
    }

    /**
     * Check the String whether contain Alphabet and Numerical only
     * 
     * @param str String
     * @return Retrun true if <code>str</code> only contains alphabet and numerical
     *         only
     */
    public static boolean containCharacterOnly(String str) {

        if (isNullStr(str))
            return false;

        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            char charbuf = str.charAt(i);
            if (!(((int) charbuf >= 65 && (int) charbuf <= 90) || ((int) charbuf >= 97 && (int) charbuf <= 122)
                    || ((int) charbuf >= 48 && (int) charbuf <= 57))) {
                result = false;
            }
        }
        return result;
    }

    /**
     * Filter out non non printable character. Printable character = ascii(9, 32 to
     * 126)
     * 
     * @param str String
     * @return Return the filtered string.
     */
    public static String filterNonPrintChar(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char charbuf = str.charAt(i);
            if (((int) charbuf >= 32 && (int) charbuf <= 126) || (int) charbuf == 9) {
                result = result + charbuf;
            }
        }
        return result;
    }

    /**
     * Format a string as float string. 1) Any non numerical character will be
     * filtered out. 2) The second floating point will be ignored. 3) NaN will be
     * returned if this is not a float string.
     * 
     * @param str String to be format
     * @return Return the formated string
     */
    public static String formatAsFloatStr(String str) {
        return formatAsFloatStr(str, "NaN");
    }

    /**
     * Format a string as float string. 1) Any non numerical character will be
     * filtered out. 2) The second floating point will be ignored.
     * 
     * @param str        String to be format
     * @param invalidStr This string will be returned if this is not a float string.
     * @return Return the formated string
     */
    public static String formatAsFloatStr(String str, String invalidStr) {

        String result = "";
        boolean hasDot = false;

        if (!isNullStr(str)) {
            for (int i = 0; i < str.length(); i++) {
                char charbuf = str.charAt(i);
                // if (0-9)
                if ((int) charbuf >= 48 && (int) charbuf <= 57) {
                    result = result + charbuf;
                } else if ((int) charbuf == 46 && !hasDot) {
                    result = result + charbuf;
                    hasDot = true;
                }
            }
        }

        if (isNullStr(result)) {
            result = "NaN";
        }

        return result;
    }

    /**
     * Filter out invalid file name character (/ ? &lt; &gt; \ : * | " ^ and last
     * SPACE)
     * 
     * @param str String to be filtered
     * @return Return the filtered string
     */
    public static String filterInvalidFileChar(String str) {
        if (isNullStr(str))
            return "";

        String result = "";
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {

                // Get char
                char charbuf = str.charAt(i);

                // Check last space
                if (!(i == str.length() - 1 && ((int) charbuf) == 32)) {
                    // Check invalid char
                    if (((int) charbuf) > 31 && ((int) charbuf) != 47 && ((int) charbuf) != 63 && ((int) charbuf) != 60
                            && ((int) charbuf) != 62 && ((int) charbuf) != 92 && ((int) charbuf) != 58
                            && ((int) charbuf) != 42 && ((int) charbuf) != 124 && ((int) charbuf) != 34
                            && ((int) charbuf) != 94) {
                        result = result + charbuf;
                    }
                }
            }
        }
        return result;
    }

    // endregion String

    // region Numerical

    /**
     * Check wether string is numerical string. "NaN" is considered as numerical.
     * 
     * @param str Strinf to be checked
     * @return Return true if <code>str</code> is numerical string.
     */
    public static boolean isNumerical(String str) {
        return isNumerical(str, true);
    }

    /**
     * Check wether string is numerical string.
     * 
     * @param str      Strinf to be checked
     * @param checkNaN Set it as true if assume "NaN" as numerical.
     * @return Return true if <code>str</code> is numerical string.
     */
    public static boolean isNumerical(String str, boolean checkNaN) {

        if (isNullStr(str))
            return false;

        // Check NaN
        if (str.equals("NaN")) {
            if (checkNaN)
                return true;
            else
                return false;
        }

        try {
            Float.parseFloat(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Check wether string is integer string.
     * 
     * @param str Strinf to be checked
     * @return Return true if <code>str</code> is a integer string.
     */
    public static boolean isInteger(String str) {

        if (isNullStr(str))
            return false;

        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Remove round off error
     * 
     * @param value     Values
     * @param precision Precision of the value
     * @return Return the value which removed round-off error
     */
    public static double removeRoundOffError(double value, int precision) {

        if (!Double.isFinite(value))
            return value;

        long hundValue = (long) Math.pow(10, precision);
        return Math.floor(value * hundValue + 0.5) / hundValue;
    }

    // region createSequence

    /**
     * Create a integer sequence with the unity step. <code>end</code> can be
     * samller than <code>start</code> to create a reverse sequence. e.g. (start =
     * 2, end = 5) = [2, 3, 4, 5]
     *
     * @param start start integer
     * @param end   end integer
     * @return Return a sequence from <code>start</code> to <code>end</code> with
     *         unity step
     */
    public static int[] createSequence(int start, int end) {
        return createSequence(start, end, 1);
    }

    /**
     * Create a integer sequence with the specific step. <code>end</code> can be
     * samller than <code>start</code> to create a reverse sequence. e.g. (start =
     * 2, end = 5, step = 1) = [2, 3, 4, 5]
     *
     * @param start start integer
     * @param end   end integer
     * @param step  step
     * @return Return a sequence from <code>start</code> to <code>end</code> with
     *         unity step
     */
    public static int[] createSequence(int start, int end, int step) {

        // Get size and step
        int size = 0;
        if (start == end || step == 0) {
            // Start = end or No step
            return new int[] { start };
        } else if (start < end) {
            // End > start

            // Convert -step into +step
            if (step < 0)
                step = -step;

            // Check step
            if (step > end - start) {
                return new int[] { start };
            }
        } else {
            // Start > end, reverse sequence

            // Convert +step into -step
            if (step > 0)
                step = -step;

            // Check step
            if (step < end - start) {
                return new int[] { start };
            }
        }
        size = (int) (Math.floor((end - start) / step) + 1);

        // Generate sequence
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = start + i * step;
        }
        return result;
    }

    /**
     * Create a double sequence with the unity step. <code>end</code> can be samller
     * than <code>start</code> to create a reverse sequence. e.g. (start = 2, end =
     * 5) = [2, 3, 4, 5]
     *
     * @param start start double
     * @param end   end double
     * @return Return a sequence from <code>start</code> to <code>end</code> with
     *         unity step
     */
    public static double[] createSequence(double start, double end) {
        return createSequence(start, end, 1.0);
    }

    /**
     * Create a double sequence with the specific step. <code>end</code> can be
     * samller than <code>start</code> to create a reverse sequence. e.g. (start =
     * 2, end = 5, step = 1) = [2, 3, 4, 5]
     *
     * @param start start double
     * @param end   end double
     * @param step  step
     * @return Return a sequence from <code>start</code> to <code>end</code> with
     *         unity step
     */
    public static double[] createSequence(double start, double end, double step) {

        // Get size and step
        int size = 0;
        if (start == end || step == 0) {
            // Start = end or No step
            return new double[] { start };
        } else if (start < end) {
            // End > start

            // Convert -step into +step
            if (step < 0)
                step = -step;

            // Check step
            if (step > end - start) {
                return new double[] { start };
            }
        } else {
            // Start > end, reverse sequence

            // Convert +step into -step
            if (step > 0)
                step = -step;

            // Check step
            if (step < end - start) {
                return new double[] { start };
            }
        }
        size = (int) (Math.floor((end - start) / step) + 1);

        // Generate sequence
        double[] result = new double[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = start + i * step;
        }
        return result;
    }

    // endregion createSequence

    /**
     * Create a array which elements contained is <code>Double.NaN</code>.
     *
     * @param n The length of array
     * @return Return the array
     * @throws IllegalArgumentException If <code>n &lt;= 0</code>
     */
    public static double[] nans(int n) {
        // Throw Exception
        if (n <= 0)
            throw new IllegalArgumentException("n(" + n + ") must be > 0.");

        double[] result = new double[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = Double.NaN;
        }
        return result;
    }

    /**
     * Remove non-finite value from <code>values</code>
     * 
     * @param values Values
     * @return Return array only contains finite values.
     */
    public static double[] removeNonFinite(double[] values) {
        ArrayList<Double> valuesArray = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            if (Double.isFinite(values[i])) {
                valuesArray.add(values[i]);
            }
        }
        return list2DoubleArr(valuesArray);
    }

    /**
     * Return true if value1 and value2 is equality. Equality means
     * <code>|value1 - value2| &lt; unit of least precision </code>
     * 
     * @param value1 Value 1
     * @param value2 Value 2
     * @return Return true if equal
     */
    public static boolean equals(double value1, double value2) {

        // Calculate ulp
        double ulp1 = (float) value1 == 0.0 ? Math.ulp(value1) : Math.max(Math.ulp((float) value1), Math.ulp(value1));
        double ulp2 = (float) value2 == 0.0 ? Math.ulp(value2) : Math.max(Math.ulp((float) value2), Math.ulp(value2));
        double ulp = 2 * Math.max(ulp1, ulp2);

        if (ulp <= DOUBLE_ZERO_THRESHOLD) {
            ulp = DOUBLE_ZERO_THRESHOLD;
        }

        return approximateEqual(value1, value2, ulp);
    }

    /**
     * Return true if value1 and value2 is equality. Equality means
     * <code>|value1 - value2| &lt; relative error </code>
     * 
     * @param value1        Value 1
     * @param value2        Value 2
     * @param relativeError relativeError in percentage
     * @return Return true if equal
     */
    public static boolean approximateEqualR(double value1, double value2, double relativeError) {

        // Calculate ulp
        double relativeErrorRatio = relativeError / 100.0;
        double relativeError1 = Math.abs(value1) * relativeErrorRatio;
        double relativeError2 = Math.abs(value2) * relativeErrorRatio;
        double eps = 2 * Math.min(relativeError1, relativeError2);

        if (eps <= DOUBLE_ZERO_THRESHOLD) {
            eps = DOUBLE_ZERO_THRESHOLD;
        }

        return approximateEqual(value1, value2, eps);
    }

    /**
     * Return true if value1 and value2 is equality. Equality means
     * <code>|value1 - value2| &lt; 0.01% relative error </code>
     * 
     * @param value1 Value 1
     * @param value2 Value 2
     * @return Return true if equal
     */
    public static boolean approximateEqual(double value1, double value2) {
        return approximateEqualR(value1, value2, 0.01);
    }

    /**
     * Return true if value1 and value2 is approximately equality.
     * 
     * @param value1 Value 1
     * @param value2 Value 2
     * @param eps    epsilon
     * @return Return true if <code>|value1 - value2| &lt; eps</code>
     */
    public static boolean approximateEqual(double value1, double value2, double eps) {

        // Check NaN
        if (Double.isNaN(value1) && Double.isNaN(value2))
            return true;

        // Check exactly equaility, include +Inf and -Inf
        if (value1 == value2)
            return true;

        // Check non-finite,e.g. +Inf != -Inf, Inf != NaN
        if (!Double.isFinite(value1) && !Double.isFinite(value2)) {
            return false;
        }

        // Check zero
        if (Math.abs(value1) <= DOUBLE_ZERO_THRESHOLD && Math.abs(value2) <= DOUBLE_ZERO_THRESHOLD
                && value1 * value2 >= 0) // Same sign
            return true;

        // Check approximately equality
        if (Math.abs(value1 - value2) <= eps) {
            return true;
        } else {
            return false;
        }
    }

    // endregion Numerical

    // region List

    // region List to Array

    /**
     * List to array
     * 
     * @param list Arraylist
     * @return Return the array
     */
    public static byte[] list2ByteArr(List<Byte> list) {
        byte[] result = null;
        if (list != null) {
            result = new byte[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
        }
        return result;
    }

    /**
     * List to array
     * 
     * @param list Arraylist
     * @return Return the array
     */
    public static int[] list2IntArr(List<Integer> list) {
        int[] result = null;
        if (list != null) {
            result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
        }
        return result;
    }

    /**
     * List to array
     * 
     * @param list Arraylist
     * @return Return the array
     */
    public static long[] list2LongArr(List<Long> list) {
        long[] result = null;
        if (list != null) {
            result = new long[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
        }
        return result;
    }

    /**
     * List to array
     * 
     * @param list Arraylist
     * @return Return the array
     */
    public static float[] list2FloatArr(List<Float> list) {
        float[] result = null;
        if (list != null) {
            result = new float[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
        }
        return result;
    }

    /**
     * List to array
     * 
     * @param list Arraylist
     * @return Return the array
     */
    public static double[] list2DoubleArr(List<Double> list) {
        double[] result = null;
        if (list != null) {
            result = new double[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
        }
        return result;
    }

    /**
     * List to array
     * 
     * @param list Arraylist
     * @return Return the array
     */
    public static String[] list2StrArr(List<String> list) {
        String[] result = null;
        if (list != null) {
            result = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
        }
        return result;
    }

    /**
     * List to array
     * 
     * @param list Arraylist
     * @return Return the array
     */
    public static Date[] list2DateArr(List<Date> list) {
        Date[] result = null;
        if (list != null) {
            result = new Date[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
        }
        return result;
    }

    /**
     * List to array
     * 
     * @param list Arraylist
     * @return Return the array
     */
    public static boolean[] list2BoolArr(List<Boolean> list) {
        boolean[] result = null;
        if (list != null) {
            result = new boolean[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
        }
        return result;
    }

    // endregion List to Array

    // region Array to list

    /**
     * Array to list
     * 
     * @param array Array
     * @return Return the list
     */
    public static List<Integer> arr2List(int[] array) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                result.add(array[i]);
            }
        }
        return result;
    }

    /**
     * Array to list
     * 
     * @param array Array
     * @return Return the list
     */
    public static List<Long> arr2List(long[] array) {
        ArrayList<Long> result = new ArrayList<Long>();
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                result.add(array[i]);
            }
        }
        return result;
    }

    /**
     * Array to list
     * 
     * @param array Array
     * @return Return the list
     */
    public static List<Float> arr2List(float[] array) {
        ArrayList<Float> result = new ArrayList<Float>();
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                result.add(array[i]);
            }
        }
        return result;
    }

    /**
     * Array to list
     * 
     * @param array Array
     * @return Return the list
     */
    public static List<Double> arr2List(double[] array) {
        ArrayList<Double> result = new ArrayList<Double>();
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                result.add(array[i]);
            }
        }
        return result;
    }

    /**
     * Array to list
     * 
     * @param array Array
     * @return Return the alist
     */
    public static List<String> arr2List(String[] array) {
        ArrayList<String> result = new ArrayList<String>();
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                result.add(array[i]);
            }
        }
        return result;
    }

    /**
     * Array to list
     * 
     * @param array Array
     * @return Return the list
     */
    public static List<Date> arr2List(Date[] array) {
        ArrayList<Date> result = new ArrayList<Date>();
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                result.add(array[i]);
            }
        }
        return result;
    }

    /**
     * Array to list
     * 
     * @param array Array
     * @return Return the list
     */
    public static List<Boolean> arr2List(boolean[] array) {
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                result.add(array[i]);
            }
        }
        return result;
    }

    // endregion Array to list

    // endregion List
}
