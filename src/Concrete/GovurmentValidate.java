package Concrete;
import Abstract.ValidateServices;
import Entities.Player;

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
