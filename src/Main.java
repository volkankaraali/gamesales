import Concrete.CampingManager;
import Concrete.GameManager;
import Concrete.GovurmentValidate;
import Concrete.PlayerManager;
import Concrete.SalesManager;
import Entities.Camping;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Player player1= new Player(1,"volkan","karaali","12345678911",1997);
		
		PlayerManager playerManager=new PlayerManager(new GovurmentValidate());
		
		playerManager.add(player1);
		playerManager.delete(player1);
		playerManager.update(player1);
		
		System.out.println("**********");
		
		CampingManager campingManager=new CampingManager();
		
		Camping camping1=new Camping(1,"50% Ưndirim",50);
		
		campingManager.add(camping1);
		
		System.out.println("**********");
		
		GameManager gameManager=new GameManager();
		Game game1=new Game(1,"CSGO",50);
		gameManager.add(game1);
		
		System.out.println("**********");
		
		
		SalesManager salesManager=new SalesManager();
		
		salesManager.sales(player1, camping1, game1);
	}

}
