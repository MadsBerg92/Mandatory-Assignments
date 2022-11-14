
public class RejseKort {
    private int balance;
    private boolean checkedIn;
    private int lastCheckIn;
    private int minX, maxX, minY, maxY;

    public RejseKort() {
        balance = 100;
        checkedIn = false;

    }

    public void depositMoney(int dkk) {
        if (dkk >= 0) {
            balance += dkk;
            System.out.println(dkk + " DKK deposited. New balance: " + balance + " DKK");
        }
        if (dkk < 0) {
            System.out.println("Error: Cannot deposit negative amount");
        }

    }

    public boolean isCheckedIn(int timeStamp) {
        if (checkedIn && timeStamp <= lastCheckIn) {
            return true;
        } else {
            return false;
        }

    }

    public void checkIn(int x, int y, int timeStamp) {

        if (balance < 100) {
            System.out.println(
                    "Not enough money in account to check in. Please deposit at least " + (100 - balance) + " DKK");
        }
        if (!checkedIn) {
            System.out.println("Checked in");
            checkedIn = true;
            this.lastCheckIn = timeStamp;

        }

    }

    public void checkOut(int x, int y, int timeStamp) {

        checkedIn = false;

    }

}
