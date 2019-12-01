package concreteDecorator;

import component.Character;
import decorator.decorator;

public class Weapen extends decorator{
	private Character character=null;
	private int attack=20;
	private int defence=0;
	public Weapen(Character character) {
		this.character=character;
	}
	public int showAttack() {
		// TODO Auto-generated method stub
		return attack+character.showAttack();
	}
	public int showDefence() {
		// TODO Auto-generated method stub
		return defence+character.showDefence();
	}
}
