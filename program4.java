import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {
    private JTextField nameField;
    private JTextField emailField;
    private JComboBox<String> eventTypeComboBox;

    public RegistrationForm() {
        setTitle("Event Registration Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4, 2));

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel eventTypeLabel = new JLabel("Event Type:");

        nameField = new JTextField(20);
        emailField = new JTextField(20);

        String[] eventTypes = {"Conference", "Workshop", "Seminar", "Webinar"};
        eventTypeComboBox = new JComboBox<>(eventTypes);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register();
            }
        });

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(eventTypeLabel);
        add(eventTypeComboBox);
        add(new JLabel());
        add(registerButton);

        setVisible(true);
    }

    private void register() {
        String name = nameField.getText();
        String email = emailField.getText();
        String eventType = (String) eventTypeComboBox.getSelectedItem();

        // Perform registration logic (for demonstration, just display a message)
        JOptionPane.showMessageDialog(this, "Registration Successful!\nName: " + name + "\nEmail: " + email + "\nEvent Type: " + eventType);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistrationForm();
            }
        });
    }
}
