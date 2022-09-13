public enum AcccountType {
    SAVINGS(500),CURRENT(1000);

    private double minBal;
    private AcccountType(double minBal) {
        this.minBal=minBal;
    }
    double getMinBal(){
        return this.minBal;
    }
}
