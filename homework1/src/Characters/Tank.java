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

public class Tank extends Character{
	public Tank() {
		this.weapon = new Cannon();
		this.order = new Attack();
	}
}
