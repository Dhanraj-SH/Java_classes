
class Understanding_object{
    int x=10;
    static int y=20;
    void Digit(int n){
        x=n;
        y=n;
    }
    public static void main(String[] args) {
    First o1= new First();
    First o2= new First();
    First o3= new First();
    o1.Digit(50);
    o2.Digit(60);
    o3.Digit(70);
    System.out.println(o1.x+" "+o2.x+" "+o3.x+" ");
    System.out.println(o1.y+" "+o2.y+" "+o3.y+" ");
    }
}