// Project:		FINAL
// Class:		Java Programming
// Date:                12/6/17
// Author:              Seth Rzeszutek
// Description:         To complete the discription of the Final
public class ContactFriend extends Contact
{
    //Private field in ContactFriend
    private Integer yearMet;

    public ContactFriend(String name, String street, String city, String state, 
            String zip, String email, String phone, Contact.Type contactType, Integer yearMet) throws ContactException
    {
        super(name, street, city, state, zip, email, phone, contactType);

        this.yearMet = yearMet;

    }

    @Override
    public String toString()
    {
        return super.toString() + ", " + yearMet;
    }
    
    public String toFile()
    {
        return super.toFile() + "," + yearMet;
    } 

}

