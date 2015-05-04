package com.sks.ArgonBackend;

import org.springframework.boot.SpringApplication;

/**
 * Main class that seeds the DB and fires up the API controllers.
 */
public class ARMain {

    /**
     * Method to seed db and load Components controller.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ARDBController.initDBConnection();
        ARDBController.seedDB();
        SpringApplication.run(ARComponentsController.class, args);
    }

}
