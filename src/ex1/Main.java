package ex1;

public class Main {
    public static void main(String[] args) {
        // Kiểm tra method calculateInterest()
        // Khai bao so lieu de kiem tra method
        double money = 4000; // Số tiền vay
        double rate = 12; // Lãi suất vay
        double interest = 0; // Số tiền phải trả
        // Tạo object - class Bank
        Bank ctg = new Bank(money, rate);

        // Tính và in ra kết quả
        interest = ctg.calculateInterest();
        System.out.println("Số tiền phải trả: " + interest);
    }
}
