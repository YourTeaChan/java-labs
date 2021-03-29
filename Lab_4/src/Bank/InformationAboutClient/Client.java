package Bank.InformationAboutClient;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class Client {
    private String firstName;
    private String secondName;
    private int age;
    private String citizenship;
    private boolean education;
    private boolean isMarried;
    private String workPlace;
    private boolean permanentJob;
    private double financialPosition;
    private boolean availabilityOfRealEstate;
    private double realEstateValue;
    private int creditHistory;

    public Client(){
        this.firstName = "";
        this.secondName = "";
        this.age = 0;
        this.citizenship = "";
        this.education = false;
        this.isMarried = false;
        this.workPlace = "";
        this.permanentJob = false;
        this.financialPosition = 0.0;
        this.availabilityOfRealEstate = false;
        this.realEstateValue = 0.0;
        this.creditHistory = 0;
    }
    public Client(String firstName, String secondName, int age, String citizenship, boolean education,
                  boolean isMarried, String workPlace, boolean permanentJob, double financialPosition,
                  boolean availabilityOfRealEstate, double realEstateValue, int creditHistory) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.citizenship = citizenship;
        this.education = education;
        this.isMarried = isMarried;
        this.workPlace = workPlace;
        this.permanentJob = permanentJob;
        this.financialPosition = financialPosition;
        this.availabilityOfRealEstate = availabilityOfRealEstate;
        this.realEstateValue = realEstateValue;
        this.creditHistory = creditHistory;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws ValueException {
        if(firstName.isEmpty()){
            throw new ValueException("Empty line of first name");
        }
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) throws ValueException {
        if(secondName.isEmpty()){
            throw new ValueException("Empty line of second name");
        }
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws ValueException{
        if(age < 0 || age > 100){
            throw new ValueException("Incorrect value of age");
        }
        this.age = age;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) throws ValueException {
        if(citizenship.isEmpty()){
            throw new ValueException("Empty line of citizenship");
        }
        this.citizenship = citizenship;
    }

    public boolean getEducation() {
        return education;
    }

    public void setEducation(boolean education){
        this.education = education;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) throws ValueException {
        if(workPlace.isEmpty()){
            throw new ValueException("Empty line of work place");
        }
        this.workPlace = workPlace;
    }

    public boolean isPermanentJob() {
        return permanentJob;
    }

    public void setPermanentJob(boolean permanentJob) {
        this.permanentJob = permanentJob;
    }

    public double getFinancialPosition() {
        return financialPosition;
    }

    public void setFinancialPosition(double financialPosition) throws ValueException{
        if(financialPosition < 0.0){
            throw new ValueException("Incorrect value of financial position");
        }
        this.financialPosition = financialPosition;
    }

    public boolean isAvailabilityOfRealEstate() {
        return availabilityOfRealEstate;
    }

    public void setAvailabilityOfRealEstate(boolean availabilityOfRealEstate) {
        this.availabilityOfRealEstate = availabilityOfRealEstate;
    }

    public double getRealEstateValue() {
        return realEstateValue;
    }

    public void setRealEstateValue(double realEstateValue) throws ValueException {
        if(realEstateValue < 0.0){
            throw new ValueException("Incorrect value of real estate value");
        }
        this.realEstateValue = realEstateValue;
    }

    public int getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(int creditHistory) throws ValueException {
        if(creditHistory < 0 || creditHistory > 3){
            throw new ValueException("Incorrect value of credit history");
        }
        this.creditHistory = creditHistory;
    }

    @Override
    public String toString() {
        return "Client[" +
                "first name: '" + firstName + '\'' +
                ", second name: '" + secondName + '\'' +
                ", age: " + age +
                ",\n\t\t\t\t\tcitizenship: '" + citizenship + '\'' +
                ", education: " + education +
                ",\n\t\t\t\t\tmarried: " + isMarried +
                ", work place: '" + workPlace + '\'' +
                ", permanent job: " + permanentJob +
                ",\n\t\t\t\t\tfinancial position: " + financialPosition +
                ", availability of real estate: " + availabilityOfRealEstate +
                ", real estate value: " + realEstateValue +
                ", creditHistory: " + creditHistory +
                ']';
    }
}