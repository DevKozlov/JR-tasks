package com.javarush.task.task21.task2112;

public class Solution implements AutoCloseable{
    public static void main(String[] args) throws Exception{
        DBConnectionManager dbConnectionManager = new DBConnectionManager();
        try (FakeConnection fakeConnection = dbConnectionManager.getFakeConnection()) {
            System.out.println("Entering the body of try block.");
            fakeConnection.usefulOperation();
            fakeConnection.unsupportedOperation();
        } catch (Exception e) {
        }
    }

    @Override
    public void close() throws Exception {

    }
}
