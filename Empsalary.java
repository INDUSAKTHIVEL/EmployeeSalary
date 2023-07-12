package Weeklypay;
class Emp
{
    public double calPay(int salary) 
    {
        return salary*30;
    }
    public double calPay(int hourlyRate,int hrsWrk)
    {
        return hourlyRate*hrsWrk;
    }
}
class Empsalary
{
    public static void main(String[] args) 
    {
        Emp employee=new Emp();
        System.out.println(employee.calPay(10000));
        System.out.println(employee.calPay(5,20));
    }
}