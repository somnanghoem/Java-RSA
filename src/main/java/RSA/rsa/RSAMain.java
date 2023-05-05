package RSA.rsa;

import java.security.PublicKey;

import RSA.rsa.model.RSAKeyPair;
import RSA.rsa.util.RSAUtil;

public class RSAMain {

	public static void main(String[] args) throws Exception {
		
		RSAKeyPair keypair = RSAUtil.generateRSAKey();
		System.out.println(">>>>>>>>>> Private Key  >>>>>>>>>>" + keypair.getPrivateKey() );
		System.out.println(">>>>>>>>>> public Key  >>>>>>>>>>" + keypair.getPublicKey() );
		PublicKey publicKey = RSAUtil.toPublicKey( keypair.getPublicKey() );
		System.out.println(">>>>>>>>>> publicKey >>>>>>>>>>" + publicKey );
		String encrypt = RSAUtil.encryptRSA( "somnang", keypair.getPublicKey() );
		System.out.println(">>>>>>>>>> Encrypt >>>>>>>>>>" + encrypt );
		String decrypt = RSAUtil.decryptRSA(encrypt, keypair.getPrivateKey() );
		System.out.println(">>>>>>>>>> decrypt >>>>>>>>>>" + decrypt );
	}

}
