package dz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by PHP on 22.09.2017.
 */
public class MyWin extends JFrame {

    public static final String BROKEN_TRACK = "BROKEN_TRACK";
    public static final String HIT = "HIT";
    public static final String PENETRATION = "PENETRATION";
    public static final String RICOCHET = "RICOCHET";
    public static final String WOT = "wot";
    private final JButton buttonFR;
    private final JButton buttonEN;
    private final JButton buttonDE;


    private JLabel broken_track = new JLabel();
    private JLabel hit = new JLabel();
    private JLabel penetration = new JLabel();
    private JLabel ricochet = new JLabel();

    public static void main(String[] args) {
        new MyWin();
    }

    MyWin() {
        super("World of Tanks");
        JPanel root = new JPanel();
        root.setLayout(new GridLayout(2, 1, 0, 10));
        JPanel properties = new JPanel();
        properties.setBackground(Color.CYAN);
        properties.setLayout(new GridLayout(4, 2, 10, 10));
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(1, 3));
        root.add(properties);
        root.add(buttons);
        buttonFR = new JButton("fr_FR");
        buttonFR.setBackground(Color.GREEN);
        buttons.add(buttonFR);
        buttonEN = new JButton("en_US");
        buttons.add(buttonEN);
        buttonEN.setBackground(Color.RED);
        buttonDE = new JButton("de_DE");
        buttonDE.setBackground(Color.ORANGE);
        buttons.add(buttonDE);
        properties.add(new JLabel(BROKEN_TRACK));
        properties.add(broken_track);
        properties.add(new JLabel(HIT));
        properties.add(hit);
        properties.add(new JLabel(PENETRATION));
        properties.add(penetration);
        properties.add(new JLabel(RICOCHET));
        properties.add(ricochet);
        properties.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        setContentPane(root);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initListeners();
    }

    private void initListeners() {
        buttonFR.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResourceBundle resourceBundle = ResourceBundle.getBundle(WOT, Locale.FRANCE);
                broken_track.setText(resourceBundle.getString(BROKEN_TRACK));
                hit.setText(resourceBundle.getString(HIT));
                penetration.setText(resourceBundle.getString(PENETRATION));
                ricochet.setText(resourceBundle.getString(RICOCHET));
            }
        });

        buttonEN.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResourceBundle resourceBundle = ResourceBundle.getBundle(WOT, Locale.US);
                broken_track.setText(resourceBundle.getString(BROKEN_TRACK));
                hit.setText(resourceBundle.getString(HIT));
                penetration.setText(resourceBundle.getString(PENETRATION));
                ricochet.setText(resourceBundle.getString(RICOCHET));
            }
        });

        buttonDE.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResourceBundle resourceBundle = ResourceBundle.getBundle(WOT, Locale.GERMANY);
                broken_track.setText(resourceBundle.getString(BROKEN_TRACK));
                hit.setText(resourceBundle.getString(HIT));
                penetration.setText(resourceBundle.getString(PENETRATION));
                ricochet.setText(resourceBundle.getString(RICOCHET));
            }
        });

    }


}
