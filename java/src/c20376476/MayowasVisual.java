package c20376476;
public class MayowasVisual
{
    Menu menu;
    Movers m;
    Parametric_lines pl;
    Visualiser v;
    float t;

    public MayowasVisual(Menu menu)
    {
        this.menu = menu;
    }

    public void setup()
    {
        m = new Movers(menu);
        pl = new Parametric_lines(menu);
        v = new Visualiser(menu);

    }

    public void draw(int mode)
    {
        switch(mode)
        {

            case 0:
                menu.background(0);
                menu.textSize(25);
                menu.textAlign(Menu.CENTER, Menu.CENTER);
                menu.text("Currently in Mayowa's Visuals: Press 'e' to see Emmanuel's visuals and 'p' to see Providence's visuals", menu.width / 2, 50);
                m.draw();
                break;

            case 1:
                menu.background(0);
                menu.textSize(25);
                menu.textAlign(Menu.CENTER, Menu.CENTER);
                menu.text("Currently in Mayowa's Visuals: Press 'e' to see Emmanuel's visuals and 'p' to see Providence's visuals", menu.width / 2, 50);
                t = pl.draw(t);
                break;

            case 2:
                menu.background(0);
                menu.textSize(25);
                menu.textAlign(Menu.CENTER, Menu.CENTER);
                menu.text("Currently in Mayowa's Visuals: Press 'e' to see Emmanuel's visuals and 'p' to see Providence's visuals", menu.width / 2, 50);
                v.draw();
                break;


        }
    }
}
