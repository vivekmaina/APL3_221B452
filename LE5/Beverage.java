abstract class Beverage{
    void Pour(int Quantity){
        System.out.println("Pour" + Quantity+"ml of Beverage");
    }
    protected abstract void  addCondiment();
    protected void Stir(){}
    private void Serve(){
        System.out.println("Serve to waiter");
    }
    public void templateMethod(int Quantity){
        Pour(Quantity);
        addCondiment();
        Stir();
        Serve();
    }
    
}