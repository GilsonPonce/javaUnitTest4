/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GILSON
 */
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addMovieRental method, of class Customer.
     */
    @Test
    public void testAddMovieRental() {
        System.out.println("addMovieRental");
        Movie movi = new Movie("Avenger",Movie.REGULAR);
        MovieRental arg = new MovieRental(movi,2);
        Customer instance = new Customer("Gilson Ponce");
        instance.addMovieRental(arg);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @Test
    public void testAddVideoGameRental() {
        System.out.println("addVideoGameRental");
        WiiGame videoga = new WiiGame("Mario Bros");
        VideoGameRental arg = new VideoGameRental(videoga,3,true);
        Customer instance = new Customer("Gilson Ponce");
        instance.addVideoGameRental(arg);
    }

    /**
     * Test of statement method, of class Customer.
     */
    @Test
    public void testStatement() {
        System.out.println("statement");
        Movie movie = new Movie("Avenger",Movie.REGULAR);
        WiiGame mario = new WiiGame("Mario Bros");
        VideoGameRental viedorental = new VideoGameRental(mario,5,true);
        MovieRental movieren = new MovieRental(movie,5);
        Customer instance = new Customer("GILSON PONCE");
        String expResult = "Rental Record for GILSON PONCE"+"\n"+"Amount owed is 0.0"+"\n"+"You earned 0 frequent renter points";
        String result = instance.statement();
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testStatementNewReleaseOnly() {
        // new releases cost $3.00/day
        // a rental earns 1 frequent-renter point 1 day; 2 points for 2 or more days
        Customer janeDoe = new Customer("Jane Doe");
    }
    
    @Test
    public void testGetName() {
        String name = "John Doe"; 
        assertEquals(name, new Customer(name)._name);
    }
    
    @Test
    public void testStatementRegularMovieOnly() {
        // regular movies cost $2.00 for the first 2 days, and $1.50/day thereafter
        // a rental earns 1 frequent-renter point no matter how many days
        Customer johnDoe = new Customer("John Doe");
    }
    
    @Test
    public void testStatementChildrensMovieOnly() {
        // childrens' movies cost $1.50 for the first 3 days, and $1.25/day thereafter
        // a rental earns 1 frequent-renter point no matter how many days
        Customer johnDoeJr = new Customer("Johnny Doe, Jr.");
    }
    
}
