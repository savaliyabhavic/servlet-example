package sessiondemo.authontication;

public class CheckData {

    private static String uName[] = {"bhavik", "milan", "sneha"};
    private static String pName[] = {"bhavik", "milan", "sneha"};

    private CheckData(){}

    public static boolean check(String userName, String password){
        return checkNames(userName,true) && checkNames(password, false);
    }

    private static boolean checkNames(String val, boolean isUserName) {
        String[] names = null;
        boolean isRight= false;

        if (isUserName) names = uName;
        else names = pName;

        for (String useN : names) {
            if (useN.equals(val)) isRight = true;
        }
        return isRight;
    }

}
