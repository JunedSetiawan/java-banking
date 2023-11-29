package banking.model;

import java.util.Calendar;
import java.util.Date;

public abstract class Loan {
    public Double amount;
    protected Date startDate;
    protected Date endDate;
    protected Integer tenureInYears;
    public String status;
    private int loanID;
    private static int loanIssueNumber = 1;

    public Loan(Double amount, Integer tenureInYears) {
        this.amount = amount;
        this.tenureInYears = tenureInYears;
        startDate = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(Calendar.YEAR, tenureInYears);
        endDate = calendar.getTime();

        status = "active";
        loanID = loanIssueNumber++;
    }

    abstract public double getDueAmount();

    abstract public void showLoanDetails();

    abstract public double getLoanRate();

    public double getLoanAmount() {
        return amount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getLoanID() {
        return loanID;
    }
}
