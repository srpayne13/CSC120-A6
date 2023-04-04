import java.util.Hashtable;
/* This is a stub for the Library class */
public class Library extends Building {
  
  private Hashtable<String, Boolean> collection;
   
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>(); 
    System.out.println("You have built a library: 📖");
    }

  public void addTitle(String title) {
    if (this.collection.containsKey(title)) {
      throw new RuntimeException(title + " is already in the library's collection.");
    }
    this.collection.put(title, true);
    System.out.println(title + " has been added to the library's collection.");
  }

  public String removeTitle(String title) {
    if (this.collection.containsKey(title)) {
      this.collection.remove(title);
    } else {
      throw new RuntimeException(title + " does not exist in the library's collection.");
    }
    return title;
  }

  public void checkOut(String title) {
    if (this.collection.contains(true)) {
      this.collection.replace(title, true, false);
    } else {
      throw new RuntimeException(title + " has already been checked out of the library. Check back later!");
    }
    System.out.println("You have checked out " + title + ". Happy reading!");
  }
  
  public void returnBook(String title) {
    if (this.collection.contains(false)) {
      this.collection.replace(title, false, true);
    } else {
      throw new RuntimeException(title + " is already in the library's collection.");
    }
    System.out.println("You have returned " + title + ". Thanks!");
  }

  public boolean containsTitle(String title) {
    if (this.collection.containsKey(title)) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isAvailable(String title) {
    if (this.collection.containsValue(true)) {
      return true;
    } else {
      return false;
    }
  }

  public void printCollection() {
    System.out.println(this.collection.toString());
  }

  public static void main(String[] args) {
      Library library = new Library("Neilson", "7 Neilson Drive", 5);
      System.out.println(library);
      library.addTitle("'The Lorax' by Dr. Seuss");
      library.checkOut("'The Lorax' by Dr. Seuss");
    }
  }