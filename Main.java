
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;


public class Main {
	private static KeyPair key=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gen();
		byte[] enc=encrytion("hello world",key.getPublic());	
		System.out.println(decryption(enc,key.getPrivate()));
		
	}
	public static void gen() {
		KeyPairGenerator keygen =null;
		try
		{
			keygen=KeyPairGenerator.getInstance("RSA");
		}catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		keygen.initialize(1024);
		key =keygen.generateKeyPair();
	}
	public static byte[] encrytion(String message,PublicKey pk	) {
		Cipher cipher=null;
		try {
			cipher = cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, pk);
		} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] chiffrat = null;
		try {
		 chiffrat= cipher.doFinal(message.getBytes());
		} catch (IllegalBlockSizeException | BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return chiffrat;
	}
	public static String decryption(byte[] chiffrat,PrivateKey sk) {
		byte[] dec=null;
		Cipher cipher = null;
		try {
			cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.DECRYPT_MODE, sk);
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchPaddingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dec = cipher.doFinal(chiffrat);
		} catch (IllegalBlockSizeException | BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new String(dec);
	}

}
