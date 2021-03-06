package abstractfactory.lab;

import java.util.List;

public class GiftPack {
	private List<GiftItem> giftItems;
	private Address shippingAddress;
	private PackType packType; //"Business", "Adults", or "Kids"
	public List<GiftItem> getGiftItems() {
		return giftItems;
	}
	public void setGiftItems(List<GiftItem> giftItems) {
		this.giftItems = giftItems;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public PackType getPackType() {
		return packType;
	}
	public void setPackType(PackType packType) {
		this.packType = packType;
	}
	
}
