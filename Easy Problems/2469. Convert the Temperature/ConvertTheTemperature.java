public class ConvertTheTemperature {

    public static void main(String[] args) {
        double celsius = 36.50;
        double[] ans = convertTemperature(celsius);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

    static public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;
        return ans;
    }

}
