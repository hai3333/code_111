package project__001;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cc {
    private static Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
                System.out.print("选择错误，请重新输入: ");
            } else break;
        }
        return c;
    }


    public static char readChar() {
        char sex;
        String str;
        //String str=readKeyBoard(1,false);
        //return str.charAt(0);
        for (; ; ) {
            str = readKeyBoard(1, false);
            if (str.equals("男")) {
                sex = '男';
                break;
            } else if (str.equals("女")) {
                sex = '女';
                break;
            } else {
                System.out.println("性别输入错误，请重新输入(男或女):");
            }
            //return str.charAt(0);
            //return sex;
        }
        return sex;
    }


    public static char readChar(char defaultValue) {
        String str;
        char sex;
        //return (str.length()==0)?defaultValue:str.charAt(0);
        for (; ; ) {
            str = readKeyBoard(1, true);
            if (str.length() == 0) {
                sex = defaultValue;
                break;
            }
            if (str.equals("男")) {
                sex = '男';
                break;
            } else if (str.equals("女")) {
                sex = '女';
                break;
            } else {
                System.out.println("性别输入错误，请重新输入(男或女):");
            }
        }
        return sex;
    }

    /*
     * 用于确认选择的输入。
     * 该方法从键盘读取‘Y’或‘N’，并将其作为方法的返回值。
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("选择错误，请重新输入: ");
            }
        }
        return c;
    }


    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入: ");
            }
        }
        return n;
    }

    public static int readInt(int defaultValue) {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, true);
            if (str.equals("")) {
                return defaultValue;
            }
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入: ");
            }
        }
        return n;
    }


    /*
     *
     * 该方法从键盘读取一个不超过limit长度的字符串，并将其作为方法的返回值。
     */
    public static String readString(int limit) {
        return readKeyBoard(limit, false);
    }


    public static String readString(int limit, String defaultValue) {
        String str = readKeyBoard(limit, true);
        return str.equals("") ? defaultValue : str;
    }

    //判断邮箱格式是否正确
    public static boolean isEmail(String string) {
        if (string == null)
            return false;
        String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern p;
        Matcher m;
        p = Pattern.compile(regEx1);
        m = p.matcher(string);
        if (m.matches())
            return true;
        else
            return false;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度(不大于" + limit + ")");
                continue;
            }
            break;
        }
        return line;
    }
}



