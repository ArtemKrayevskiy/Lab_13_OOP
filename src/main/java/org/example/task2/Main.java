package org.example.task2;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Autorization autorization = new Autorization();
        if (autorization.loging(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
