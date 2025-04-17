public class TextDocument implements Document {
    private String filePath;
    private String encoding;
    private int wordCount;

    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }

    public void setFilePath(String filePath) { this.filePath = filePath; }
    public void setEncoding(String encoding) { this.encoding = encoding; }
    public void setWordCount(int wordCount) { this.wordCount = wordCount; }

    @Override
    public TextDocument clone() {
        try {
            return (TextDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }

    @Override
    public String getType() {
        return "Text";
    }

    @Override
    public void open() {
        System.out.println("\nOpening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
        System.out.println("Type: " + getType() + ", Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount);
    }
}