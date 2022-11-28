public class Parallelepiped {
    private int heigth;
    private int length;
    private int width;


    public int getSquare(int heigth, int length, int width){
        return 2 *((heigth * length) + (length * width) + (heigth * width));
    }


    public int getVolume(int heigth, int length, int width){
        return  (length * width * heigth);

    }

















    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }



    public Parallelepiped(int heigth, int length, int width) {
        this.heigth = heigth;
        this.length = length;
        this.width = width;
    }


    public Parallelepiped() {
    }



}
