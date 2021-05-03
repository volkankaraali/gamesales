package Concrete;
import Abstract.PlayerServices;
import Abstract.ValidateServices;
import Entities.Player;

public class PlayerManager implements PlayerServices{

	ValidateServices validateServices;
	
	public PlayerManager(ValidateServices validateServices) {
		this.validateServices = validateServices;
	}

	@Override
	public void add(Player player) {
		if(validateServices.validate(player)==true) {
			System.out.println("ekleme basarili: "+player.getFirstName());
		}else {
			System.out.println("islem basarisiz.");
		}
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName()+" silindi.");
		
	}

	@Override
	public void update(Player player) {
		System.out.println("güncelleme basarili:" + player.getFirstName());
		
	}


}
