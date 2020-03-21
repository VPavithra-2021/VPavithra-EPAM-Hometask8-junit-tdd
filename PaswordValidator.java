package EPAMHometask.junittdd;

public class PaswordValidator {

	public boolean isValid(String Password) {
		// TODO Auto-generated method stub
		if(Password.length()>=5 && Password.length()<=10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
