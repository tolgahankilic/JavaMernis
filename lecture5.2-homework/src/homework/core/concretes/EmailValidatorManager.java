package homework.core.concretes;

import homework.core.abstracts.ValidationService;

public class EmailValidatorManager implements ValidationService {

	@Override
	public void sendMail() {
		System.out.println("L�tfen hesabinizi mail'den dogrulayiniz.");
		
	}

}
