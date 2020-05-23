import Characters.Grunt;
import Characters.Tank;
import Characters.Character;
import Orders.Attack;
import Orders.Defend;
import Orders.Flee;
import Orders.Orders;
import Orders.SelfDestruct;
import Weapons.Axe;
import Weapons.Cannon;
import Weapons.Laser;
import Weapons.Pistol;
import Weapons.Rocket;
import Weapons.Weapons;

public class RealTimeStrategy {
	public static void main(String[] args) {
		Character p1 = new Grunt();
		Character p2 = new Tank();
		
		//use default orders and weapons
		p1.useOrder();
		p2.useOrder();
		
		p1.useWeapon();
		p2.useWeapon();
		
		//set new orders and weapons
		p1.setOrder(new Defend());
		p2.setOrder(new SelfDestruct());
		
		p1.useOrder();
		p2.useOrder();
		
		p1.setWeapon(new Pistol());
		p2.setWeapon(new Laser());
		
		p1.useWeapon();
		p2.useWeapon();
	}

}
