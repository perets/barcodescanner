package ru.korston;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {
    public static void main (String[] args){
        DriverManagerDataSource dataSource= new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://192.168.37.10:3306/netflow");
        dataSource.setUsername("flowexport");
        dataSource.setPassword("flowexport");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");


        TicketDataStorage storage = new TicketDataStorage(dataSource);

        System.out.println("Start");
        String result = storage.findSRCAddrFromAgg();
        System.out.println(result);
        System.out.println("done");
    }
}
