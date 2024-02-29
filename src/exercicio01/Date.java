package exercicio01;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String showDate() {
        String dayFormated;
        String monthFormated;
        if (this.day < 10) {
            dayFormated = "0" + this.day;
        } else {
            dayFormated = String.valueOf(this.day);
        }
        if (this.month < 10) {
            monthFormated = "0" + this.month;
        } else {
            monthFormated = String.valueOf(this.month);
        }
        return dayFormated + "/" + monthFormated + "/" + this.year;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
