package calculator;

public class Calculator {
    public double number1;
    public double number2;

    public Calculator(){

    }

    
    public String  addition() {
        return "number1 + number2 is : " + (number1+number2);

    }

    public double subtraction()
    {
        return (number1 - number2);
    }

    public double division()
    {
        return (number1/number2);
    }

    public double multiplication()
    {
        return (number1*number2);
    }

    public double inverse (){
        return (number1 - number1);
    }

    public double mPlusKey () {
        double storedmemory = number1;
        return storedmemory;
    }

    public void  mcKey (){
        return;
    }



    public double square()
    {
        return  Math.pow(number1,2);
    }

    public double squareRoot() {
        return  Math.sqrt(number1);
    }

    public double calculateSin()
    {
        return (Math.sin(Math.toRadians(number1)));
    }

    public double calculateCosine ()
    {
        return  (Math.cos(Math.toRadians(number1)));
    }


    public  double calculateTangent()
    {
            return (Math.tan(Math.toRadians(number1)));
    }

    public double calculateInverseSine (){
        return Math.asin(Math.toRadians(number1));
    }

    public double calculateInverseCosine (){
        return Math.acos(Math.toRadians(number1));
    }

    public double calculateInverseTangent (){
        return Math.atan(Math.toRadians(number1));
    }


    public double factorial(){

        long factorial = 1;
        for(int i = 1; i <= number1; ++i)
        {

              factorial *= i;
        }

        return factorial;
    }






    //=======================================
}
