public class File {

  private String fileName;
  private String extension;

  public File(String fileName, String extension) {

    this.fileName = fileName;
    this.extension = extension;
  }

  public boolean isPDF() {
    return extension.equalsIgnoreCase("PDF");
  }
  public boolean equals(Object banana) {
    if(!(banana instanceof File))
      return false;
    File temp = (File) banana;
    return (temp.fileName.equals(fileName) && temp.extension.equals(extension));
  }

  public String toString() {
    return "File{" + "fileName='" + fileName + '\'' + ", extension='" + extension + '\'' + '}';
  }
}
