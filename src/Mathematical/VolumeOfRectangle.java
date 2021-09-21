package Mathematical;

public class VolumeOfRectangle {
    public static void main(String[] args) {
        int P=20;
        int A=16;
    float l
            = (float) (P - Math.sqrt(P * P - 24 * A)) / 12;

    // calculate volume
    long V
            = (long) (l * (A / 2.0 - l * (P / 4.0 - l)));

            if(V<0)
    V=0;

        System.out.println(V);
}
}
