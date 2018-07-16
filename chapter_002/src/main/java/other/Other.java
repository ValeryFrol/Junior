package other;

import java.awt.*;

public class Other extends Frame {

    public void paint(Graphics g){
        Font f = new Font("Gothic",Font.BOLD,24);
        g.setFont(f);
        g.drawString("Hello",20,20);

    }

    public static void main(String[] args) {
        Other m = new Other();
        m.setSize(200,200);
        m.setVisible(true);
    }


}
