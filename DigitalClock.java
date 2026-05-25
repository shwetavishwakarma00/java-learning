import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class DigitalClock extends JFrame {
    private JLabel heading;
    private JLabel clocJLabel;

    private Font font = new Font("", Font.BOLD, 32);

    DigitalClock()
    {
        super.setTitle("MyClock");
        super.setSize(400, 400);
        super.setLocation(400,100);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }

    public void createGUI(){
        heading= new JLabel("MyClock");
        clocJLabel= new JLabel("clock");

        heading.setFont(font);
        clocJLabel.setFont(font);

        this.setLayout(new GridLayout(2, 1));
        this.add(heading);
        this.add(clocJLabel);
    }

    public void startClock(){
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                // String datTime =new Date().toLocaleString();

                Date d=new Date();
                SimpleDateFormat sfd= new SimpleDateFormat("hh : mm : ss a");

                String datTime = sfd.format(d);
                clocJLabel.setText(datTime);
            }
        }
        );
        timer.start();
}
}
