public class Main {

    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;
        sumDigits(12345);
        sumDigits(10);
        sumDigits(5059191);

        System.out.println("=======================");
        int maxValueInteger = Integer.MAX_VALUE;
        int minValueInteger = Integer.MIN_VALUE;
        short maxValueShort = Short.MAX_VALUE;
        short minValueShort = Short.MIN_VALUE;
        long maxValueLong = Long.MAX_VALUE;
        long minValueLong = Long.MIN_VALUE;
        byte maxValueByte = Byte.MAX_VALUE;
        byte minValueByte = Byte.MIN_VALUE;
        double maxValueDouble = Double.MAX_VALUE;
        double minValueDouble = -Double.MAX_VALUE;
        float maxValueFloat = Float.MAX_VALUE;
        float minValueFloat = -Float.MAX_VALUE;

        System.out.println(maxValueInteger);
        System.out.println(minValueInteger);
        System.out.println(maxValueShort);
        System.out.println(minValueShort);
        System.out.println(maxValueLong);
        System.out.println(minValueLong);
        System.out.println(maxValueByte);
        System.out.println(minValueByte);
        System.out.println(maxValueDouble);
        System.out.println(minValueDouble);
        System.out.println(maxValueFloat);
        System.out.println(minValueFloat);
    }

    public static Integer sumDigits(Integer number) {
        String str = number.toString();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            int tmp = Integer.parseInt(String.valueOf(str.charAt(i)));
            counter = counter + tmp;
        }
        System.out.println(counter);
        return 0;
    }
}
