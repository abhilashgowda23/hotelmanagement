package hotelmanagement;

public class Guest {
  private final String id;
  private final String name;
  private final String email;
  private final String phonenumber;

  public Guest(String id, String name, String email, String phonenumber){
    this.id = id;
    this.name = name;
    this.email = email;
    this.phonenumber = phonenumber;
  }

  public String getId(){
    return id;
  }

  public String getName(){
    return name;
  }

  public String getEmail(){
    return email;
  }

  public String getPhoneNumber(){
    return phonenumber;
  }
                    
}
