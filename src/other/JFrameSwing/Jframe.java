package other.JFrameSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jframe extends JFrame {
    JTextField email_field, name_field;
    JRadioButton male, female;
    JCheckBox check;

    public Jframe() {
        super("Контактная форма");
        super.setBounds(200, 100, 300, 230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 2, 2, 2));

        JLabel name = new JLabel("Введите имя: ");
        name_field = new JTextField("", 1);
        JLabel email = new JLabel("Введите email: ");
        email_field = new JTextField("", 1);

        container.add(name);
        container.add(name_field);
        container.add(email);
        container.add(email_field);

        male = new JRadioButton("Мужской");
        female = new JRadioButton("Женский");
        check = new JCheckBox("Согласен?", false);
        JButton btn = new JButton("Отправить");

        male.setSelected(true);
        container.add(male);
        container.add(female);

        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(male);
        btnGroup.add(female);

        container.add(check);
        container.add(btn);

        btn.addActionListener(new ButtonEventListener());

    }

    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText();
            String email = email_field.getText();

            String isMale = "Мужской";
            if (!check.isSelected())
                isMale = "Женский";
            boolean checkBox = check.isSelected();

            JOptionPane.showMessageDialog(null, "Ваша почта: " + email
                            + "\nВаш пол: " + isMale + "\nВы согласны? " + checkBox,
                    "Привет, " + name, JOptionPane.PLAIN_MESSAGE);
        }
    }
}

