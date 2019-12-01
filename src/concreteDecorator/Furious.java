	package concreteDecorator;

		import component.Character;
		import decorator.decorator;

	public class Furious extends decorator{

		private Character character=null;
		public Furious(Character character) {
			this.character=character;
		}
		public int showAttack() {
			// TODO Auto-generated method stub
			return character.showAttack()*3;
		}
		public int showDefence() {
			// TODO Auto-generated method stub
			return character.showDefence()/2;
		}


	}
