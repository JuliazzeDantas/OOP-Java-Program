package compound_Objects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;


public class Interface {

	private JFrame frame;
	
	public int counter = 0;
	
	public float randomFloat(float min, float max) {
		Random rand = new Random();
		return rand.nextFloat() * (max-min) + min;
	}

	public float randomInt(int min, int max) {
		Random rand = new Random();
		return rand.nextInt() * (max-min) + min;
	}	
	
	public void showFighters() {
		
	}
	
	static Octagon octagon = new Octagon();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		octagon.createFight();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Instation a octagon
		
				
		//Instatiation fight
		Fighter[] fighter = new Fighter[24];
				
		fighter[0] = new Fighter("Astonished_Face", randomFloat(1.6F,1.8F) , randomFloat(45F,61.5F), true);
		fighter[1] = new Fighter("Beaming_Face_With_Smiling_Eyes", randomFloat(1.6F,1.8F) , randomFloat(45F,61.5F), false);		
		fighter[2] = new Fighter("Exploding_Head", randomFloat(1.6F,1.8F) , randomFloat(45F,61.5F), false);		
		fighter[3] = new Fighter("Face_Blowing_a_Kiss", randomFloat(1.6F,1.8F) , randomFloat(45F,61.5F), false);		
		fighter[4] = new Fighter("Face_With_Tears_of_Joy", randomFloat(1.6F,1.8F) , randomFloat(45F,61.5F), false);	
		fighter[5] = new Fighter("Face_With_Tongue", randomFloat(1.6F,1.8F) , randomFloat(45F,61.5F), false);
			
		fighter[6] = new Fighter("Flushed_Face", randomFloat(1.6F,1.9F) , randomFloat(61.6F,77.1F), true);	 
		fighter[7] = new Fighter("Frowning_Face", randomFloat(1.6F,1.9F) , randomFloat(61.6F,77.1F), false);		
		fighter[8] = new Fighter("Grinning_Face_With_Smiling_Eyes", randomFloat(1.6F,1.9F) , randomFloat(61.6F,77.1F), false);		
		fighter[9] = new Fighter("Grinning_Face_With_Sweat", randomFloat(1.6F,1.9F) , randomFloat(61.6F,77.1F), false);		
		fighter[10] = new Fighter("Grinning_Squinting_Face", randomFloat(1.6F,1.9F) , randomFloat(61.6F,77.1F), false);		
		fighter[11] = new Fighter("Hugging_Face", randomFloat(1.6F,1.9F) , randomFloat(61.6F,77.1F), false);
				
		fighter[12] = new Fighter("Kissing_Face_With_Closed_Eyes", randomFloat(1.7F,2.0F) , randomFloat(61.6F,92.9F), true);	
		fighter[13] = new Fighter("Nauseated_Face", randomFloat(1.7F,2.0F) , randomFloat(61.6F,92.9F), false);		
		fighter[14] = new Fighter("Persevering_Face", randomFloat(1.7F,2.0F) , randomFloat(61.6F,92.9F), false);		
		fighter[15] = new Fighter("Sleepy_Face", randomFloat(1.7F,2.0F) , randomFloat(61.6F,92.9F), false);		
		fighter[16] = new Fighter("Slightly_Smiling_Face", randomFloat(1.7F,2.0F) , randomFloat(61.6F,92.9F), false);		
		fighter[17] = new Fighter("Tired_Face", randomFloat(1.7F,2.0F) , randomFloat(61.6F,92.9F), false);
				
		fighter[18] = new Fighter("Upside_Down_Face", randomFloat(1.75F,2.1F) , randomFloat(61.6F,130F), true);		
		fighter[19] = new Fighter("Weary_Face", randomFloat(1.75F,2.1F) , randomFloat(61.6F,130F), false);		
		fighter[20] = new Fighter("Winking_Face", randomFloat(1.75F,2.1F) , randomFloat(61.6F,130F), false);		
		fighter[21] = new Fighter("Worried_Face", randomFloat(1.75F,2.1F) , randomFloat(61.6F,130F), false);		
		fighter[22] = new Fighter("Zany_Face", randomFloat(1.75F,2.1F) , randomFloat(61.6F,130F), false);		
		fighter[23] = new Fighter("Zipper_Mouth_Face", randomFloat(1.75F,2.1F) , randomFloat(61.6F,130F), false);
			
		//Icons
		ImageIcon crown = new ImageIcon("Emoji\\Crown.jpg");
		crown.setImage(crown.getImage().getScaledInstance(30, 36, 30));
		ImageIcon versus = new ImageIcon("Emoji\\_VS.jpg");
		versus.setImage(versus.getImage().getScaledInstance(140, 140, 140));
		ImageIcon nul = new ImageIcon();
		
		ImageIcon[] iconFighter = new ImageIcon[24];
				
		iconFighter[0] = new ImageIcon("Emoji\\Astonished_Face.jpg");
		iconFighter[0].setImage(iconFighter[0].getImage().getScaledInstance(140, 140, 140));		
		iconFighter[1] = new ImageIcon("Emoji\\Beaming_Face_With_Smiling_Eyes.jpg");
		iconFighter[1].setImage(iconFighter[1].getImage().getScaledInstance(140, 140, 140));		
		iconFighter[2] = new ImageIcon("Emoji\\Exploding_Head.jpg");
		iconFighter[2].setImage(iconFighter[2].getImage().getScaledInstance(140, 140, 140));		
		iconFighter[3] = new ImageIcon("Emoji\\Face_Blowing_a_Kiss.jpg");
		iconFighter[3].setImage(iconFighter[3].getImage().getScaledInstance(140, 140, 140));		
		iconFighter[4] = new ImageIcon("Emoji\\Face_With_Tears_of_Joy.jpg");
		iconFighter[4].setImage(iconFighter[4].getImage().getScaledInstance(140, 140, 140));		
		iconFighter[5] = new ImageIcon("Emoji\\Face_With_Tongue.jpg");
		iconFighter[5].setImage(iconFighter[5].getImage().getScaledInstance(140, 140, 140));	
		
		iconFighter[6] = new ImageIcon("Emoji\\Flushed_Face.jpg");
		iconFighter[6].setImage(iconFighter[6].getImage().getScaledInstance(140, 140, 140));	 
		iconFighter[7] = new ImageIcon("Emoji\\Frowning_Face.jpg");
		iconFighter[7].setImage(iconFighter[7].getImage().getScaledInstance(140, 140, 140));		
		iconFighter[8] = new ImageIcon("Emoji\\Grinning_Face_With_Smiling_Eyes.jpg");
		iconFighter[8].setImage(iconFighter[8].getImage().getScaledInstance(140, 140, 140));		
		iconFighter[9] = new ImageIcon("Emoji\\Grinning_Face_With_Sweat.jpg");
		iconFighter[9].setImage(iconFighter[9].getImage().getScaledInstance(140, 140, 140));		
		iconFighter[10] = new ImageIcon("Emoji\\Grinning_Squinting_Face.jpg");
		iconFighter[10] .setImage(iconFighter[10] .getImage().getScaledInstance(140, 140, 140));	
		iconFighter[11] = new ImageIcon("Emoji\\Hugging_Face.jpg");
		iconFighter[11] .setImage(iconFighter[11] .getImage().getScaledInstance(140, 140, 140));
		
		iconFighter[12] = new ImageIcon("Emoji\\Kissing_Face_With_Closed_Eyes.jpg");
		iconFighter[12].setImage(iconFighter[12].getImage().getScaledInstance(140, 140, 140));		
		iconFighter[13] = new ImageIcon("Emoji\\Nauseated_Face.jpg");
		iconFighter[13].setImage(iconFighter[13].getImage().getScaledInstance(140, 140, 140));		
		iconFighter[14] = new ImageIcon("Emoji\\Persevering_Face.jpg");
		iconFighter[14].setImage(iconFighter[14].getImage().getScaledInstance(140, 140, 140));		
		iconFighter[15] = new ImageIcon("Emoji\\Sleepy_Face.jpg");
		iconFighter[15].setImage(iconFighter[15].getImage().getScaledInstance(140, 140, 140));		
		iconFighter[16] = new ImageIcon("Emoji\\Slightly_Smiling_Face.jpg");
		iconFighter[16].setImage(iconFighter[16].getImage().getScaledInstance(140, 140, 140));		
		iconFighter[17] = new ImageIcon("Emoji\\Tired_Face.jpg");
		iconFighter[17].setImage(iconFighter[17].getImage().getScaledInstance(140, 140, 140));
		
		iconFighter[18] = new ImageIcon("Emoji\\Upside_Down_Face.jpg");
		iconFighter[18].setImage(iconFighter[18].getImage().getScaledInstance(140, 140, 140));		
		iconFighter[19] = new ImageIcon("Emoji\\Weary_Face.jpg");
		iconFighter[19].setImage(iconFighter[19].getImage().getScaledInstance(140, 140, 140));	
		iconFighter[20] = new ImageIcon("Emoji\\Winking_Face.jpg");
		iconFighter[20].setImage(iconFighter[20].getImage().getScaledInstance(140, 140, 140));	
		iconFighter[21] = new ImageIcon("Emoji\\Worried_Face.jpg");
		iconFighter[21].setImage(iconFighter[21].getImage().getScaledInstance(140, 140, 140));	
		iconFighter[22] = new ImageIcon("Emoji\\Zany_Face.jpg");
		iconFighter[22].setImage(iconFighter[22].getImage().getScaledInstance(140, 140, 140));	
		iconFighter[23] = new ImageIcon("Emoji\\Zipper_Mouth_Face.jpg");
		iconFighter[23].setImage(iconFighter[23].getImage().getScaledInstance(140, 140, 140));

		JLabel lbl_Title = new JLabel("Fight");
		lbl_Title.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setBounds(250, 10, 140, 56);
		frame.getContentPane().add(lbl_Title);
		
		JLabel lblFight1 = new JLabel("");
		lblFight1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFight1.setBounds(46, 102, 140, 140);
		frame.getContentPane().add(lblFight1);
		
		JLabel lblVs = new JLabel("");
		lblVs.setHorizontalAlignment(SwingConstants.CENTER);
		lblVs.setBounds(250, 102, 140, 140);
		frame.getContentPane().add(lblVs);

		JLabel lblFight2 = new JLabel("");
		lblFight2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFight2.setBounds(455, 102, 140, 140);
		frame.getContentPane().add(lblFight2);
		
		JLabel lblCrownF1 = new JLabel("");
		lblCrownF1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrownF1.setBounds(46, 56, 140, 36);
		frame.getContentPane().add(lblCrownF1);
			
		JLabel lblCrownF2 = new JLabel("");
		lblCrownF2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrownF2.setBounds(455, 56, 140, 36);
		frame.getContentPane().add(lblCrownF2);
		
		JLabel lblNumberFight = new JLabel("");
		lblNumberFight.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumberFight.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNumberFight.setBounds(250, 324, 140, 36);
		frame.getContentPane().add(lblNumberFight);
		
		JLabel lblWinner1 = new JLabel("");
		lblWinner1.setForeground(Color.GREEN);
		lblWinner1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinner1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblWinner1.setBounds(46, 245, 140, 36);
		frame.getContentPane().add(lblWinner1);
		
		JLabel lblWinner2 = new JLabel("");
		lblWinner2.setForeground(Color.GREEN);
		lblWinner2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblWinner2.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinner2.setBounds(455, 245, 140, 36);
		frame.getContentPane().add(lblWinner2);
		
		JButton btnFight = new JButton("Ready?");
		btnFight.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnFight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnFight.setText("Fight!");
				SwingWorker worker = new SwingWorker() {
			        @Override
			        protected Object doInBackground() throws Exception {
						for(int counter = 0; counter < 2000; counter++) {
						
							lblWinner1.setText(null);
							lblWinner2.setText(null);
							
							
							int result = octagon.fight(fighter[octagon.match[counter].getF1()], fighter[octagon.match[counter].getF2()]);
							
							switch(result) {
								case 0:
									lblWinner1.setText("Draw!");
									lblWinner2.setText("Draw!");
									break;
								case 1:
									lblWinner1.setText("Winner!");
									break;
								case 2:
									lblWinner2.setText("Winner!");
									break;
								case 3:
									lblWinner1.setText("Canceled!");
									lblWinner2.setText("Canceled!");
									break;
							}
							
							lblCrownF1.setIcon(null);
							lblCrownF2.setIcon(null);
							
							lblFight1.setIcon(iconFighter[octagon.match[counter].getF1()]);
							if(fighter[octagon.match[counter].getF1()].isChampion_Belt()) {
								lblCrownF1.setIcon(crown);
							}
							lblVs.setIcon(versus);
							lblFight2.setIcon(iconFighter[octagon.match[counter].getF2()]);
							if(fighter[octagon.match[counter].getF2()].isChampion_Belt()) {
								lblCrownF1.setIcon(crown);
							}	
							//counter+=1;
							lblNumberFight.setText("Fight: " + counter);
							
							new Thread();
							Thread.sleep(2000);
							
							lblFight1.setText(null);
							lblFight2.setText(null);
							lblVs.setText(null);
							lblCrownF1.setText(null);
							lblCrownF2.setText(null);
						}
						return null;
			        }
				};
				worker.execute();
			}
		});
		btnFight.setBounds(250, 278, 140, 36);
		frame.getContentPane().add(btnFight);
		
		JButton btnScore = new JButton("Score");
		btnScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] result = new String[24];
				for(int i = 0; i < 24; i++) {
					result[i] = fighter[i].toString();
				}
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(null, result);
				
			}
		});
		btnScore.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnScore.setBounds(250, 370, 140, 36);
		frame.getContentPane().add(btnScore);
		
		
	}
}
