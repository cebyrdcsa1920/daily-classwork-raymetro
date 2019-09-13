public class CarRunner
{
    public static void main(String[] args)
    {
        Car myMustang = new Car();
        //System.out.println(myMustang);
        myMustang.drive(10.5);
        System.out.println(myMustang.getAmountOfgas());
        myMustang.drive(100.5);
        System.out.println(myMustang.getAmountOfGas());
        myMustang.fillupGasTank(9);

    }
}
