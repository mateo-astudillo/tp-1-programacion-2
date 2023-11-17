package exercise_8;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private String monthStr;
    private boolean isLeap;

    public boolean setDate(int day, int month, int year) {
        this.setYear(year);
        return setMonth(month) && setDay(day);
    }

    public boolean setDay(int day) {
        int[] with30 = {4, 6, 9, 11};
        int maxDay = 31;
        for (int m : with30) {
            if (m == this.month ) {
                maxDay = 30;
                break;
            }
        }
        if (this.month == 2) {
            maxDay = 28;
            if (this.isLeap) {
                maxDay = 29;
            }
        }
        if (day < 1 || day > maxDay) {
            return false;
        }
        this.day = day;
        return true;
    }

    public boolean setMonth(int month) {
        if (month < 1 || month > 12) {
            return false;
        }
        this.month = month;
        this.monthStr = switch (this.month) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "";
        };
        return true;
    }

    public void setYear(int year) {
        this.isLeap = year % 4 == 0;
        if ( year % 100 == 0) {
            this.isLeap = year % 400 == 0;
        }
        this.year = year;
    }

    public String getDate() {
        String leap;
        if (this.isLeap) {
            leap = "Bisiesto";
        } else {
            leap = "No bisiesto";
        }
        return this.day + " de " + this.monthStr + " del " + this.year + ", " + leap;
    }
}
