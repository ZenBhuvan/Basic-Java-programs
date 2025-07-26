package codingjava;

public class codingj {
    public static void main(String[] args) {
       
        byte b = 1;
        short s = 2;
        int i = 1000;
        long l = 100000L;
        float f = 3.14f;
        double d = 6.28;
        char c = 'A';
        boolean bool = true;

        System.out.println("byte value: " + b + ", size: " + Byte.BYTES + " bytes");
        System.out.println("short value: " + s + ", size: " + Short.BYTES + " bytes");
        System.out.println("int value: " + i + ", size: " + Integer.BYTES + " bytes");
        System.out.println("long value: " + l + ", size: " + Long.BYTES + " bytes");
        System.out.println("float value: " + f + ", size: " + Float.BYTES + " bytes");
        System.out.println("double value: " + d + ", size: " + Double.BYTES + " bytes");
        System.out.println("char value: " + c + ", size: " + Character.BYTES + " bytes");
        
        System.out.println("boolean value: " + bool + ", size: JVM dependent");
    }
}
