public class toUpperCase {
    public static void main(String[] args) {
        String str = "hi, i am shradha ";
        System.out.println(toUppercase(str));
    }

    public static String toUppercase(String str){

        // Taking new StringBuilder
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {

            // If in the case where we give a str in which last element has a space, then there we need to stop coz, after that we dont have any element to append so to avoid this problem (Index out of bound) we stop at the last alphabet/number/whatever has been given.
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
return sb.toString();

    }
}
