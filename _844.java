public class _844 {
    public static boolean backspaceCompare(String s, String t) {
        return sb(s).equals(sb(t));
    }

    private  static String sb(String str) {
        StringBuilder sbr = new StringBuilder();

        for (char c : str.toCharArray()) {

            if (c != '#') {
                sbr.append(c);
            } else if (sbr.length() != 0) {
                sbr.deleteCharAt(sbr.length() - 1);
            }
        }
        return sbr.toString();

    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));

}
}
