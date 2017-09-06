package classes;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class Person {

    private static int id;
    private int memberId;
    private int householdId;
    private String firstname;
    private String lastname;
    private String middlename;
    private int ageID;
    private String civilStatus;
    private static String barangay;
    private String gender;
    private String birthdate;
    private String address;
    private String education;
    private String tribe;
    private String occupation;
    public boolean deleted;
    private Vector data;
    private Vector populate;


    private DBConnection dBConnection = new DBConnection();

    
    public Vector getPopulate() {
        return populate;
    }

    public void setPopulate(Vector populate) {
        this.populate = populate;
    }

     public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(int householdId) {
        this.householdId = householdId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAgeID() {
        return ageID;
    }

    public void setAgeID(int ageID) {
        this.ageID = ageID;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public static String getBarangay() {
        return barangay;
    }

    public static void setBarangay(String barangay) {
        Person.barangay = barangay;
    }


    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public Vector getData() {
        return data;
    }

    public void setData(Vector data) {
        this.data = data;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        Person.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }



    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }



    public  void select() {

       try {

       setData(new Vector());
       getData().setSize(0);

            dBConnection.databaseConnection();

            PreparedStatement preparedStatement = dBConnection.connection.prepareStatement
                    ("select id,lastname,firstname,middlename,gender,civilStatus,birthdate,ageID,education,barangay,tribe,occupation,deleted from dan_system.person_info where deleted = 0");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int idl = resultSet.getInt("id");
                String lastnamel = resultSet.getString("lastname");
                String firstnamel = resultSet.getString("firstname");
                String middlenamel = resultSet.getString("middlename");
                String genderl = resultSet.getString("gender");
                String civilStatusl = resultSet.getString("civilStatus");
                String birthdatel = resultSet.getString("birthdate");
                int agel = resultSet.getInt("ageID");
                String educationl = resultSet.getString("education");
                String barangayl = resultSet.getString("barangay");
                String tribel = resultSet.getString("tribe");
                String occupationl = resultSet.getString("occupation");
                boolean deletedl = resultSet.getBoolean("deleted");

             Vector column = new Vector();

                column.add(idl);
                column.add(lastnamel);
                column.add(firstnamel);
                column.add(middlenamel);
                column.add(genderl);
                column.add(civilStatusl);
                column.add(birthdatel);
                column.add(agel);
                column.add(educationl);
                column.add(tribel);
                column.add(barangayl);
                column.add(occupationl);
                column.add(deletedl);

                setMemberId(idl);
                setHouseholdId(idl);

               getData().add(column);

            }

            resultSet.close();
            preparedStatement.close();

         }catch (Exception e) {
            e.printStackTrace();
        }
}


    public void add() {

        try {

            dBConnection.databaseConnection();

            PreparedStatement preparedStatement = dBConnection.connection.prepareStatement("insert into final_system.person_info (lastname, firstname, middlename,gender, civilStatus, birthdate, ageID, education, tribe,barangay, occupation, deleted) values (?,?,?,?,?,?,?,?,?,?,?,?)");

             preparedStatement.setString(1, getLastname());
             preparedStatement.setString(2, getFirstname());
             preparedStatement.setString(3,getMiddlename());
             preparedStatement.setString(4, getGender());
             preparedStatement.setString(5, getCivilStatus());
             preparedStatement.setString(6, getBirthdate());
             preparedStatement.setInt(7, getAgeID());
             preparedStatement.setString(8, getEducation());
             preparedStatement.setString(9, getTribe());
             preparedStatement.setString(10, getBarangay());
             preparedStatement.setString(11, getOccupation());
             preparedStatement.setBoolean(12, isDeleted()) ;

             preparedStatement.execute();
             preparedStatement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
}
    public void update() {

        try {

            dBConnection.databaseConnection();
            PreparedStatement preparedStatement = dBConnection.connection.prepareStatement("update final_system.person_info set lastname = ?,firstname = ?, middlename = ?, gender = ?, civilStatus = ?, birthdate = ?, ageID = ?, education = ?, tribe = ?, barangay = ? ,occupation = ? where id = ?");

             preparedStatement.setString(1, getLastname());
             preparedStatement.setString(2, getFirstname());
             preparedStatement.setString(3,getMiddlename());
             preparedStatement.setString(4, getGender());
             preparedStatement.setString(5, getCivilStatus());
             preparedStatement.setString(6, getBirthdate());
             preparedStatement.setInt(7, getAgeID());
             preparedStatement.setString(8, getEducation());
             preparedStatement.setString(9, getTribe());
             preparedStatement.setString(10, getBarangay());
             preparedStatement.setString(11, getOccupation());
             preparedStatement.setInt(12, getId());

            preparedStatement.execute();
            preparedStatement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public void updateDelete(){

    try {
            dBConnection.databaseConnection();

            PreparedStatement statement = dBConnection.connection.prepareStatement("UPDATE final_system.person_info SET deleted = ? WHERE id = ?");

            statement.setBoolean(1, isDeleted());
            statement.setInt(2, getId());

            statement.execute();
            statement.close();

    } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
   public  void selectBarangay() {

       try {

       setData(new Vector());
       getData().setSize(0);

            dBConnection.databaseConnection();

            PreparedStatement preparedStatement = dBConnection.connection.prepareStatement("select id,lastname,firstname,middlename,gender,civilStatus,birthdate,ageID,education,barangay,tribe,occupation,deleted from final_system.person_info where barangay = " + getBarangay());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int idl = resultSet.getInt("id");
                String lastnamel = resultSet.getString("lastname");
                String firstnamel = resultSet.getString("firstname");
                String middlenamel = resultSet.getString("middlename");
                String genderl = resultSet.getString("gender");
                String civilStatusl = resultSet.getString("civilStatus");
                String birthdatel = resultSet.getString("birthdate");
                int agel = resultSet.getInt("ageID");
                String educationl = resultSet.getString("education");
                String barangayl = resultSet.getString("barangay");
                String tribel = resultSet.getString("tribe");
                String occupationl = resultSet.getString("occupation");
                boolean deletedl = resultSet.getBoolean("deleted");

             Vector column = new Vector();

                column.add(idl);
                column.add(lastnamel);
                column.add(firstnamel);
                column.add(middlenamel);
                column.add(genderl);
                column.add(civilStatusl);
                column.add(birthdatel);
                column.add(agel);
                column.add(educationl);
                column.add(tribel);
                column.add(barangayl);
                column.add(occupationl);
                column.add(deletedl);

                setMemberId(idl);
                setHouseholdId(idl);

               getData().add(column);

            }

            resultSet.close();
            preparedStatement.close();

         }catch (Exception e) {
            e.printStackTrace();
        }
    }

  

}
