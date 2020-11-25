package pojo;

public class RectShipe {
    private int x;
    private int y;
    private int width;
    private int height;
    public RectShipe() {}
    public RectShipe(int x_, int y_, int width_, int height_) {
        this.x = x_;
        this.y = y_;
        this.width = width_;
        this.height = height_;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
