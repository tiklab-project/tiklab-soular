package io.tiklab.eas.updatesql;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UuidChangeUntil {

    private static final int LENGTH_8 = 8;

    private static final int LENGTH_12 = 12;


    public static String convertTo8Bit(String uuid,int length) {
        BigInteger uuidInteger = new BigInteger(uuid, 16);
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        byte[] digest = md5.digest(uuidInteger.toByteArray());
        String hash = new BigInteger(1, digest).toString(16);
        return hash.substring(0, length);
    }


}
