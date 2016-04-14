package Sternbuck;
public class Mocha extends CondimentDecorator{
	Beverage b;
	
	public Mocha(Beverage b) {
		this.b = b;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return b.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.20 + b.cost();
	}
	
}
