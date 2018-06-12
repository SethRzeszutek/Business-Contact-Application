// Project:		FINAL
// Class:		Java Programming
// Date:                12/6/17
// Author:              Seth Rzeszutek
// Description:         To complete the discription of the Final

public class ContactFamily extends Contact
{
    //Private field in ContactFamily
    private String relationship;

    public ContactFamily(String name, String street, String city, String state, String zip, 
            String email, String phone, Contact.Type contactType, String relationship)  throws ContactException
    {
        super(name, street, city, state, zip, email, phone, contactType);

        this.relationship = relationship;

    }

    @Override
    public String toString()
    {
        return super.toString() + ", " + relationship;
    }
    
    public String toFile()
    {
        return super.toFile() + "," + relationship;
    } 

}
