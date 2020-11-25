package factory;

import dao.draw;
import dao.drawlmp;
import pojo.*;
public class factorylmp implements factory{
    @Override
    public void create(int num) {
        draw d = new drawlmp();
        if(num == 1){
            LineShipe lineShipe = new LineShipe(50,30,450,260);
            d.drawLine(lineShipe);
        }
        else if(num == 2) {
            RectShipe rectShipe = new RectShipe(50,50,300,400);
            d.drawRect(rectShipe);
        }
        else if(num == 3) {
            CircleShape circleShape = new CircleShape(150,150,300,300);
            d.drawCircle(circleShape);
        }
    }

    @Override
    public void delete(int num) {

    }
}
