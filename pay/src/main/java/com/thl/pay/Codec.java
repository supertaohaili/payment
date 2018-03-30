package com.thl.pay;

import android.util.Base64;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

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
