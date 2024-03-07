package ejemplo8;

interface x{
    int sumar(int n1, int n2);
}
abstract  public class Suma implements x {
    public int num1;
    public int num2;

}
class y extends  Suma{

    @Override
    public int sumar(int n1, int n2) {
        return n1 + n2;
    }
}
