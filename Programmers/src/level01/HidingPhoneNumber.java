package level01;

public class HidingPhoneNumber {
    public String solution(String phoneNumber) {
        int length = phoneNumber.length();
        String coveredNumber = phoneNumber.substring(0, length - 4).replaceAll("[0123456789]", "*");
        String uncoveredNumber = phoneNumber.substring(length - 4, length);
        return coveredNumber + uncoveredNumber;
    }

    public static void main(String[] args) {
        String phoneNumber = "01033334444";
        String phoneNumber2 = "027778888";

        HidingPhoneNumber hidingPhoneNumber = new HidingPhoneNumber();
        System.out.println(hidingPhoneNumber.solution(phoneNumber));
        System.out.println(hidingPhoneNumber.solution(phoneNumber2));
    }
}
