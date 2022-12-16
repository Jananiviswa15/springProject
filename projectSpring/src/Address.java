
public class Address implements AddressInter{
private String ownerOftheBuilding;

/*@Value("4545")
int pinmcode;
@Value("jaipur")
 * String city;
 * @Value("rajasthan")
 * String state;
 */
	public void displayAddress() {
		System.out.println("i am displaying adrs"+ownerOftheBuilding);
	}
	public void setOwnerOftheBuilding(String ownerOftheBuilding) {
		this.ownerOftheBuilding = ownerOftheBuilding;
	}
}
