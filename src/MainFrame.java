import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainFrame extends JFrame {
	 private JTextArea theText;
	 
	MainFrame (){
		super ("SearchStringInLog");
		 setBounds(100, 100, 700, 400); 
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         initMainPanel();
	}
	
	private void initMainPanel(){
		JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
         
        panel.add(Box.createVerticalGlue());
 
        final JLabel label = new JLabel("��������� ����");
        label.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(label);
 
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
 
        JButton button = new JButton("����� ��������");
        button.setAlignmentX(CENTER_ALIGNMENT);
 
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileopen = new JFileChooser();             
                int ret = fileopen.showDialog(null, "������� ����");                
                if (ret == JFileChooser.APPROVE_OPTION) {
                    File file = fileopen.getSelectedFile();
                    label.setText(file.getName());
                }
            }
        });
 
        panel.add(button);
        panel.add(Box.createVerticalGlue());
        getContentPane().add(panel);
 
        setPreferredSize(new Dimension(260, 220));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
		
	}
	
}
