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
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author GILSON
 */
public class MovieRentalTest extends junit.framework.TestCase {
    
    public MovieRentalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    Movie theManWhoKnewTooMuch, mulan, slumdogMillionaire;
    @Before
    public void setUp() {
        theManWhoKnewTooMuch = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
        mulan = new Movie("Mulan", Movie.CHILDRENS);
        slumdogMillionaire = new Movie("Slumdog Millionaire", Movie.NEW_RELEASE);
    }
    
    @Test
    public void testGetPriceCode() {
        assertEquals(Movie.REGULAR, theManWhoKnewTooMuch.getPriceCode());
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetTitle() {
        assertEquals("The Man Who Knew Too Much", theManWhoKnewTooMuch._title);
    }
    
     @Test
    public void testSetPriceCode() {
        theManWhoKnewTooMuch.setPriceCode(Movie.NEW_RELEASE);
        assertEquals(Movie.NEW_RELEASE, theManWhoKnewTooMuch.getPriceCode());
        theManWhoKnewTooMuch.setPriceCode(Movie.REGULAR);
        assertEquals(Movie.REGULAR, theManWhoKnewTooMuch.getPriceCode());
    }
    
    

    /**
     * Test of getDaysRented method, of class MovieRental.
     */
    @Test
    public void testGetDaysRented() {
        assertEquals(2, new MovieRental(theManWhoKnewTooMuch, 2).getDaysRented());
    }

    /**
     * Test of getMovie method, of class MovieRental.
     */
   @Test
    public void testGetMovie() {
        assertEquals(theManWhoKnewTooMuch, new MovieRental(theManWhoKnewTooMuch, 2).getMovie());
    }
    
}
