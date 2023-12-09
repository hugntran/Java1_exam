package ex2;

public class Flight {
    //Thuộc tính number(int), destination(String)
    private int number;
    private String destination;

    //Constructor không tham số - Yêu cầu: flight destination is empty and flight number is 0
    public Flight() {
        this.number = 0;
        this.destination = "";
    }

    //Constructor có tham số
    //Yêu cầu: assign number field equal to number parameter and destination field equal to destination parameter
    public Flight(int number, String destination) {
        if (number > 0) {        //The flight number should be positive-valued
            this.number = number;
            this.destination = destination;
        } else {                //If the object receives a valid number and a string, the object accepts both
            this.number = 0;
            this.destination = "";
        }
    }

    //String getDestination() - Sử dụng Getter
    public String getDestination() {
        return destination;
    }

    //int getNumber() - Sử dụng Getter
    public int getNumber() {
        return number;
    }

    //void display() - hiển thị thông tin chuyến bay
    public void display() {
        System.out.println(getNumber() + " , " + getDestination());
    }
}
