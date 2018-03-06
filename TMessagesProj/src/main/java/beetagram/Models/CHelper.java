package ir.mono.monolyticsdk.Models;

public class CHelper {
    private byte[] bytes;
    private int inputLength;
    private int outputLength;

    public int getInputLength() {
        return this.inputLength;
    }

    public void setInputLength(int inputLength) {
        this.inputLength = inputLength;
    }

    public int getOutputLength() {
        return this.outputLength;
    }

    public void setOutputLength(int outputLength) {
        this.outputLength = outputLength;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
