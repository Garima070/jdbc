class Vehicle{
    void car()
    {
        System.out.println("vehicle");
    }
}
class Examples extends Vehicle{
        void run()
        {
            System.out.println("chgadj");
        }
    public static void main(String[] args)
    {
        Examples b=new Examples();
        b.run();
    }
}