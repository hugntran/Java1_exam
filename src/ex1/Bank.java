package ex1;

public class Bank {
    //Thuộc tính
    private double balance;
    private double rate;

    //Constructor có tham số
    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    // Method calculateInterest() - Tính interest, trả về kiểu dữ liệu double
    public double calculateInterest(){
        double interest = balance * (rate / 1200);
        return interest;
    }
}

