package com.nology.classes_03;

/**
 * -------------- Foundation -----------------
 *
 * The Employee class represents a generic employee.
 *
 * This is a skeleton of a class you will have to complete it by following these steps.
 * - Adding data fields / properties
 * - Adding a constructor
 * - Implementing three methods
 *
 * Each step is documented through the class.
 *
 */

public class Employee {

    public String name;
    public String position;
    public int rating;
    public int yearsEmployed;
    public int completedDeals;
    /**
     * Create 4 public fields:
     * - name is a string
     * - position is a string
     * - rating is a integer
     * - yearsEmployed is a integer
     * - completedDeals is a integer
     */

    /**
     * Complete the constructor below to initialize the class and the data to the fields above.
     */
    public Employee(String name, String position, int rating, int yearsEmployed, int completedDeals) {
        // complete the constructor in here
        this.name = name;
        this.position = position;
        this.rating = rating;
        this.yearsEmployed = yearsEmployed;
        this.completedDeals = completedDeals;
    }

    /**
     * Complete the isPromotable method
     * <p>
     * It needs to check if the employee rating is over 7, if so return true... else false
     *
     * @return boolean if employee is promotable
     */
    public boolean isPromotable() {
        if (rating > 7) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Complete the calculateDealsPerYear method
     * <p>
     * It needs to calculate the average number of deals completed  each year since they have joined the company.
     *
     * @return int average deals per year
     */
    public int calculateDealsPerYear() {
        int averageDeals = completedDeals / yearsEmployed;
        return averageDeals;
    }

    /**
     * Complete the hasBonusQualification method
     * <p>
     * It needs to check if the employee is able to get a bonus.
     * <p>
     * To get a bonus:
     * - They need a rating above 8.
     * - They need a deals per year average greater than or equal to 20.
     *
     * @return boolean if they are eligible for a bonus
     */
    public boolean hasBonusQualification() {

        if (rating > 8 && calculateDealsPerYear() >= 20) {
            return true;
        } else {
            return false;
        }
    }
}
