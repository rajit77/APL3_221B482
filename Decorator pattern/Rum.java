class Rum extends Decorator{
    Rum(Offering offering)
    {
        this.offering=offering;
    }
    int getValue()
    {
        return offering.getValue()+ 45;
    }
    String getName()
    {
        return offering.getName()+"with Rum";
    }
}