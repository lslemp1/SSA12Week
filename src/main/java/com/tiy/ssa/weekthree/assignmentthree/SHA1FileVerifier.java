package com.tiy.ssa.weekthree.assignmentthree;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//open file, read byte stream, pass in bytes to update until all have been read, call digest, convert byte array to hex string
//take 2 strings, file and one of algorithms, read file and produce secure message digest. output string that matches download file

public class SHA1FileVerifier {

    File file;
    final MessageDigest sha1;

    public SHA1FileVerifier(File file, String cypher) throws IllegalArgumentException {

        try {
            this.sha1 = MessageDigest.getInstance(cypher);
        } catch (NoSuchAlgorithmException ex) {
            throw new IllegalArgumentException("not a valid cypher");
        }
    }

    public String hash(File file) throws IOException {
        byte[] bytes = new byte[1024];
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file))) 
        {
            int read;
            while ((read = inputStream.read(bytes)) > 0) 
            {
                this.sha1.update(bytes, 0, read);
            }
            byte[] digest = this.sha1.digest();
            return toHex(digest);
        } catch (Exception ex) {

        }
        return "";
    }

    public String toHex(byte[] data) 
    {
        if (data == null)
            return null;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < data.length; i++)
            builder.append(Integer.toString((data[i] & 0xff) + 0x100, 16).substring(1));

        return builder.toString();
    }
 

}
