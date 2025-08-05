package javaday2;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        System.out.println("Initial capacity: " + sb.capacity());

        sb.append("Hello");
        System.out.println("Capacity after appending 'Hello': " + sb.capacity());

        sb.append(" java is my favourite language");
        System.out.println("Capacity after appending long string: " + sb.capacity());

        sb.ensureCapacity(10);
        System.out.println("Capacity after ensureCapacity(10): " + sb.capacity());

        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());
    }
}
