package aula_07;

import java.awt.LayoutManager;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame {

    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;

    public LabelFrame() {

        super("Teste do JLabel");
        setLayout((LayoutManager) new FlowLayout());

        label1 = new JLabel("Label com um texto");
        label1.setToolTipText("Este é o label l1");
        add(label1);

        final Icon bug = new ImageIcon(getClass().getResource(""));
        label2 = new JLabel("Label com texto e um ícone", bug, SwingConstants.LEFT);
        add(label2);

        label3 = new JLabel();
        label3.setText("Label com ícone e texto embaixo");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("Este é o label3");
        add(label3);
    }
    
}
