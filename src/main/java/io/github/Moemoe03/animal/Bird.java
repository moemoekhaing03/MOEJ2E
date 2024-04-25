package io.github.Moemoe03.animal;


public class Bird implements Animal, IFly {

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Bird sleep at the top of tree");		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Bird eat inserts");
	}

	@Override
	public void sex() {
		// TODO Auto-generated method stub
		System.out.println("Bird is Male or Female");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Yes , Bird can fly");
	}

}
