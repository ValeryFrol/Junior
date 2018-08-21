package nestedClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TalkingClock {
    public TalkingClock() {

    }

    public void start(int interval, final boolean beep) {
        ActionListener listener = new ActionListener() {//новый объект класса, реализующего интерфейс ActionListener
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                System.out.println("Time is " + now);
                if (beep) Toolkit.getDefaultToolkit().beep();

            }
        };
        Timer t = new Timer(interval, listener);
        t.start();
        }
   /* public void start(int interval, final boolean beep){
        class TimePrinter implements ActionListener {
            private TalkingClock outer;
            public TimePrinter(TalkingClock clock){
                outer = clock;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                System.out.println("Time is "+now);
                if(beep){ //if(access$0(outer))
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        ActionListener listener = new TimePrinter(this);
        Timer timer = new Timer(interval,listener);
        timer.start();
    }*/



    /*public class TimePrinter implements ActionListener {
        private TalkingClock outer;
        public TimePrinter(TalkingClock clock){
            outer = clock;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            Date now = new Date();
            System.out.println("Time is "+now);
            if(outer.beep){ //if(access$0(outer))
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
*/
    }
