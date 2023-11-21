public class FindTheMaximumAchievableNumber {

    public static void main(String[] args){
        int num = 3;
        int t = 2;
        int ans = theMaximumAchievableX(num, t);
        System.out.println(ans);
    }

    static public int theMaximumAchievableX(int num, int t) {
        return num + (t * 2);
    }

    
}
