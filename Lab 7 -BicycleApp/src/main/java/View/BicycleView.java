package View;

import Controller.BicycleController;
import Model.Bicycle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BicycleView extends JFrame {

    private JTextField txtGear;
    private JTextField txtSpeed;
    private JButton btnBreak;
    private JButton btnSpeedUp;
    private JButton btnAddBicycle;
    private JLabel lblGear;
    private JLabel lblSpeed;
    private JLabel lblCurrentSpeed;
    private JPanel backPane;

    Bicycle bicycle;
    BicycleController bicycleController;
    public BicycleView() {
        btnAddBicycle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double speed = Double.parseDouble(txtSpeed.getText());
                int gear = Integer.parseInt(txtGear.getText());

                bicycleController = new BicycleController();
                bicycle = bicycleController.addBicycle(gear,speed);
                JOptionPane.showMessageDialog(rootPane, "Bicycle added successfully!",
                        "Success",2);
                lblCurrentSpeed.setText(bicycle.toString());
            }
        });

        btnBreak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double speed = Double.parseDouble(txtSpeed.getText());
                bicycle.applyBreak(speed);
                JOptionPane.showMessageDialog(rootPane,"Break Applied!",
                        "Success", 2);
                lblCurrentSpeed.setText(bicycle.toString());
            }
        });


        btnSpeedUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double speed = Double.parseDouble(txtSpeed.getText());
                bicycle.speedUp(speed);
                JOptionPane.showMessageDialog(rootPane, "Speed Up!",
                        "Success", 2);
                lblCurrentSpeed.setText(bicycle.toString());
            }
        });
    }

    public static void main(String[] args) {
        BicycleView bicycleView = new BicycleView();
        bicycleView.setContentPane(bicycleView.backPane);
        bicycleView.setTitle("Bicycle Application");
        bicycleView.setSize(600,600);
        bicycleView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bicycleView.setVisible(true);
    }
}
