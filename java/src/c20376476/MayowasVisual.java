package c20376476;
public class MayowasVisual
{
    Menu menu;
    Waves wf;
    AudioBands abv;
    Movers m;
    Box b;
    Sphere s;
    Parametric_lines pl;
    //int mode = 0;

    public MayowasVisual(Menu menu)
    {
        this.menu = menu;
    }

    public void setup()
    {
        wf = new Waves(menu);
        abv = new AudioBands(menu);
        m = new Movers(menu);
        b = new Box(menu);
        s = new Sphere(menu);
        pl = new Parametric_lines(menu);

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
                wf.render();
                break;

            case 1:
                menu.background(0);
                menu.textSize(25);
                menu.textAlign(Menu.CENTER, Menu.CENTER);
                menu.text("Currently in Mayowa's Visuals: Press 'e' to see Emmanuel's visuals and 'p' to see Providence's visuals", menu.width / 2, 50);
                abv.render();
                break;

            case 2:
                menu.background(0);
                menu.textSize(25);
                menu.textAlign(Menu.CENTER, Menu.CENTER);
                menu.text("Currently in Mayowa's Visuals: Press 'e' to see Emmanuel's visuals and 'p' to see Providence's visuals", menu.width / 2, 50);
                m.draw();
                break;

            case 3:
                menu.background(0);
                menu.textSize(25);
                menu.textAlign(Menu.CENTER, Menu.CENTER);
                menu.text("Currently in Mayowa's Visuals: Press 'e' to see Emmanuel's visuals and 'p' to see Providence's visuals", menu.width / 2, 50);
                b.draw();
                break;

            case 4:
                menu.background(0);
                menu.textSize(25);
                menu.textAlign(Menu.CENTER, Menu.CENTER);
                menu.text("Currently in Mayowa's Visuals: Press 'e' to see Emmanuel's visuals and 'p' to see Providence's visuals", menu.width / 2, 50);
                s.draw();
                break;

            case 5:
                menu.background(0);
                menu.textSize(25);
                menu.textAlign(Menu.CENTER, Menu.CENTER);
                menu.text("Currently in Mayowa's Visuals: Press 'e' to see Emmanuel's visuals and 'p' to see Providence's visuals", menu.width / 2, 50);
                pl.draw();
                break;


        }
    }
}
