public class MyController {

    private MyGUI myGUI;

    private void Start() {
        myGUI = new MyGUI();
        Initialize();
        myGUI.setVisible(true);
    }

    private void Initialize()
    {
        myGUI.setMyButtonActionListener(e->{
            myGUI.setMyLabelValue("My button works!");
        });
    }

    public static void main(String[] args) {
        MyController controller = new MyController();

        controller.Start();
    }
}
