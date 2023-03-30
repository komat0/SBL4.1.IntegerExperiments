public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;

        sumDigits(12345);
        sumDigits(10);
        sumDigits(5059191);
    }

    public static Integer sumDigits(Integer number)
    {
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
