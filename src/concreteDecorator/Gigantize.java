
package concreteDecorator;
import component.Character;
import decorator.decorator;
public class Gigantize extends decorator{

		private Character character=null;
		public Gigantize(Character character) {
			this.character=character;
		}
		public int showAttack() {
			// TODO Auto-generated method stub
			return character.showAttack()*2;
		}
		public int showDefence() {
			// TODO Auto-generated method stub
			return character.showDefence()*2;
		}
	

}
