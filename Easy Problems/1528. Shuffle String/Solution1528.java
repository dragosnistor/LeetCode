public class Solution1528 {
    
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indeces = new int[]{4,5,6,7,0,2,1,3};
        String ans = restoreString(s, indeces);
        System.out.println(ans);
    }

    static public String restoreString2(String s, int[] indices) {
        StringBuilder ans = new StringBuilder(s);
        
        for (int i = 0; i < indices.length; i++) {
            ans.setCharAt(indices[i], s.charAt(i));
        }
        return ans.toString();
    }

    // Consumes way less memory than the above solution
    static public String restoreString(String s, int[] indices) {
        char[] temp = new char[indices.length];
        
        for (int i = 0; i < indices.length; i++) {
            temp[indices[i]] = s.charAt(i);
        }
        return new String(temp);
    }


}
