/*
    Copyright © Shubham Prasad. All Rights Reserved.
    Licensed under the GNU GPL license.
    https://github.com/shu6hamprasad/
    IDE Used: IntelliJ IDEA Ultimate 2021.2
*/

class StringLib {
    StringLib() {
    }

    public static char charAt(String x, int i) {
        char[] c = toCharArray(x);
        return c[i];
    }

    public static char[] toCharArray(String s) {
        char[] f = new char[s.length()];

        for(int i = 0; i < s.length(); ++i) {
            f[i] = s.charAt(i);
        }

        return f;
    }

    public static String toUpperCase(String x) {
        char[] xArr = x.toCharArray();

        for(int i = 0; i < xArr.length; ++i) {
            if (xArr[i] >= 'a' && xArr[i] <= 'z') {
                xArr[i] = (char)(xArr[i] - 32);
            }
        }

        return String.valueOf(xArr);
    }

    public static String toLowerCase(String x) {
        char[] xArr = x.toCharArray();

        for(int i = 0; i < xArr.length; ++i) {
            if (xArr[i] >= 'A' && xArr[i] <= 'Z') {
                xArr[i] = (char)(xArr[i] + 32);
            }
        }

        return String.valueOf(xArr);
    }

    public static int indexOf(String s, char c) {
        int out = -1;

        for(int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == c) {
                out = i;
                break;
            }
        }

        return out;
    }

    public static int indexOf(String str, String substr) {
        int strlen = str.length();
        int substrlen = substr.length();
        int count = 0;
        int substrlen2 = substr.length();
        if (substrlen >= 1) {
            for(int i = 0; i < strlen - substrlen + 1; ++i) {
                String A = subString(str, i, substrlen2);
                if (equalsIgnoreCase(A, substr)) {
                    return count + 1;
                }

                ++count;
                ++substrlen2;
            }

        }
        return -1;
    } //Not my function. Taken from StackOverflow.

    public static int lastIndexOf(String s, char c) {
        int out = -1;

        for(int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == c) {
                out = i;
            }
        }

        return out;
    }

    public static String concat(String x, String y) {
        String out = x + y;
        return out;
    }

    public static boolean equalsIgnoreCase(String x, String y) {
        return equals(toLowerCase(x), toLowerCase(y));
    }

    public static boolean equals(String x, String y) {
        boolean out = false;
        if (x.length() < y.length()) {
            return false;
        } else if (y.length() < x.length()) {
            return false;
        } else {
            int check = 0;

            for(int i = 0; i < x.length(); ++i) {
                if (x.charAt(i) == y.charAt(i)) {
                    ++check;
                }
            }

            if (check == x.length()) {
                out = true;
            }

            return out;
        }
    }

    public static String subString(String s, int x) {
        return subString(s, x, s.length());
    }

    public static String subString(String s, int x, int y) {
        StringBuilder out = new StringBuilder();

        for(int i = x; i < y; ++i) {
            out.append(s.charAt(i));
        }

        return out.toString();
    }

    public static boolean startsWith(String x, String y) {
        boolean out = false;
        int l = y.length();
        if (subString(x, l) == y) {
            out = true;
        }

        return out;
    }

    public static boolean startsWith(String s, char c) {
        return s.charAt(0) == c;
    }

    public static boolean endsWith(String s, char c) {
        return s.charAt(s.length() - 1) == c;
    }

    public static boolean endsWith(String x, String y) {
        boolean out = false;
        int l = x.length() - y.length();
        if (equals(subString(x, l), y)) {
            out = true;
        }

        return out;
    }

    public static String reverse(String s) {
        StringBuilder out = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; --i) {
            out.append(s.charAt(i));
        }

        return out.toString();
    }

    public static boolean palindrome(String s) {
        boolean out = false;
        if (equals(s, reverse(s))) {
            out = true;
        }

        return out;
    }

    public static boolean palindromeIgnoreCase(String s) {
        return palindrome(toLowerCase(s));
    }

    public static String replace(String s, char x, char y) {
        char[] c = toCharArray(s);

        for (int i = 0; i < c.length; i++) {
            if (c[i] == x) {
                c[i] = y;
            }
        }

        return String.valueOf(c);
    }
    
}
