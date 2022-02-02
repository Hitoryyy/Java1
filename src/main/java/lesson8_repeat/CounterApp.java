package lesson8_repeat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int value;
    private JLabel infoLabel;


    public CounterApp() {
        setBounds(500, 500, 300, 150);
        setTitle("Counter app");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Шрифт
        Font font = new Font("Arial", Font.BOLD, 32);

        //Текстовое поле (нередактируемое)
        JLabel label = new JLabel(String.valueOf(value));
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        //Добавление инфопанели
        //Будем показывать ошибку,если значение счётчика по модулю больше 10
        infoLabel = new JLabel();
        add(infoLabel, BorderLayout.NORTH);



        //Кнопки увеличения и уменьшения
        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        JButton decrementButtonMinusTen = new JButton("<<");
        decrementButton.setFont(font);
        add(decrementButtonMinusTen, BorderLayout.SOUTH);

        JButton incrementButtonPlusTen = new JButton(">>");
        incrementButton.setFont(font);
        add(incrementButtonPlusTen, BorderLayout.NORTH);

        //Добавляем слушателя на уменьшение
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        //Слушатель на уменьшение -10
        decrementButtonMinusTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value - 10;
                label.setText(String.valueOf(value));
            }
        });

        //Слушатель на увеличение +10
        incrementButtonPlusTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value + 10;
                label.setText(String.valueOf(value));
            }
        });

        //Аналогично для увеличения
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });


        setVisible(true);
    }

    private void validateRange() {
        if (Math.abs(value) > 10) {
            infoLabel.setText("Value out of range");
        } else {
            infoLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new CounterApp();
    }


}
