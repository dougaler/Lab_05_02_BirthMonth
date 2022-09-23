public class BirthMonth {
    public static void main(String[] args) {
        int month = 3;
        if(month >= 1 & month <=12) {
            System.out.println("Your birth month is "+month);
        }else{
            System.out.println("Tou entered an incorrect month: " + month);
        }
    }
}