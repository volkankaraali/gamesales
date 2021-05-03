package Concrete;

import Abstract.CampingServices;
import Entities.Camping;

public class CampingManager implements CampingServices{

	@Override
	public void add(Camping camping) {
		System.out.println("kampanya eklendi: "+camping.getName()+", kampanya tutarý: "+camping.getDiscount() );
		
	}

	@Override
	public void delete(Camping camping) {
		System.out.println("kampanya silindi: "+camping.getName());
		
	}

	@Override
	public void update(Camping camping) {
		System.out.println("kampanya güncellendi: "+camping.getName());
		
	}

}
