package NordPost;

import java.util.Objects;

public class TrackingDocument {
	private String packageNumber;
	private String shipmentNumber;
	private String numberOfPackages;
	private String senderReference;
	private String productName;
	private String weight;
	private String measurements;
	private String sender;
	private String recipient;
	private String deliveryAddress;
	private String latestStatusDate;
	private String latestStatus;

	@Override
	public String toString() {
		return "TrackingDocument{" + "packageNumber='" + packageNumber
			+ '\'' + ", shipmentNumber='" + shipmentNumber + '\''
			+ ", numberOfPackages='" + numberOfPackages + '\'' +
			", senderReference='" + senderReference + '\'' + ", "
			+ "productName='" + productName + '\'' + ", weight='"
			+ weight + '\'' + ", measurements='" + measurements +
			'\'' + ", sender='" + sender + '\'' + ", recipient='"
			+ recipient + '\'' + ", deliveryAddress='" +
			deliveryAddress + '\'' + ", latestStatusDate='" +
			latestStatusDate + '\'' + ", latestStatus='" +
			latestStatus + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TrackingDocument that = (TrackingDocument) o;
		return Objects.equals(packageNumber, that.packageNumber) &&
			Objects.equals(shipmentNumber, that.shipmentNumber) &&
			Objects.equals(numberOfPackages, that
				.numberOfPackages) && Objects.equals
			(senderReference, that.senderReference) && Objects
			.equals(productName, that.productName) && Objects
			.equals(weight, that.weight) && Objects.equals
			(measurements, that.measurements) && Objects.equals
			(sender, that.sender) && Objects.equals(recipient,
			that.recipient) && Objects.equals(deliveryAddress,
			that.deliveryAddress) && Objects.equals
			(latestStatusDate, that.latestStatusDate) && Objects
			.equals(latestStatus, that.latestStatus);
	}

	@Override
	public int hashCode() {

		return Objects.hash(packageNumber, shipmentNumber,
			numberOfPackages, senderReference, productName,
			weight, measurements, sender, recipient,
			deliveryAddress, latestStatusDate, latestStatus);
	}

	public String getPackageNumber() {
		return packageNumber;
	}

	public void setPackageNumber(String packageNumber) {
		this.packageNumber = packageNumber;
	}

	public String getShipmentNumber() {
		return shipmentNumber;
	}

	public void setShipmentNumber(String shipmentNumber) {
		this.shipmentNumber = shipmentNumber;
	}

	public String getNumberOfPackages() {
		return numberOfPackages;
	}

	public void setNumberOfPackages(String numberOfPackages) {
		this.numberOfPackages = numberOfPackages;
	}

	public String getSenderReference() {
		return senderReference;
	}

	public void setSenderReference(String senderReference) {
		this.senderReference = senderReference;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getMeasurements() {
		return measurements;
	}

	public void setMeasurements(String measurements) {
		this.measurements = measurements;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getLatestStatusDate() {
		return latestStatusDate;
	}

	public void setLatestStatusDate(String latestStatusDate) {
		this.latestStatusDate = latestStatusDate;
	}

	public String getLatestStatus() {
		return latestStatus;
	}

	public void setLatestStatus(String latestStatus) {
		this.latestStatus = latestStatus;
	}
}
