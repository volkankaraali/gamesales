package Concrete;
import Abstract.ValidateServices;
import Entites.Player;

public class GovurmentValidate implements ValidateServices{

	@Override
	public boolean validate(Player player) {
		if(player.getIdentityNo().length()==11) {
			return true;
		}else {
			return false;
		}
		
	}

}
