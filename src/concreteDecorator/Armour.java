
package concreteDecorator;
import component.Character;
import decorator.decorator;
public class Armour extends decorator{

		private Character character=null;
		private int attack=0;
		private int defence=20;
		public Armour(Character character) {
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
