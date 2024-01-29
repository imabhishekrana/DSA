public class getSubstring {
    public static void main(String[] args) {
        String str = "HelloWorld";
        subString(str, 3, 6);
    }

    public static void subString(String str, int si, int ei){
        String subStr = "";

        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }

        System.out.println(subStr);
    }
}
