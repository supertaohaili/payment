package com.android.pay;

import android.util.Base64;

public class Codec {

    public static class BASE64 {

        private static String Key = "dGFvaGFpbGk=";
        private static String Key2 = "Z3h1dA==";

        public static String encodeToString(String text) {
            StringBuffer buf = new StringBuffer();
            buf.append(Key);
            buf.append(text);
            buf.append(Key2);
            return Base64.encodeToString(buf.toString().getBytes(), Base64.DEFAULT);
        }

        public static String decodeToString(String text) {
            String pass = new String(Base64.decode(text, Base64.DEFAULT));
            String replace = pass.replace(Key, "");
            String replace2 = replace.replace(Key2, "");
            return replace2;
        }
    }

}
