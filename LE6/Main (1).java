public class Main
{
	public static void main(String[] args) {
		Offering offering  =new  IceCream();
		offering = new Rum (offering);
// 		offering = new Rum(offering);
		System.out.println(offering.getPrice() + " "+ offering.getName());
	}
}
