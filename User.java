package ErrigalMotor;

import java.sql.Date;

/**
 * The purpose of this class is to create a new user when logging in
 * and maintain logging by later getting the userID using getUserID
 * @version 1.0
 * @author Team 3
 * @since 05/04/19
 */
public class User {

    /**
     * Class variables
     */
    private int userID;
    private String fName;
    private String lName;
    private Date dob;
    private String address;
    private String city;
    private String postcode;
    private String phoneNum;
    private String email;
    private String pass;
    private int accLevel;

    /**
     * Constructor for object class User
     *
     * @param userID
     * @param fName
     * @param lName
     * @param dob
     * @param address
     * @param city
     * @param postcode
     * @param phoneNum
     * @param email
     * @param pass
     * @param accLevel
     */
    public User(int userID, String fName, String lName, Date dob, String address,
            String city, String postcode, String phoneNum,
            String email, String pass, int accLevel) {
        this.userID = userID;
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.address = address;
        this.city = city;
        this.postcode = postcode;
        this.phoneNum = phoneNum;
        this.email = email;
        this.pass = pass;
        this.accLevel = accLevel;
    }

    /**
     * Method that returns the value of the user's ID
     *
     * @return userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Method that returns the value of the user's forename
     *
     * @return fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * Method that sets the value of fName to that of the provided parameter
     *
     * @param fName
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * Method that returns the value of the user's last name
     *
     * @return lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * Method that sets the value of lName to that of the provided parameter
     *
     * @param lName
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * Method that returns the value of the user's date of birth
     *
     * @return dob
     */
    public Date getDate() {
        return dob;
    }

    /**
     * Method that sets the value of dob to that of the provided parameter
     *
     * @param dob
     */
    private void setDate(Date dob) {
        this.dob = dob;
    }

    /**
     * Method that returns the value of the user's address
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Method that sets the value of address to that of the provided parameter
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Method that returns the value of the user's city
     *
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Method that sets the value of city to that of the provided parameter
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Method that returns the value of the user's postcode
     *
     * @return postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Method that sets the value of postcode to that of the provided parameter
     *
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * Method that returns the value of the user's phone number
     *
     * @return phoneNum
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Method that sets the value of phoneNum to that of the provided parameter
     *
     * @param phoneNum
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * Method that returns the value of the user's email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Method that sets the value of email to that of the provided parameter
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Method that returns the value of the user's password
     *
     * @return pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * Method that sets the value of lName to that of the provided parameter
     *
     * @param pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * Method that returns the value of the user's access level
     *
     * @return accLevel
     */
    public int getAccLevel() {
        return accLevel;
    }

    /**
     * Method that sets the value of lName to that of the provided parameter
     *
     * @param accLevel
     */
    public void setAccLevel(int accLevel) {
        this.accLevel = accLevel;
    }

}
