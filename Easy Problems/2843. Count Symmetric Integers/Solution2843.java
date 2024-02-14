public class Solution2843 {
    
    public static void main(String[] args) {
        int low = 1;
        int high = 100;
        int ans = countSymmetricIntegers4(low, high);
        System.out.println(ans);
    }

    static public int countSymmetricIntegers(int low, int high) {
        int ans = 0;

        for (int i = low; i <= high; i++){
            int len = (int) Math.log10(i) + 1;
            if (len % 2 != 0) {
                continue;
            } else if (len == 2 && (i % 10) == ((i % 100)/10)) {
                ans++;
            } else if (len == 4 && ((i % 10) + ((i % 100)/10) == (((i % 1000)/100) + ((i % 10000)/1000)))){
                ans++;
            }
        }
        return ans;
    }

    static public int countSymmetricIntegers2(int low, int high) {
        int ans = 0;

        for (int i = low; i <= high; i++){
            StringBuilder sb = new StringBuilder(Integer.toString(i));
            if (sb.length() % 2 != 0) {
                continue;
            } else if (sb.length() == 2 && (int) sb.charAt(0) == (int) sb.charAt(1)) {
                ans++;
            } else if (sb.length() == 4 && ((int) sb.charAt(0) + (int) sb.charAt(1)) == ((int) sb.charAt(2) + (int) sb.charAt(3))){
                ans++;
            }
        }
        return ans;
    }

    static public int countSymmetricIntegers3(int low, int high) {
        int ans = 0;

        for (int i = low; i <= high; i++){
            int len = (int) Math.log10(i) + 1;
            if (len % 2 != 0) {
                continue;
            } 
            int first = i % 10;
            int second = (i % 100)/10;
            int third = (i % 1000)/100;
            int fourth = (i % 10000)/1000;

            if (len == 2) {
                if ((first) == (second)) {
                ans++;
                }
            } else if (len == 4) {
                if ((first + second) == (third + fourth)){
                ans++;
                }
            }
        }
        return ans;
    }

    static public int countSymmetricIntegers4(int low, int high) {
        int ans = 0;

        while (low <= high){
            if (low >= 10 && low <= 99) {
                if (low % 10 == low /10) {
                    ans++;
                } 
            } else if (low >= 1000 && low <= 9999) {
                int first = low / 100;
                int second = low % 100;
                if (first % 10 + first / 10 == second % 10 + second / 10){
                    ans++;
                } 
            }
            low++;
        }
        return ans;
    }


    static public int countSymmetricIntegers5(int low, int high) {
        int ans = 0;

        for (int i = low; i <= high; i++){
            if (i >= 10 && i <=99) {
                if ((i % 10) == ((i % 100)/10)) {
                    ans++;
                }
            } else if (i >= 1000 && i <=9999) {
                if ((i % 10) + ((i % 100)/10) == (((i % 1000)/100) + ((i % 10000)/1000))){
                    ans++;
                }
            }
        }
        return ans;
    }

}
