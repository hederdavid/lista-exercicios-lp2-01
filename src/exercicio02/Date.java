package exercicio02;

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
        return (this.day < 10 ? "0" : "") + this.day + "/" + (this.month < 10 ? "0" : "") + this.month + "/" + this.year;
    }

    public int getDiasTerminoAno() {
        if (this.year % 4 == 0) {
            switch (this.month) {
                case 1:
                    return 366 - this.day;
                case 2:
                    return 366 - this.day - 31; // janeiro
                case 3:
                    return 366 - this.day - 60; // fevereiro
                case 4:
                    return 366 - this.day - 91; // março
                case 5:
                    return 366 - this.day - 121; // abril
                case 6:
                    return 366 - this.day - 152; // maio
                case 7:
                    return 366 - this.day - 182; // junho
                case 8:
                    return 366 - this.day - 213; // julho
                case 9:
                    return 366 - this.day - 244; // agosto
                case 10:
                    return 366 - this.day - 274; // setembro
                case 11:
                    return 366 - this.day - 305; // outubro
                case 12:
                    return 366 - this.day - 335; // novembro

            }
        } else {
            switch (this.month) {
                case 1:
                    return 365 - this.day;
                case 2:
                    return 365 - this.day - 31; // janeiro
                case 3:
                    return 365 - this.day - 59; // fevereiro
                case 4:
                    return 365 - this.day - 90; // março
                case 5:
                    return 365 - this.day - 120; // abril
                case 6:
                    return 365 - this.day - 151; // maio
                case 7:
                    return 365 - this.day - 181; // junho
                case 8:
                    return 365 - this.day - 212; // julho
                case 9:
                    return 365 - this.day - 243; // agosto
                case 10:
                    return 365 - this.day - 273; // setembro
                case 11:
                    return 365 - this.day - 304; // outubro
                case 12:
                    return 365 - this.day - 334; // novembro
            }
        }
        return 0;
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
