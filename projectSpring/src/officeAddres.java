import org.springframework.beans.factory.annotation.Value;

public class officeAddres implements AddressInter {
	
	@Value("amazon")
	private String ownerOftheBuilding;
	public void displayAddress() {
		System.out.println("i am displaying offcie adrs"+ownerOftheBuilding);
	}
	public void setOwnerOftheBuilding(String ownerOftheBuilding) {
		this.ownerOftheBuilding = ownerOftheBuilding;
	}
}
