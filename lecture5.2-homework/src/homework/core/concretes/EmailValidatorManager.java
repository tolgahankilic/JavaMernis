package homework.core.concretes;

import homework.core.abstracts.ValidationService;

public class EmailValidatorManager implements ValidationService {

	@Override
	public void sendMail() {
		System.out.println("Lütfen hesabinizi mail'den dogrulayiniz.");
		
	}

}
