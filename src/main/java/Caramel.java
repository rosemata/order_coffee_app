
public class Caramel extends CoffeeDecorator{

private double cost = .50;
	
	Caramel(Coffee specialCoffee){
		super(specialCoffee);
	}
	
	public double makeCoffee() {
		return specialCoffee.makeCoffee()+ addCaramel();
	}
	
	private double addCaramel() {
		
		System.out.println(" + caramel: $.50");
		
		return cost;
	}
}
