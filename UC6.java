public class UC6{
    public static String[] getoPattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            "*      * ",
            "  *****  "
        };
    }
    public static String[] getpPattern() {
        return new String[] {
            "******** ",
            "*       *",
            "*       *",
            "******** ",
            "*        ",
            "*        ",
            "*        "
        };
    }
    public static String[] getsPattern() {
        return new String[]{
            "******** ",
            "*        ",
            "*        ",
            "******** ",
            "       * ",
            "       * ",
            "******** "};
    }
    public static void main(String[] args){
        String[] oPattern = getoPattern();
        String[] pPattern = getpPattern();
        String[] sPattern = getsPattern();
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }   
}
