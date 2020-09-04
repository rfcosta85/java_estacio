package aula_02.aula_04;


public class Ponto2D 
{

    private int x;
    private int y;

    public Ponto2D(int a, int b)
    {
        x = a;
        y = b;
    }

    public double distancia(Ponto2D p)
    {

        double distX = p.x - x;
        double distY = p.y - y;

        return Math.sqrt(distX * distX + distY * distY);

    }

    Ponto2D p1 = new Ponto2D(3,2);
    Ponto2D p2 = new Ponto2D(4,5);   

    
}   

