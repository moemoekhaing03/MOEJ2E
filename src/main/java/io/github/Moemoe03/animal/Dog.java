package io.github.Moemoe03.animal;

public class Dog implements Animal, IRun {

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Dog sleep at home");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog eat meat");
	}

	@Override
	public void sex() {
		// TODO Auto-generated method stub
		System.out.println("Dog also have Male or Female");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Yes Dog can run");
	}
	
}