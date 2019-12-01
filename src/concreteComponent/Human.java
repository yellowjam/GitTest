package concreteComponent;
import component.Character;;
public class Human implements Character{

	private int attack=10;
	private int defence=10;
	@Override
	public int showAttack() {
		// TODO Auto-generated method stub
		return attack;
	}
	@Override
	public int showDefence() {
		// TODO Auto-generated method stub
		return defence;
	}

}
