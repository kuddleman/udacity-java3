package exceptionExample;

public class Phone {
    String phoneType;
    String phoneNumber;

    public Phone(String phoneType, String phoneNumber) {
        if (phoneNumber == null || phoneType == null) {
            throw new IllegalArgumentException("The type and number cannot be null");
        }
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneType='" + phoneType + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
