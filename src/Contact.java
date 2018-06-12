// Project:		FINAL
// Class:		Java Programming
// Date:                12/6/17
// Author:              Seth Rzeszutek
// Description:         To complete the discription of the Final

public abstract class Contact implements Comparable<Contact> {
    private String name;
    private String phone;
    private String email;
    private Address address;
    private Type contactType;
    
    
    private static int count = 0;
    
    public static void countDown()
    {
        --count;
    }
    
    public static void restartCount()
    {
        count=0;
    } 
    
    public Contact(String name, String phone, String email, String street, String city, String state, String zip,
            Type contactType) throws ContactException
    {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = new Address(street, city, state, zip);
        this.contactType = contactType; //declare new contactType variable
        
        // code to increment the static student counter
        ++count;
    }

    // format saved in string
    public String toFile()
    {
        return name + "," + phone + "," + email + "," + address.toFile() + "," + contactType;
    } 
    
    public String getName()
    {
        return name;
    }

    public void setName(String firstName)
    {
        this.name = firstName;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getType()
    {
        return contactType.toString();
    }
    
    public int getType(String input)
    {
        if(input == "BUSINESS")
        {
            this.contactType = Type.BUSINESS;
            return 0;
            
        }
        else if(input == "FAMILY")
        {
            this.contactType = Type.FAMILY;
            return 1;
        }
        else if(input == "FRIEND")
        {
            this.contactType = Type.FRIEND;
            return 2;
        }
        return 0;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public static int getCount()
    {
        return count;
    }
    
    // public method to return lastName, firstName
  
    public String toString()  //display
    {
        // the address object will be converted to string by calling its tostring method.
        return name + ", " + phone + ", "+ email + ", " + address + ", " + contactType;
    }
    
    @Override
    public int compareTo(Contact contactObj)
    {
        return this.name.compareTo(contactObj.getName());
    }
    
    
    
    
    private class Address 
    {
        private String street;
        private String city;
        private String state;
        private String zip;

        

        public Address(String initStreet, String initCity, String initState, 
                String initZip) throws ContactException
        {
            city = initCity;
            street = initStreet;
            state = initState;
            zip = initZip;
            
            validateStreet();
            validateCity();
            validateState();
            validateZip();
        }
        public String getStreet()
        {
            return street;
        }

        public void setStreet(String street)
        {
            this.street = street;
            validateStreet();
        }

        public String getCity()
        {
            return city;
        }

        public void setCity(String city)
        {
            this.city = city;
            validateCity();
        }

        public String getState()
        {
            return state;
        }

        public void setState(String state) throws ContactException
        {
            this.state = state;
            validateState();
        }

        public String getZip()
        {
            return zip;
        }

        public void setZip(String zip) throws ContactException
        {
            this.zip = zip;
            validateZip();
        }
        
        
                                    //VALIDATIONS//
        //validates Street
        public void validateStreet()
        {
            int length = street.length();       //get length of street
            if(length > 10)
            {   
                street = street.substring(0, 10);    //returns new string with 10 characters
            }
        }
        
        
        //validates City
        public void validateCity()
        {
            //Grabs first letter, converts to uppercase, then addes the rest of the substring
            city = city.substring(0, 1).toUpperCase() + city.substring(1);
        }
        
        
        //validates State
        public void validateState() throws ContactException
        {
            //Change entry to uppercase
            state = state.toUpperCase();
            
            //ContactException for state length
            if(state.length() != 2)
            {
                throw new ContactException("State Entry: Length not 2.");
            }
        }
        
        
        //Gives a string variant of the address to the above toFile()
        public String toFile()
        {
            return street + "," + city + "," + zip + "," + state;
        }   
        
        //Validates Zip
        public void validateZip() throws ContactException
        {
            //ContactException to check Zip length
            if(zip.length() != 5)
            {
                throw new ContactException("Zip Code: Length not 5.");
            }
            //Check zip chararacters are integers
            for (int index = 0; index < zip.length(); ++index)
            {
                if(!Character.isDigit(zip.charAt(index)))
                {
                    throw new ContactException("Zip Code: Not all are numbers.");
                }
            }
        }
        
        // Added a toString method to display the fields in the class
        public String toString()
        {
            return street + ", " + city + ", " + state + ", " + zip;
        }
        
        
    }
    
    //This is our customized 'data' type
    public static enum Type  //decided on Type as a data name type for better understanding
    {
        BUSINESS, FAMILY, FRIEND
    } 



}
