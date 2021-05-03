package Concrete;
import Abstract.SalesServices;
import Entities.Camping;
import Entities.Game;
import Entities.Player;

public class SalesManager implements SalesServices{

	@Override
	public void sales(Player player, Camping camping, Game game) {
		
		System.out.println("Oyuncu ismi: "+player.getFirstName());
		System.out.println("Oyun adi: "+game.getName());
		System.out.println("Oyun ücreti: "+game.getPrice());
		System.out.println("Kampanya ücreti: "+camping.getDiscount());
		
		float lastPrice= game.getPrice()-(game.getPrice()*camping.getDiscount()/100);
		System.out.println("Ödenecek tutar: "+lastPrice);
	}

}
