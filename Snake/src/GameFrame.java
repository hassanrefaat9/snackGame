import javax.swing.*;

public class GameFrame extends JFrame {

    public GameFrame(){

        //   GamePanle gamePanle=new GamePanle();
        //  gameFrame.add(gamePanle);
        //this shortcut work same

        this.add(new GamePanle());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
