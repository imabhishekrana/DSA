public class getShortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getPath(str));
    }

    public static double getPath(String str){
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            }

            else if (str.charAt(i) == 'S') {
                y--;
            }

            else if (str.charAt(i) == 'E') {
                x++;
            }

            else if (str.charAt(i) == 'W') {
                x--;
            }
        }
        double ans = Math.pow(x, 2) + Math.pow(y, 2);
        double ans1 = Math.sqrt(ans);
        return ans1;
    }
}
