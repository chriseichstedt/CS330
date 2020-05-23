package Characters;
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

public abstract class Character {

	Weapons weapon;
	Orders order;

	public void setWeapon(Weapons newWeapon) {
		this.weapon = newWeapon;
	}
	
	public void setOrder(Orders newOrder) {
		this.order = newOrder;
	}
	
	public void useWeapon() {
		weapon.Attack();
	}
	
	public void useOrder() {
		order.followOrders();
	}

}
