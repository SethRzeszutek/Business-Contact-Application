// Project:		FINAL
// Class:		Java Programming
// Date:                12/6/17
// Author:              Seth Rzeszutek
// Description:         To complete the discription of the Final

public class ContactBusiness extends Contact
{
    //Private field in ContactBusiness
    private String company;

    public ContactBusiness(String name, String street, String city, String state, 
            String zip, String email, String phone, Contact.Type contactType, String company) throws ContactException
    {
        super(name, street, city, state, zip, email, phone, contactType);

        this.company = company;

    }

    @Override
    public String toString()
    {
        return super.toString() + ", " + company;
    }   
    
    public String toFile()
    {
        return super.toFile() + "," + company;
    } 
}
