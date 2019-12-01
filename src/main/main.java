package main;

import component.Character;
import concreteComponent.Human;
import concreteDecorator.Armour;
import concreteDecorator.Furious;
import concreteDecorator.Gigantize;
import concreteDecorator.Weapen;

public class main {
	public static void main(String[] args) {
		Character character1=new Human();
		System.out.println("原始状态 "+"攻击力:"+character1.showAttack()+" 防御力:"+character1.showDefence());
		Character character2=new Human();
		character2 = new Armour(character2);
		character2 = new Weapen(character2);
		character2 = new Gigantize(character2);
		System.out.println("Armour Weapen Gigantize "+"攻击力:"+character2.showAttack()+" 防御力:"+character2.showDefence());
		Character character3=new Human();
		character3 = new Armour(character3);
		character3 = new Weapen(character3);
		character3 = new Furious(character3);
		System.out.println("Armour Weapen Furious "+"攻击力:"+character3.showAttack()+" 防御力:"+character3.showDefence());
	}
}
