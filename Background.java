public class Background {
    private GameCanvas component;

    public Background(GameCanvas component) {
        this.component = component;
    }

    public void changeBackground() {
        Color[] colors = new Color[]{Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN};
        for (int i = 0; i < colors.length; i++) {
            Color c = colors[i];
            component.setBackground(c);
            try {
                component.repaint();
                Thread.sleep(17);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
