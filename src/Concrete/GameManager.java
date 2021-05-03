package Concrete;
import Abstract.GameServices;
import Entites.Game;

public class GameManager implements GameServices{

	@Override
	public void add(Game game) {
		System.out.println("oyun ekleme basarili: "+game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("oyun silme basarili: "+game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("oyun güncelleme basarili: "+game.getName());
		
	}

}
