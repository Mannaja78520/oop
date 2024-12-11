public class HealthRecord {
    private int height;
    private static final int MIN_PERMITTED_HEIGHT = 50;
    private static final int MAX_PERMITTED_HEIGHT = 175;
    private static final int DEFAULT_HEIGHT = 100;
    private static int tallestHeight = MIN_PERMITTED_HEIGHT;
    private static int shortestHeight = MAX_PERMITTED_HEIGHT;

    // TODO: 1 Think about the initial value for maximum and minimum height
    public HealthRecord(int height) { 
        setHeight(height);
      }

    public void setHeight(int height) {

    // TODO: 2 Check if the input height falls within the permitted range
    if ( height > this.MIN_PERMITTED_HEIGHT && height < this.MAX_PERMITTED_HEIGHT )
        this.height = height;
    else
        this.height = this.DEFAULT_HEIGHT;
    
    // TODO: 3 Update the tallest and shortest height
    if ( this.height > this.tallestHeight )
        this.tallestHeight = this.height ;
    if ( this.height < this.shortestHeight )
        this.shortestHeight = this.height ;
    }

    public int getHeight() {
        return this.height;
    }
      
    public static int getTallestHeight() {
        return HealthRecord.tallestHeight; 
    }

    public static int getShortestHeight() {
        return HealthRecord.shortestHeight; 
    }

    public void displayDetails() { 
        System.out.println("Height (cm): " + getHeight());
      }

      public static void displayClassDetails() {
        System.out.println("The tallest height (cm): " + getTallestHeight());
        System.out.println("The shortest height (cm): " + getShortestHeight());
      }
  
  
}
