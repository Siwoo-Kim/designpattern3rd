package decorator.io;

import java.io.*;

public class LowerCaseInputStream extends FilterInputStream {

    public static void main(String[] args) {
        byte[] bytes = "I know the Decorator Pattern therefore I RULE!".getBytes();
        int c;
        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new ByteArrayInputStream(bytes)))) {
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase((char) c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int numberOfRead = super.read(b, off, len);
        for (int i = off; i < off + numberOfRead; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return numberOfRead;
    }
}
