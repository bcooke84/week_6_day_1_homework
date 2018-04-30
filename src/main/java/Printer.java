public class Printer {
    private int numberOfSheetsOfPaper;
    private int tonerVolume;

    public Printer(int numberOfSheetsOfPaper, int tonerVolume) {
        this.numberOfSheetsOfPaper = numberOfSheetsOfPaper;
        this.tonerVolume = tonerVolume;
    }

    public int getNumberOfSheetsOfPaper() {
        return this.numberOfSheetsOfPaper;
    }

    public void setNumberOfSheetsOfPaper(int num) {
        this.numberOfSheetsOfPaper = num;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public void setTonerVolume(int num) {
        this.tonerVolume = num;
    }

    public boolean printRequest(int pages, int copies) {
        if (((pages * copies) < this.numberOfSheetsOfPaper) && ((pages * copies) < this.tonerVolume)) {
            this.numberOfSheetsOfPaper -= (pages * copies);
            this.tonerVolume -= (pages * copies);
            return true;
        } else {
            return false;
        }
    }

    public String refillPrinter(int refill) {
        this.numberOfSheetsOfPaper += refill;
        return "Printer refilled, " + this.numberOfSheetsOfPaper + " sheets available";
    }




}
